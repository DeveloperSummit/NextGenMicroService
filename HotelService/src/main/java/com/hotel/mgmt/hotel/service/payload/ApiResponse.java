package com.hotel.mgmt.hotel.service.payload;

import org.springframework.http.HttpStatus;

public class ApiResponse {

    private String id;
    private String message;
    private  boolean status;
    private HttpStatus httpStatus;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public ApiResponse(String id, String message, boolean status, HttpStatus httpStatus) {
        this.id = id;
        this.message = message;
        this.status = status;
        this.httpStatus = httpStatus;
    }

    public ApiResponse() {
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "id='" + id + '\'' +
                ", message='" + message + '\'' +
                ", status=" + status +
                ", httpStatus=" + httpStatus +
                '}';
    }
}
