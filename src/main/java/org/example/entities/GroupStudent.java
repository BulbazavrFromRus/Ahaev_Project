package org.example.entities;

import org.example.repository.IGroup;

import java.util.Objects;
import java.util.Scanner;

public class GroupStudent{
    private long id;
    private String groupName;

    public GroupStudent(long id, String groupName) {
        this.id = id;

        this.groupName = groupName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupStudent that = (GroupStudent) o;
        return id == that.id && Objects.equals(groupName, that.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupName);
    }
}
