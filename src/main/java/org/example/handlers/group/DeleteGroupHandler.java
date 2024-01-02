/*
package org.example.handlers.group;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.controller.GroupController;
import org.example.handlers.HandlerException;
import org.example.handlers.IHandler;
import org.example.request.IdRequest;
import org.example.request.group.EditGroupRequest;
import org.example.responses.CommonResponse;
import org.example.responses.ResponseEntity;
import org.example.responses.group_response.DeleteGroupResponse;
import org.example.responses.group_response.EditGroupResponse;

public class DeleteGroupHandler implements IHandler {
    private GroupController groupController;
    private ObjectMapper objectMapper;

    public DeleteGroupHandler(GroupController groupController, ObjectMapper objectMapper) {
        this.groupController = groupController;
        this.objectMapper = objectMapper;
    }

    public String handle(String str) throws HandlerException {

        try {
            IdRequest deleteGroupRequest = objectMapper.readValue(str, IdRequest.class);

            groupController.getById(deleteGroupRequest);

            ResponseEntity<CommonResponse<DeleteGroupResponse>> response  =  groupController.deleteGroup(deleteGroupRequest);

            String json = objectMapper.writeValueAsString(response);
            return json;
        }catch (JsonProcessingException e)
        {
            throw new HandlerException("Unable to handle: can not to desiarilize body");
        }
    }
}
*/
