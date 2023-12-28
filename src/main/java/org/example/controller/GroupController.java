package org.example.controller;

import org.example.entities.GroupStudent;
import org.example.request.IdRequest;
import org.example.request.group.AddGroupRequest;
import org.example.request.group.EditGroupRequest;
import org.example.request.group.GetGroupByIdRequest;
import org.example.responses.CommonResponse;
import org.example.responses.ResponseEntity;
import org.example.responses.group_response.AddGroupResponse;
import org.example.responses.group_response.EditGroupResponse;
import org.example.responses.group_response.GetGroupByIdResponse;
import org.example.services.group.IGroupService;
import org.example.validators.ValidatorRequest;

import java.util.List;

public class GroupController {
      private ValidatorRequest<AddGroupRequest> addGroupRequestValidatorRequest;
      private ValidatorRequest<EditGroupRequest> editGroupRequestValidatorRequest;
      private ValidatorRequest<IdRequest> getGroupByIdValidatorRequest;

      private IGroupService iGroupService;


      public GroupController(ValidatorRequest<AddGroupRequest> addGroupRequestValidatorRequest,
                             ValidatorRequest<EditGroupRequest> editGroupRequestValidatorRequest,
                             ValidatorRequest<IdRequest> getGroupByIdValidatorRequest,
                             IGroupService iGroupService) {
            this.addGroupRequestValidatorRequest = addGroupRequestValidatorRequest;
            this.editGroupRequestValidatorRequest = editGroupRequestValidatorRequest;
            this.getGroupByIdValidatorRequest = getGroupByIdValidatorRequest;
            this.iGroupService = iGroupService;
      }

      //создаём метод, который будет возвращать ответ от сервера, который увидит пользователь
      //помещаем в ResponseEntity CommonResponse, тем самым указывая на то что будет возвращать там сервер
      //далее помещаем AddGroupResponse , т.е ответ от сервера, который который должен получить пользователь при добавлении
      //в параметрах указываем запрос на добавление
      public ResponseEntity<CommonResponse<AddGroupResponse>> addGroup(AddGroupRequest request) {

            CommonResponse<AddGroupResponse> response;
            int httpStatus=201;

            List<String> errors = addGroupRequestValidatorRequest.validate(request);

            if(errors.isEmpty()){
                  System.out.println("Group was added");
                  //call some add group servic
                  try{
                     response = new CommonResponse<>(
                             new AddGroupResponse(iGroupService.addGroup(request))
                     );
                  }catch (Exception e){
                  response = new CommonResponse<>(1, "Unable to add group", null);
                  httpStatus = 422;
                  }
            }
            else{
               response = new CommonResponse<>(2, "Validations errors while adding group", errors);
               httpStatus =400;
            }

            return new ResponseEntity<>(httpStatus, response);
      }

      public ResponseEntity<CommonResponse<EditGroupResponse>> editGroup(EditGroupRequest request){
            CommonResponse<EditGroupResponse> response;
            int httpStatus = 201;
            List<String> errors = editGroupRequestValidatorRequest.validate(request);

            if(errors.isEmpty()){
                  System.out.println("You can successfully edit group");

                  try{
                        response = new CommonResponse<>(null);

                  }catch (Exception e){
                        response = new CommonResponse<>(1, "Unable to edit person", null);
                        httpStatus =422;
                  }
            }
            else {
                  response = new CommonResponse<>(2, "Validations errors while editing group", errors);
                  httpStatus = 400;
            }
            return new ResponseEntity<>(httpStatus, response);
      }


      public ResponseEntity<CommonResponse<GetGroupByIdResponse>> getById(IdRequest request){
            List<String> errors = getGroupByIdValidatorRequest.validate(request);
            CommonResponse<GetGroupByIdResponse> response;
            int httpStatus = 201;

            if(errors.isEmpty()){
                  System.out.println("You can successfully edit group");

                  try{
                        GroupStudent group =  iGroupService.getGroupById(request.getId());
                        response = new CommonResponse<>(
                                new GetGroupByIdResponse(group.getGroupName(), group.getId()));

                  }catch (Exception e){
                        response = new CommonResponse<>(1, "Unable to edit person", null);
                        httpStatus =422;
                  }
            }
            else {
                  response = new CommonResponse<>(2, "Validations errors while editing group", errors);
                  httpStatus = 400;
            }
            return new ResponseEntity<>(httpStatus, response);
      }
}
