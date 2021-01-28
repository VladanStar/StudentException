package com.company;

public class IndeksNijeValidanException extends StudentException {
    public IndeksNijeValidanException() {
    }

    public IndeksNijeValidanException(String message) {
        super(message);
    }

    public IndeksNijeValidanException(String message, Throwable cause) {
        super(message, cause);
    }

    public IndeksNijeValidanException(Throwable cause) {
        super(cause);
    }

    public IndeksNijeValidanException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
