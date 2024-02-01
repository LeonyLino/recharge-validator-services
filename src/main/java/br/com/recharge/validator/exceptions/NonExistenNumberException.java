package br.com.recharge.validator.exceptions;

public class NonExistenNumberException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NonExistenNumberException(String message) {
		super(message);
	}

}
