package org.example.services.group;

import jdk.javadoc.internal.doclets.toolkit.util.Group;
import org.example.request.group.AddGroupRequest;
import org.example.request.group.EditGroupRequest;
import org.example.request.group.GetGroupById;

import javax.swing.*;
import java.util.List;

public interface IGroupService {
    long addGroup(AddGroupRequest addGroupRequest);
    void editGroup(EditGroupRequest editGroupRequest);
    Group getGroupById(GetGroupById getGroupById);
}
