package org.example.responses;

public class ResponseEntity<T> {
    private int httpStatus;
    private T data;

    public ResponseEntity(int httpStatus, T data) {
        this.httpStatus = httpStatus;
        this.data = data;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public T getData() {
        return data;
    }
}
