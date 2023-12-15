package org.example.request.student;

import modele.Status;

public class AddStudentRequest {
    private String firstName;
    private String lastName;
    private String middleName;

    private Status status;
    private Long groupId;

    public AddStudentRequest(String firstName, String lastName, String middleName, Long groupId, Status status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.groupId = groupId;
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Long getGroupId() {
        return groupId;
    }

    public Status getStatus() {
        return status;
    }
}

