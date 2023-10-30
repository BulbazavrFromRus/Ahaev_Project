package org.example.classrequest;

import java.time.LocalDate;

public class AddLessonRequest {
    private LocalDate date;
    private Long foreignGroupStudentId;
    private Long foreignTutorId;

    public AddLessonRequest(LocalDate date, Long foreignGroupStudentId, Long foreignTutorId) {
        this.date = date;
        this.foreignGroupStudentId = foreignGroupStudentId;
        this.foreignTutorId = foreignTutorId;
    }

    public LocalDate getDate() {
        return date;
    }

    public Long getForeignGroupStudentId() {
        return foreignGroupStudentId;
    }

    public Long getForeignTutorId() {
        return foreignTutorId;
    }
}
