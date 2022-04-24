package br.com.indiotec.apps.siscon.utils;

import java.time.LocalDateTime;

public class ErrorException {

    private String message;
    private Integer code;
    private LocalDateTime dateTime;

    public ErrorException() {
    }

    public ErrorException(String message, Integer code, LocalDateTime dateTime) {
        this.message = message;
        this.code = code;
        this.dateTime = dateTime;
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
}
