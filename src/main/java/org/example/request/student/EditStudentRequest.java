package org.example.request.student;

import modele.Status;

public class EditStudentRequest {
    private long idStudent;
    private String firstName;
    private String lastName;
    private String middleName;
    private Status status;
    private long groupId;

    public EditStudentRequest(long idStudent, String firstName, String lastName, String middleName, Status status, long groupId) {
        this.idStudent = idStudent;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.status = status;
        this.groupId = groupId;
    }

    public long getIdStudent() {
        return idStudent;
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
    public Status getStatus() {
        return status;
    }
    public long getGroupId() {
        return groupId;
    }
}
