package org.example.repository;

import org.example.entities.Student;

import java.util.Scanner;

public interface IStudent {
    long addStudent(Student student);
    Student getStudent(int id);
    void updateStudent(int id, Student student);

    void deleteStudent(int id);


}
