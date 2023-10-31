package org.example.responses.group_response;

import java.util.Objects;

public class AddGroupResponse {
    private long id;

    public AddGroupResponse(long id){
        this.id = id;
    }

    public long getId(){
        return id;
    }
}
