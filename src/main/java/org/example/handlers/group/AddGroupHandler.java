package org.example.handlers.group;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.controller.GroupController;
import org.example.controller.StudentController;
import org.example.handlers.HandlerException;
import org.example.handlers.IHandler;
import org.example.request.group.AddGroupRequest;
import org.example.request.student.AddStudentRequest;
import org.example.responses.CommonResponse;
import org.example.responses.ResponseEntity;
import org.example.responses.group_response.AddGroupResponse;
import org.example.responses.student_response.AddStudentResponse;

public class AddGroupHandler implements IHandler {
    private GroupController groupController;
    private ObjectMapper objectMapper;

    public AddGroupHandler(GroupController groupController, ObjectMapper objectMapper) {
        this.groupController = groupController;
        this.objectMapper = objectMapper;
    }

    public String handle(String str) throws HandlerException {

        try {
            AddGroupRequest addGroupRequest = objectMapper.readValue(str, AddGroupRequest.class);

            groupController.addGroup(addGroupRequest);

            ResponseEntity<CommonResponse<AddGroupResponse>> response  =  groupController.addGroup(addGroupRequest);

            String json = objectMapper.writeValueAsString(response);
            return json;
        }catch (JsonProcessingException e)
        {
            throw new HandlerException("Unable to handle: can not to desiarilize body");
        }
    }
}
