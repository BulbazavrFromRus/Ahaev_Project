package org.example.services.group;

import jdk.javadoc.internal.doclets.toolkit.util.Group;
import org.example.entities.GroupStudent;
import org.example.request.group.AddGroupRequest;
import org.example.request.group.EditGroupRequest;
import org.example.request.group.GetGroupById;

import javax.swing.*;
import java.rmi.ServerException;
import java.util.List;

public interface IGroupService {
    long addGroup(AddGroupRequest addGroupRequest) throws ServerException;
    void editGroup(EditGroupRequest editGroupRequest)  throws ServerException;
    GroupStudent getGroupById(long getGroupById)  throws ServerException;
}
