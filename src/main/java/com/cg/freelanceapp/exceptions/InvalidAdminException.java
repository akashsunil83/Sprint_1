package com.cg.freelanceapp.exceptions;

public class InvalidAdminException extends RuntimeException {

	public InvalidAdminException() {
		super();
	}

	public InvalidAdminException(String message) {
		super(message);
	}

}