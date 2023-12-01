package org.example.repository;

import org.example.entities.GroupStudent;
import org.example.entities.Student;

import java.util.List;
import java.util.Scanner;

public interface IGroup {
    long addGroup(GroupStudent group) throws RepositoryException;
    GroupStudent getGroup(long id) throws RepositoryException;
    void updateGroup(GroupStudent group) throws RepositoryException;
    void deleteGroup(long id) throws RepositoryException;

    List<GroupStudent> getAllGroup() throws RepositoryException;
}
