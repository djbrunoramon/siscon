package br.com.indiotec.apps.siscon.utils;

import java.time.LocalDateTime;

public class ErrorException {

    private String message;
    private Integer code;
    private LocalDateTime dateTime;

    private Throwable throwable;

    public ErrorException() {
    }

    public ErrorException(String message, Integer code, LocalDateTime dateTime, Throwable throwable) {
        this.message = message;
        this.code = code;
        this.dateTime = dateTime;
        this.throwable = throwable;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
