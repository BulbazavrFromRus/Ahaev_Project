package org.example.handlers.student;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.controller.StudentController;
import org.example.handlers.HandlerException;
import org.example.handlers.IHandler;
import org.example.request.student.AddStudentRequest;
import org.example.responses.CommonResponse;
import org.example.responses.ResponseEntity;
import org.example.responses.student_response.AddStudentResponse;

public class AddStudentHandler implements IHandler {
    private StudentController studentController;
    private ObjectMapper objectMapper;

    public AddStudentHandler(StudentController studentController, ObjectMapper objectMapper) {
        this.studentController = studentController;
        this.objectMapper = objectMapper;
    }

    public String handle(String str) throws HandlerException {

        try {
            AddStudentRequest addStudentRequest = objectMapper.readValue(str, AddStudentRequest.class);

            studentController.addStudent(addStudentRequest);

            ResponseEntity<CommonResponse<AddStudentResponse>> response  =  studentController.addStudent(addStudentRequest);

            String json = objectMapper.writeValueAsString(response);
            return json;
        }catch (JsonProcessingException e)
        {
            throw new HandlerException("Unable to handle: can not to desiarilize body");
        }
    }


}
