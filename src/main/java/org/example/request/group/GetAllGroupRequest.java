package org.example.request.group;

import org.example.entities.GroupStudent;

import java.util.ArrayList;

public class GetAllGroupRequest {
    private ArrayList<GroupStudent> groupList;

    public GetAllGroupRequest(ArrayList<GroupStudent> groupList) {
        this.groupList = groupList;
    }

    public ArrayList<GroupStudent> getGroupList() {
        return groupList;
    }
}
