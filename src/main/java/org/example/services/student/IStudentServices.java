package org.example.services.student;

import org.example.classrequest.DeleteLessonRequest;
import org.example.entities.Student;
import org.example.repository.RepositoryException;
import org.example.request.IdRequest;
import org.example.request.student.AddStudentRequest;
import org.example.request.student.EditStudentRequest;
import org.example.request.student.GetAllStudentRequest;
import org.example.request.student.GetStudentByIdRequest;
import org.example.request.student.GetStudentByIdRequest;
import org.example.services.ServiceException;

import java.rmi.ServerException;
import java.security.Provider;
import java.util.List;

public interface IStudentServices {
    long addStudent(AddStudentRequest addStudentRequest) throws ServiceException;
    void editStudent(EditStudentRequest editStudentRequest) throws RepositoryException;
    void deleteStudent(IdRequest deleteLessonRequest) throws ServiceException;
    List<Student> getStudentsByIdGroup(IdRequest getAllStudentRequest) throws RepositoryException;

    Student getStudentById(IdRequest getStudentByIdRequest) throws RepositoryException;
}
