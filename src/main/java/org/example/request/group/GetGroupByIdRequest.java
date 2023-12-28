package org.example.request.group;


//we might not use this class
public class GetGroupByIdRequest {
    private long id;

    public GetGroupByIdRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
