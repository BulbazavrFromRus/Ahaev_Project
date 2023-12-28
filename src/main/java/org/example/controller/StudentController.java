package org.example.controller;

import org.example.entities.Student;
import org.example.request.IdRequest;
import org.example.request.student.AddStudentRequest;
import org.example.request.student.EditStudentRequest;
import org.example.request.student.GetStudentByIdRequest;
import org.example.responses.CommonResponse;
import org.example.responses.ResponseEntity;
import org.example.responses.group_response.EditGroupResponse;
import org.example.responses.group_response.GetGroupByIdResponse;
import org.example.responses.student_response.AddStudentResponse;
import org.example.responses.student_response.DeleteStudentResponse;
import org.example.responses.student_response.GetStudentByIdResponse;
import org.example.services.student.IStudentServices;
import org.example.validators.ValidatorRequest;

import java.util.List;

public class StudentController {
       private ValidatorRequest<AddStudentRequest> addStudentRequestValidatorRequest;
       private ValidatorRequest<EditStudentRequest> editStudentRequestValidatorRequest;
       private ValidatorRequest<IdRequest> getStudentByIdValidatorRequest;
       private IStudentServices iStudentService;

    public StudentController(ValidatorRequest<AddStudentRequest> addStudentRequestValidatorRequest,
                             ValidatorRequest<EditStudentRequest> editStudentRequestValidatorRequest,
                             ValidatorRequest<IdRequest> getStudentByIdValidatorRequest,
                             IStudentServices iStudentService) {
        this.addStudentRequestValidatorRequest = addStudentRequestValidatorRequest;
        this.editStudentRequestValidatorRequest = editStudentRequestValidatorRequest;
        this.getStudentByIdValidatorRequest = getStudentByIdValidatorRequest;
        this.iStudentService = iStudentService;
    }

    public ResponseEntity<CommonResponse<AddStudentResponse>> addStudent(AddStudentRequest request){
           CommonResponse<AddStudentResponse> response;
           int httpStatus = 201;

           //create list errors
           List<String> errors = addStudentRequestValidatorRequest.validate(request);

           if(errors.isEmpty()){
               System.out.println("Student was added");

               try{
                   response = new CommonResponse<>(
                           new AddStudentResponse(iStudentService.addStudent(request))

                   );
               }catch (Exception e) {
                   response = new CommonResponse<>(1, "Unable to add student", null);
                   httpStatus = 422;
               }
           }
           else{
               response = new CommonResponse<>(2, "Validations errors while adding student", errors);
               httpStatus = 400;
           }

           return new ResponseEntity<>(httpStatus, response);
       }

       public ResponseEntity<CommonResponse<EditGroupResponse>> editStudent(EditStudentRequest request){
           CommonResponse<EditGroupResponse> response;
           List<String> errors = editStudentRequestValidatorRequest.validate(request);
           int httpStatus = 201;

           if(errors.isEmpty()){
               System.out.println("Student was successfully edited");

               try{
                   response = new CommonResponse<>(null);
                   httpStatus = 401;
               }catch(Exception e){
                   response = new CommonResponse<>(1, "Unable to edit student", null);
                   httpStatus = 422;
               }
           }
           else{
               response = new CommonResponse<>(2, "Validations errors while editing student", errors);
               httpStatus = 400;
           }
           return new ResponseEntity<>(httpStatus, response);
       }

       public ResponseEntity<CommonResponse<GetStudentByIdResponse>> getStudentById(IdRequest request){
           CommonResponse<GetStudentByIdResponse> response;
           List<String> errors = getStudentByIdValidatorRequest.validate(request);
           int httpStatus = 201;

           if(errors.isEmpty()){
               System.out.println("We delete student by id");

               try{

                   //we can return all fields of student
                   response = new CommonResponse<>(new GetStudentByIdResponse(null));
                   httpStatus = 401;

               }catch(Exception e){
                   response = new CommonResponse<>(1, "Unable to get student by id", null);
                   httpStatus = 422;
               }
           }
           else{
               response = new CommonResponse<>(2, "Validations errors while getting student", errors);
               httpStatus = 400;
           }

           return new ResponseEntity<>(httpStatus, response);
       }

       public ResponseEntity<CommonResponse<DeleteStudentResponse>> deleteStudentById(IdRequest request) {
        CommonResponse<DeleteStudentResponse> response;

           List<String> errors = getStudentByIdValidatorRequest.validate(request);
           int httpStatus = 201;

           if(errors.isEmpty()){
               System.out.println("We successfully deleted student by id");

               try{

                   //we can return all fields of student
                   response = new CommonResponse<>(null);
                   httpStatus = 401;

               }catch(Exception e){
                   response = new CommonResponse<>(1, "Unable to delete student by id", null);
                   httpStatus = 422;
               }
           }
           else{
               response = new CommonResponse<>(2, "Validations errors while deleting student", errors);
               httpStatus = 400;
           }

           return new ResponseEntity<>(httpStatus, response);

       }

}
