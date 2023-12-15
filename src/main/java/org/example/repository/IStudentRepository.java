package org.example.repository;

import org.example.entities.Student;

public interface IStudentRepository {
    long addStudent(Student student) throws RepositoryException;
    Student getStudent(long id) throws RepositoryException;
    void updateStudent(long id, Student student) throws RepositoryException;

    void deleteStudent(long id) throws RepositoryException;

    List<Student>


}
