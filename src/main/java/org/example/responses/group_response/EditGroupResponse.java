package org.example.responses.group_response;

public class EditGroupResponse {
    private long id;
    private String nameGroup;

    public EditGroupResponse(long id, String nameGroup) {
        this.id = id;
        this.nameGroup = nameGroup;
    }
    public long getId() {
        return id;
    }

    public String getNameGroup() {
        return nameGroup;
    }
}
