package com.mihigo.main.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(InvalidParameters.class)
	public ResponseEntity<?> InvalidParameterHandling(InvalidParameters exception, WebRequest request) {
		ErrorDetail error = new ErrorDetail(new Date(), exception.getMessage(), request.getDescription(false));

		return new ResponseEntity<>(error, HttpStatus.NOT_ACCEPTABLE);
	}

	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<?> RuntimeHanndling(RuntimeException exception, WebRequest request) {
		ErrorDetail error = new ErrorDetail(new Date(), exception.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> globalExceptionHandling(Exception ex, WebRequest request) {
		ErrorDetail error = new ErrorDetail(new Date(), ex.getMessage(), request.getDescription(false));

		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
