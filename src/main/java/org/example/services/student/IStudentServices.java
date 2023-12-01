package org.example.services.student;

import org.example.classrequest.DeleteLessonRequest;
import org.example.entities.Student;
import org.example.request.student.AddStudentRequest;
import org.example.request.student.EditStudentRequest;
import org.example.request.student.GetAllStudentRequest;
import org.example.request.student.GetStudentByIdRequest;
import org.example.request.student.GetStudentByIdRequest;

import java.util.List;

public interface IStudentServices {
    long addStudent(AddStudentRequest addStudentRequest);
    void editStudent(EditStudentRequest editStudentRequest);
    void deleteStudent(DeleteLessonRequest deleteLessonRequest);
    List<Student> getStudentsByIdGroup(GetAllStudentRequest getAllStudentRequest);

    Student getStudentById(GetStudentByIdRequest getStudentByIdRequest);
}
