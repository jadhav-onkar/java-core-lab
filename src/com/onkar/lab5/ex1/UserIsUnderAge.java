package com.onkar.lab5.ex1;

public class UserIsUnderAge extends RuntimeException{

	private static final long serialVersionUID = 1711538556376408365L;

	public UserIsUnderAge(String m) {
		super(m);
	}
}
