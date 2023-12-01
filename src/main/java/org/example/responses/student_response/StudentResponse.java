package org.example.responses.student_response;

import org.example.responses.group_response.GroupResponse;

import java.util.Objects;

public class StudentResponse {
    private long  id;
    private String  name ;

    private String lastName;
    private String middleName;
    private GroupResponse group;

    public StudentResponse(long id, String name, String lastName, String middleName, GroupResponse group) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public GroupResponse getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentResponse that = (StudentResponse) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName) && Objects.equals(middleName, that.middleName) && Objects.equals(group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, middleName, group);
    }
}
