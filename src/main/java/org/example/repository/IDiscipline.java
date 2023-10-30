package org.example.repository;

import org.example.entities.Discipline;
import org.example.entities.Student;

import java.util.Scanner;

public interface IDiscipline {
    void addDiscipline(Discipline discipline);
    boolean getDiscipline(int id);
    void updateDiscipline(int id, Scanner input);

    void updateDiscipline(Discipline discipline);

    void deleteDiscipline(int id);
}
