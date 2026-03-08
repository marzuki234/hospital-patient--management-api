package com.mycompany.springrestmysql.dto;

import java.util.List;

public class ApiError {
    private String timestamp;
    private int status;
    private String error;
    private List<String> messages; // To hold all validation messages

    // constructor, getters, and setters
}