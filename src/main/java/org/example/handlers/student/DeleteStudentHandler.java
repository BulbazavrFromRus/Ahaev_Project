package org.example.handlers.student;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.controller.StudentController;
import org.example.handlers.HandlerException;
import org.example.handlers.IHandler;

public class DeleteStudentHandler implements IHandler {
    private StudentController studentController;
    private ObjectMapper objectMapper;

    public DeleteStudentHandler(StudentController studentController, ObjectMapper objectMapper) {
        this.studentController = studentController;
        this.objectMapper = objectMapper;
    }


    @Override
    public String handle(String str) throws HandlerException {
        return "";
    }
}
