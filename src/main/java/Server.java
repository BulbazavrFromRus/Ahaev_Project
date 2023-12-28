import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.controller.GroupController;
import org.example.controller.StudentController;
import org.example.converters.group.GroupConverter;
import org.example.converters.student.AddStudentConverter;
import org.example.converters.student.EditStudentConverter;
import org.example.database.DataBase;
import org.example.handlers.HandlerException;
import org.example.handlers.IHandler;
import org.example.repository.IGroupRepository;
import org.example.repository.IStudentRepository;
import org.example.repository.RepositoryGroup;
import org.example.repository.StudentRepository;
import org.example.request.group.GetGroupByIdRequest;
import org.example.services.group.GroupService;
import org.example.services.group.IGroupService;
import org.example.services.student.IStudentServices;
import org.example.services.student.StudentService;
import org.example.validators.IdRequestValidator;
import org.example.validators.ValidatorRequest;
import org.example.validators.entity.group.ValidatorAddGroupRequest;
import org.example.validators.entity.group.ValidatorEditGroupRequest;
import org.example.validators.entity.student.ValidatorAddStudentRequest;
import org.example.validators.entity.student.ValidatorEditStudentRequest;
import org.example.validators.primitivevalidator.ValidatorId;
import org.example.validators.primitivevalidator.ValidatorNonEmptyStringAndMaxLength;
import org.example.validators.primitivevalidator.ValidatorStatus;

import java.util.Map;

public class Server {

    //Common variable
    private IdRequestValidator validatorGetById;
    private ValidatorId validatorId;

    private ValidatorNonEmptyStringAndMaxLength validatorNonEmptyStringAndMaxLength;

    private DataBase dataBase;
    private ObjectMapper objectMapper;
    private Map<String, IHandler> handlers;


    //For group
    private ValidatorAddGroupRequest validatorAddGroupRequest;
    private ValidatorEditGroupRequest validatorEditGroupRequest;

    private IGroupService groupService;

    private IGroupRepository iGroupRepository;
    private GroupConverter groupConverter;
    private RepositoryGroup repositoryGroup;
    private GroupController groupController;


    //For student
    private ValidatorAddStudentRequest validatorAddStudentRequest;
    private ValidatorEditStudentRequest validatorEditStudentRequest;

    private StudentController studentController;

    private AddStudentConverter addStudentConverter;
    private EditStudentConverter editStudentConverter;

    private IStudentServices studentServices;

    private IStudentRepository iStudentRepository;

    private StudentRepository studentRepository;


    public void init() {

        validatorId = new ValidatorId();
        validatorNonEmptyStringAndMaxLength = new ValidatorNonEmptyStringAndMaxLength();
        validatorGetById = new IdRequestValidator(validatorId);

        //For group

        validatorAddGroupRequest = new ValidatorAddGroupRequest(validatorNonEmptyStringAndMaxLength);
        validatorEditGroupRequest=  new ValidatorEditGroupRequest(validatorNonEmptyStringAndMaxLength);

        groupService = new GroupService(iGroupRepository, groupConverter);
        groupController = new GroupController(
                validatorAddGroupRequest,
                validatorEditGroupRequest,
                validatorGetById,
                groupService
        );


        dataBase = new DataBase();
        repositoryGroup = new RepositoryGroup(dataBase);


        //For student
        validatorAddStudentRequest = new ValidatorAddStudentRequest(validatorNonEmptyStringAndMaxLength);
        validatorEditGroupRequest = new ValidatorEditGroupRequest(validatorNonEmptyStringAndMaxLength);

        studentServices = new StudentService(iStudentRepository, addStudentConverter,editStudentConverter);
        
        studentController = new StudentController(validatorAddStudentRequest,
                validatorEditStudentRequest,
                validatorGetById,
                studentServices);

        studentRepository  = new StudentRepository(dataBase);


    }


    public String accept(String json, String endPoint){
         IHandler handler = handlers.get(endPoint);
          String response;



             if (handler == null) {
                 response = "{\"httpStatus\":404, \"data\": {\"codeError\":1, \"errorMessage\":\"end point not found\"}}";

             }
             else {
                 try{
                     response =  handler.handle(json);
                 }
                 catch (HandlerException e){
                     response = "{\"httpStatus\":422, \"data\": {\"codeError\":3, \"errorMessage\":\"unable to process request\"}}";

                 }

             }

         return response;

    }

}
