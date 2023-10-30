package org.example.request.student;

public class EditStudentRequest {
    private long idStudent;
    private String firstName;
    private String lastName;
    private String middleName;
    private String status;
    private long groupId;

    public EditStudentRequest(long idStudent, String firstName, String lastName, String middleName, String status, long groupId) {
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

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}
