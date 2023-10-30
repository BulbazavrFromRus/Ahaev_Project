package org.example.controller;

import org.example.entities.GroupStudent;
import org.example.request.group.AddGroupRequest;
import org.example.validators.entity.group.ValidatorAddGroupRequest;

public class GroupController {
      public void returnQueryAdd(AddGroupRequest request){
            ValidatorAddGroupRequest validatorAddGroupRequest = new ValidatorAddGroupRequest();

            try {
                  validatorAddGroupRequest.validate(request);
                  System.out.println("Everything okay");
            }catch(Exception e) {
                  System.out.println("You have some problems");
            }
            }
}
