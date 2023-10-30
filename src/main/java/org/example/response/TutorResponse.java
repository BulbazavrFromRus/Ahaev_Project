package org.example.response;

import org.example.entities.Tutor;

import java.util.Objects;

public class TutorResponse {
    private long id;
    private String nameTutor;

    public TutorResponse(long id, String nameTutor) {
        this.id = id;
        this.nameTutor = nameTutor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameTutor() {
        return nameTutor;
    }

    public void setNameTutor(String nameTutor) {
        this.nameTutor = nameTutor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TutorResponse tutor = (TutorResponse) o;
        return id == tutor.id && Objects.equals(nameTutor, tutor.nameTutor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameTutor);
    }
}
