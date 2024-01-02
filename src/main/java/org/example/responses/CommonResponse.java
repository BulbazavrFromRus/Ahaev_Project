package org.example.responses;

import java.util.List;

public class CommonResponse<T> {
    private boolean success;
    private T data;
    private Integer codeError;
    private String errorMessage;
    private List<String> errosList;

    //there are two constructors because of we can return response with errors but also we can return without errors

    public CommonResponse(T data) {
        this.data = data;
        this.success = true;
    }

    public CommonResponse(Integer codeError, String errorMessage, List<String> errosList) {
        this.success = false;
        this.codeError = codeError;
        this.errorMessage = errorMessage;
        this.errosList = errosList;
    }


    public boolean isSuccess() {
        return success;
    }

    public T getData() {
        return data;
    }

    public Integer getCodeError() {
        return codeError;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public List<String> getErrosList() {
        return errosList;
    }
}
