package org.example.calculator.exceptions;

public class DestroyApplicationException extends Exception {
    public DestroyApplicationException() {
    }

    public DestroyApplicationException(String message) {
        super(message);
    }

    public DestroyApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public DestroyApplicationException(Throwable cause) {
        super(cause);
    }

    public DestroyApplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
