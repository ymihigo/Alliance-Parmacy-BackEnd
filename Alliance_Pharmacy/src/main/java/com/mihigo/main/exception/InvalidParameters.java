package com.mihigo.main.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class InvalidParameters extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidParameters(String message) {
		super(message);
	}

}
