package org.example.handlers.student;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.controller.GroupController;
import org.example.controller.StudentController;
import org.example.handlers.HandlerException;
import org.example.handlers.IHandler;
import org.example.request.student.EditStudentRequest;
import org.example.responses.CommonResponse;
import org.example.responses.ResponseEntity;
import org.example.responses.group_response.EditGroupResponse;
import org.example.responses.student_response.AddStudentResponse;
import org.example.responses.student_response.EditStudentResponse;

public class EditStudentHandler implements IHandler {
     private StudentController studentController;

     private ObjectMapper objectMapper;

    public EditStudentHandler(StudentController studentController, ObjectMapper objectMapper) {
        this.studentController = studentController;
        this.objectMapper = objectMapper;
    }

    @Override
    public String handle(String str) throws HandlerException {
        try {
            EditStudentRequest editStudentRequest = objectMapper.readValue(str, EditStudentRequest.class);

            studentController.editStudent(editStudentRequest);

            ResponseEntity<CommonResponse<EditGroupResponse>> response = studentController.editStudent(editStudentRequest);

            String json = objectMapper.writeValueAsString(response);
            return json;

        } catch (JsonProcessingException e) {
            throw new HandlerException("Unable to handle: can not to desiarilize body");
        }

    }
}
