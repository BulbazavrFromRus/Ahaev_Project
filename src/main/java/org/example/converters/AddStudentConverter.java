package org.example.converters;

import org.example.entities.Student;
import org.example.request.student.AddStudentRequest;

public class AddStudentConverter {
    public Student toEntity(AddStudentRequest request){
        return new Student(request.getGroupId(),
                request.getFirstName(),
                request.getLastName(),
                request.getMiddleName(),
                request.getGroupId(),
                request.getStatus());
    }



}
