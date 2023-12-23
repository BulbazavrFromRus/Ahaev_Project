import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.converters.group.GroupConverter;
import org.example.database.DataBase;
import org.example.handlers.HandlerException;
import org.example.handlers.IHandler;
import org.example.repository.IGroupRepository;
import org.example.repository.RepositoryGroup;
import org.example.responses.CommonResponse;
import org.example.responses.ResponseEntity;
import org.example.services.group.GroupService;
import org.example.validators.ValidatorRequest;
import org.example.validators.entity.group.ValidatorAddGroupRequest;
import org.example.validators.entity.group.ValidatorEditGroupRequest;
import org.example.validators.primitivevalidator.ValidatorId;
import org.example.validators.primitivevalidator.ValidatorNonEmptyStringAndMaxLength;
import org.example.validators.primitivevalidator.ValidatorStatus;

import java.util.Map;

public class Server {

    private ValidatorId validatorId;
    //private ValidatorStatus validatorStatus;
    private ValidatorNonEmptyStringAndMaxLength validatorNonEmptyStringAndMaxLength;
    private ValidatorAddGroupRequest validatorAddGroupRequest;
    private ValidatorEditGroupRequest validatorEditGroupRequest;

    private GroupService groupService;

    private DataBase dataBase;
    private ObjectMapper objectMapper;

    private IGroupRepository iGroupRepository;
    private GroupConverter groupConverter;
    private RepositoryGroup repositoryGroup;


    private Map<String, IHandler> handlers;




    public void init() {

        validatorAddGroupRequest = new ValidatorAddGroupRequest(validatorNonEmptyStringAndMaxLength);
        validatorId = new ValidatorId();
        validatorNonEmptyStringAndMaxLength = new ValidatorNonEmptyStringAndMaxLength();
        validatorEditGroupRequest=  new ValidatorEditGroupRequest(validatorNonEmptyStringAndMaxLength);
        groupService = new GroupService(iGroupRepository, groupConverter);





        dataBase = new DataBase();
        repositoryGroup = new RepositoryGroup(dataBase);





    }


    public String accept(String body, String endPoint){
         IHandler handler = handlers.get(endPoint);
          String response;



             if (handler == null) {
                 response = "{\"httpStatus\":404, \"data\": {\"codeError\":1, \"errorMessage\":\"end point not found\"}}";

             }
             else {
                 try{
                     response =  handler.handle(body);
                 }
                 catch (HandlerException e){
                     response = "{\"httpStatus\":422, \"data\": {\"codeError\":3, \"errorMessage\":\"unable to process request\"}}";

                 }

             }


         return response;


    }


}
