package org.example.repository;

import org.example.entities.GroupStudent;
import org.example.services.ServiceException;

import java.util.List;

public interface IGroupRepository {
    long addGroup(GroupStudent group) throws RepositoryException;
    GroupStudent getGroup(long id) throws RepositoryException;
    void updateGroup(GroupStudent group) throws RepositoryException;
    void deleteGroup(long id) throws RepositoryException;

    List<GroupStudent> getAllGroup() throws RepositoryException;
}
