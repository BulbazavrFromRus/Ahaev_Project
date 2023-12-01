package org.example.services.student;

import org.example.classrequest.DeleteLessonRequest;
import org.example.entities.Student;
import org.example.request.student.AddStudentRequest;
import org.example.request.student.EditStudentRequest;
import org.example.request.student.GetAllStudentRequest;
import org.example.request.student.GetStudentByIdRequest;
import org.example.request.student.GetStudentByIdRequest;

import java.util.List;

public class StudentService implements IStudentServices{
    @Override
    public long addStudent(AddStudentRequest addStudentRequest) {
        return 0;
    }

    @Override
    public void editStudent(EditStudentRequest editStudentRequest) {

    }

    @Override
    public void deleteStudent(DeleteLessonRequest deleteLessonRequest) {

    }

    @Override
    public List<Student> getStudentsByIdGroup(GetAllStudentRequest getAllStudentRequest) {
        return null;
    }

    @Override
    public Student getStudentById(GetStudentByIdRequest getStudentById) {
        return null;
    }
}
