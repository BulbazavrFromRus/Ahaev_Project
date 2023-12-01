package org.example.responses.student_response;

public class GetStudentByIdResponse {
    private String name;

    public GetStudentByIdResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
