package com.example;

/**
 *
 * @author Neil
 */
public class NoInvalidOperationException extends Exception {
    public NoInvalidOperationException() {
        super();
    }
    
    public NoInvalidOperationException(String message) {
        super(message);
    }
    
    public NoInvalidOperationException(Throwable cause) {
        super(cause);
    }
    
    public NoInvalidOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
