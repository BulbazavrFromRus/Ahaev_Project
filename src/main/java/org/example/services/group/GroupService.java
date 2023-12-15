package org.example.services.group;

import jdk.javadoc.internal.doclets.toolkit.util.Group;
import org.example.entities.GroupStudent;
import org.example.request.group.AddGroupRequest;
import org.example.request.group.EditGroupRequest;
import org.example.request.group.GetGroupById;

public class GroupService implements IGroupService{
    private IGroupService iGroupService;



    @Override
    public long addGroup(AddGroupRequest addGroupRequest) {
      return 0L;
    }

    @Override
    public void editGroup(EditGroupRequest editGroupRequest) {

    }

    @Override
    public GroupStudent getGroupById(long getGroupById) {
        return null;
    }
}
