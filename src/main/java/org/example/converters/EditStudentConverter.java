package org.example.converters;

import org.example.entities.Student;
import org.example.request.student.AddStudentRequest;
import org.example.request.student.EditStudentRequest;

public class EditStudentConverter {
    public Student toEntity(EditStudentRequest request){
        return new Student(request.getGroupId(),
                request.getFirstName(),
                request.getLastName(),
                request.getMiddleName(),
                request.getGroupId(),
                request.getStatus());
    }
}
