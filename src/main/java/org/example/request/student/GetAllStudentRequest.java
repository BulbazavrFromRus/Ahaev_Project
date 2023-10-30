package org.example.request.student;

public class GetAllStudentRequest {
    private long groupId;

    public GetAllStudentRequest(long groupId) {
        this.groupId = groupId;
    }
    public Long getGroupId()
    {
        return groupId;
    }
}
