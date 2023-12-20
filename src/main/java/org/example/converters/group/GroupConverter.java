package org.example.converters.group;

import org.example.entities.GroupStudent;
import org.example.request.group.AddGroupRequest;
import org.example.request.group.EditGroupRequest;

public class GroupConverter {
    public GroupStudent addGroupRequestToEntity(AddGroupRequest request){
        return new GroupStudent(
                request.getNameGroup()
        );
    }

    public GroupStudent editGroupRequestToEntity(EditGroupRequest request){
        return new GroupStudent(
                request.getNameGroup()
        );
    }


}
