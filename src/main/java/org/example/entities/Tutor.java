package org.example.entities;

import org.example.repository.ITutor;

import java.util.Objects;
import java.util.Scanner;

public class Tutor{
    private Long id;
    private String nameTutor;

    public Tutor(long id, String nameTutor) {
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
        Tutor tutor = (Tutor) o;
        return id == tutor.id && Objects.equals(nameTutor, tutor.nameTutor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameTutor);
    }
}
