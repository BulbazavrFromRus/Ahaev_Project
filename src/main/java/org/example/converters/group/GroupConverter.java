package org.example.converters.group;

import org.example.entities.GroupStudent;
import org.example.request.group.AddGroupRequest;

public class GroupConverter {
    public GroupStudent toEntity(AddGroupRequest request){
        return new GroupStudent(
                request.getNameGroup()
        );
    }
}
