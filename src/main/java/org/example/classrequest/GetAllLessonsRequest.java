package org.example.classrequest;

public class GetAllLessonsRequest {
       private Long idLocalDate;

    public GetAllLessonsRequest(Long localDate) {
        this.idLocalDate = localDate;
    }

    public Long getLocalDate() {
        return idLocalDate;
    }
}
