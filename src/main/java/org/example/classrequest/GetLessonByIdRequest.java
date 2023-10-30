package org.example.classrequest;

public class GetLessonByIdRequest {
    private Long id;

    public GetLessonByIdRequest(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
