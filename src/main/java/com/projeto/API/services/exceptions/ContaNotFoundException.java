package com.projeto.API.services.exceptions;

public class ContaNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ContaNotFoundException(String msg) {
		super(msg);
	}

}
