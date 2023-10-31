package org.example.responses.student_response;

import java.util.Objects;

//by changing student
//server will respond datas with user can can  change
public class EditStudentResponse {
    private long idStudent;
    private String firstName;
    private String lastName;
    private String middleName;
    private String status;
    private long groupId;

    public EditStudentResponse(long idStudent, String firstName, String lastName, String middleName, String status, long groupId) {
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

    public String getStatus() {
        return status;
    }

    public long getGroupId() {
        return groupId;
    }

}
