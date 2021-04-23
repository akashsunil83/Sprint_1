package com.cg.freelanceapp.exceptions;

public class InvalidJobException extends RuntimeException {

	public InvalidJobException() {
		super();
	}

	public InvalidJobException(String message) {
		super(message);
	}

}