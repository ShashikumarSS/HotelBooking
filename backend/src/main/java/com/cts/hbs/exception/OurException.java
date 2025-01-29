package com.cts.hbs.exception;

public class OurException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public OurException(String message) {
        super(message);
    }
}
