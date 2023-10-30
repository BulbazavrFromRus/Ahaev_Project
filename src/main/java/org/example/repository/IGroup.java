package org.example.repository;

import org.example.entities.GroupStudent;
import org.example.entities.Student;

import java.util.Scanner;

public interface IGroup {
    void addGroup(GroupStudent group);
    boolean getGroup(int id);
    void updateGroup(int id, Scanner input);
    void deleteGroup(int id);
}
