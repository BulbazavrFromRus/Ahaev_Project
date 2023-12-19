package org.example.entities;

import modele.Status;

import java.util.Objects;

public class Student{
    private long id;
    private String name;
    private String lastName;
    private String middleName;
    private long foreignGroupId;
    private Status status;

    public Student(long id, String name, String lastName, String middleName, long foreignGroupId, Status status) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.foreignGroupId = foreignGroupId;
        this.status = status;
    }

    public Student(String name, String lastName, String middleName, long foreignGroupId, Status status) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.foreignGroupId = foreignGroupId;
        this.status = status;
    }



    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public long getForeignGroupId() {
        return foreignGroupId;
    }

    public void setForeignGroupId(long foreignGroupId) {
        this.foreignGroupId = foreignGroupId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && foreignGroupId == student.foreignGroupId && Objects.equals(name, student.name) && Objects.equals(lastName, student.lastName) && Objects.equals(middleName, student.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, middleName, foreignGroupId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", foreignGroupId=" + foreignGroupId +
                ", status="+ status+
                '}';
    }
}
