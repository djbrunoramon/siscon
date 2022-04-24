package br.com.indiotec.apps.siscon.exception;

import br.com.indiotec.apps.siscon.utils.ErrorException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GeneralExceptionHandler {

    @ExceptionHandler(IdNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorException> idNotFoundException(Exception exception) {
        ErrorException errorException = new ErrorException();
        errorException.setCode(HttpStatus.BAD_REQUEST.value());
        errorException.setDateTime(LocalDateTime.now());
        errorException.setMessage(exception.getMessage());
        return ResponseEntity.badRequest().body(errorException);
    }
}
