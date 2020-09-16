package com.bankvision.test.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class NotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private final HttpStatus httpStatus;
	private final String error;

	public NotFoundException(String error) {
		super();
		this.httpStatus = HttpStatus.NOT_FOUND;
		this.error = error;
		
	}

}
