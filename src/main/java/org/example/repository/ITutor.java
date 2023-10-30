package org.example.repository;

import org.example.entities.Student;
import org.example.entities.Tutor;

import java.util.Scanner;

public interface ITutor{
    void addTutor(Tutor tutor);
    boolean getTutor(int id);
    void updateTutor(int id, Scanner input);
    void deleteTutor(int id);
}
