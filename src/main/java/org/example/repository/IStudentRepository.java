package org.example.repository;

import org.example.entities.Student;

public interface IStudentRepository {
    long addStudent(Student student) throws RepositoryException;
    Student getStudent(int id) throws RepositoryException;
    void updateStudent(int id, Student student) throws RepositoryException;

    void deleteStudent(long id) throws RepositoryException;


}
