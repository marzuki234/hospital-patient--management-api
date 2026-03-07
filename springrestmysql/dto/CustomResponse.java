package com.mycompany.springrestmysql.dto;

public class CustomResponse {
    private String message;
    private boolean success;
    private Object data;

    // Constructors, getters, and setters
    public CustomResponse(String message, boolean success, Object data) {
        this.message = message;
        this.success = success;
        this.data = data;
    }
    // ... standard getters/setters
}