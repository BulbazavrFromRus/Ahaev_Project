package org.example.repository;

import java.util.Scanner;

public interface ILesson {
    long addLesson(Class someClass);
    boolean getLesson(int id);
    void updateLesson(int id, Scanner input);
    void deleteLesson(int id);
}
