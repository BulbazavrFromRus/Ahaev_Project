package org.example.repository;

import org.example.entities.Student;

import java.util.List;

public interface IStudentRepository {
    long addStudent(Student student) throws RepositoryException;
    Student getStudent(long id) throws RepositoryException;
    void updateStudent(Student student) throws RepositoryException;

    void deleteStudent(long id) throws RepositoryException;

    List<Student> getStudentsByGroupId(long id) throws RepositoryException;


}
