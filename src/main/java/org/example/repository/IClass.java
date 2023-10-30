package org.example.repository;

import org.example.entities.Student;

import java.util.Scanner;

public interface IClass {
    void addClass(Class someClass);
    boolean getClass(int id);
    void updateClass(int id, Scanner input);
    void deleteClass(int id);
}
