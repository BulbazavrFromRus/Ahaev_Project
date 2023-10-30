package org.example.repository;

import org.example.entities.Student;

import java.util.Scanner;

public interface IStudent {
    void addStudent(Student student);
    boolean getStudent(int id);
    void updateStudent(int id, Student student);

    void deleteStudent(int id);


}
