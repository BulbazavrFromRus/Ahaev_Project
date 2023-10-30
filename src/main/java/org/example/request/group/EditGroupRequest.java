package org.example.request.group;

import java.util.ArrayList;

public class EditGroupRequest {
       private long id;
       private String nameGroup;

    public EditGroupRequest(long id, String nameGroup) {
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
