package org.example.responses.group_response;

public class GetGroupByIdResponse {
    private String name;
    private long id;

    public GetGroupByIdResponse(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
