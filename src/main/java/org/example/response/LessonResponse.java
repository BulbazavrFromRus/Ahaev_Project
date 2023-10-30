package org.example.response;

import java.time.LocalDate;
import java.util.Objects;

public class LessonResponse {
    private Long id;
    private LocalDate date;
    private Long foreignGroupStudentId;
    private Long foreignTutorId;
    private Long foreignDisciplineId;

    public LessonResponse(Long id, LocalDate date, Long foreignGroupStudentId, Long foreignTutorId, Long foreignDisciplineId) {
        this.id = id;
        this.date = date;
        this.foreignGroupStudentId = foreignGroupStudentId;
        this.foreignTutorId = foreignTutorId;
        this.foreignDisciplineId = foreignDisciplineId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getForeignGroupStudentId() {
        return foreignGroupStudentId;
    }

    public void setForeignGroupStudentId(Long foreignGroupStudentId) {
        this.foreignGroupStudentId = foreignGroupStudentId;
    }

    public Long getForeignTutorId() {
        return foreignTutorId;
    }

    public void setForeignTutorId(Long foreignTutorId) {
        this.foreignTutorId = foreignTutorId;
    }

    public Long getForeignDisciplineId() {
        return foreignDisciplineId;
    }

    public void setForeignDisciplineId(Long foreignDisciplineId) {
        this.foreignDisciplineId = foreignDisciplineId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LessonResponse aClass = (LessonResponse) o;
        return Objects.equals(id, aClass.id) && Objects.equals(date, aClass.date) && Objects.equals(foreignGroupStudentId, aClass.foreignGroupStudentId) && Objects.equals(foreignTutorId, aClass.foreignTutorId) && Objects.equals(foreignDisciplineId, aClass.foreignDisciplineId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, foreignGroupStudentId, foreignTutorId, foreignDisciplineId);
    }
}
