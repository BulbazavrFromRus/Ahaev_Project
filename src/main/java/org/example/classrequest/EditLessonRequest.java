package org.example.classrequest;

import java.time.LocalDate;

public class EditLessonRequest {
    private LocalDate date;
    private Long foreignGroupStudentId;
    private Long foreignTutorId;
    private Long foreignDisciplineId;

    public EditLessonRequest(LocalDate date, Long foreignGroupStudentId, Long foreignTutorId, Long foreignDisciplineId) {
        this.date = date;
        this.foreignGroupStudentId = foreignGroupStudentId;
        this.foreignTutorId = foreignTutorId;
        this.foreignDisciplineId = foreignDisciplineId;
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

    public Long getForeignDisciplineId() {
        return foreignDisciplineId;
    }

}
