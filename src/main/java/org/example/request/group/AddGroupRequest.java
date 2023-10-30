package org.example.request.group;

public class AddGroupRequest {
    private String nameGroup;

    public AddGroupRequest(String nameGroup)
    {
        this.nameGroup = nameGroup;
    }

    public String getNameGroup()
    {
        return nameGroup;
    }
}
