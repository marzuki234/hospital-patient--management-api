/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ErrorResponse {
    private String errorCode;
    private int statusCode;
    private String message;
    private long timestamp;
    private String path;
    // Getters, setters, and constructors
    
    
                public String getErrorCode() {
        return errorCode;
    }


    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    
    
      public int getStatusCode() {
        return statusCode;
    }


    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    
      public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }
    
    public long getTimestamp() {
        return timestamp;
    }


    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    
    public String getPath() {
        return path;
    }


    public void setPath(String path) {
        this.path = path;
    }
    
}
