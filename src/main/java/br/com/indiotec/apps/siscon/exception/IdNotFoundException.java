package br.com.indiotec.apps.siscon.exception;

public class IdNotFoundException extends RuntimeException {

    public static final String MESSAGE_DEFAULT = "Id not found";

    public IdNotFoundException() {
        super(MESSAGE_DEFAULT);
    }
}
