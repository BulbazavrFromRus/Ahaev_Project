package org.example.responses.student_response;


import java.util.Objects;

//by adding student
//server will respond his id
public class AddStudentResponse {
    private long id;

    public AddStudentResponse(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }


}
