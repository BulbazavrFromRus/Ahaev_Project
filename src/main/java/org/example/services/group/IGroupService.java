package org.example.services.group;

import org.example.entities.GroupStudent;
import org.example.request.group.AddGroupRequest;
import org.example.request.group.EditGroupRequest;
import org.example.services.ServiceException;

import java.rmi.ServerException;

public interface IGroupService {
    long addGroup(AddGroupRequest addGroupRequest) throws ServerException, ServiceException;
    void editGroup(EditGroupRequest editGroupRequest)  throws ServerException, ServiceException;
    GroupStudent getGroupById(long getGroupById)  throws ServerException, ServiceException;
}
