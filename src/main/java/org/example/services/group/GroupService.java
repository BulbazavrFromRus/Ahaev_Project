package org.example.services.group;

import jdk.javadoc.internal.doclets.toolkit.util.Group;
import org.example.entities.GroupStudent;
import org.example.request.group.AddGroupRequest;
import org.example.request.group.EditGroupRequest;
import org.example.request.group.GetGroupById;

public class GroupService implements IGroupService{
    @Override
    public long addGroup(AddGroupRequest addGroupRequest) {
        return 0;
    }

    @Override
    public void editGroup(EditGroupRequest editGroupRequest) {

    }

    @Override
    public GroupStudent getGroupById(long getGroupById) {
        return null;
    }
}
