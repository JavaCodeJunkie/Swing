package com.javacodejunkie;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String name;
	private String password;

	public User(String name, String password) throws Exception {
		this.name = name;
		this.password = password;

		validate();
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	private void validate() throws Exception {
		List<String> errors = new ArrayList<>();

		if (name.isBlank()) {
			errors.add("Username can not be blank.");
		}

		if (password.isBlank()) {
			errors.add("Password can not be blank.");
		}

		if (!errors.isEmpty()) {
			Exception e = new Exception();
			for (String error : errors) {
				e.addSuppressed(new Exception(error));
			}
			throw e;
		}
	}
}
