package org.example.services.group;

import jdk.javadoc.internal.doclets.toolkit.util.Group;
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
    public Group getGroupById(GetGroupById getGroupById) {
        return null;
    }
}
