package org.example.converters.student;

import org.example.entities.Student;
import org.example.request.student.AddStudentRequest;

public class AddStudentConverter {
    public Student toEntity(AddStudentRequest request){
        return new Student(
                request.getFirstName(),
                request.getLastName(),
                request.getMiddleName(),
                request.getGroupId(),
                request.getStatus());
    }

}
