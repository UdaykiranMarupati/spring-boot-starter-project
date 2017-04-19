package com.spring.practice.customerexcetions;

public class BadRequestException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3603892964008686738L;

	public BadRequestException(String message) {
		super(message);
	}

}
