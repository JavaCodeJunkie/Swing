package com.javacodejunkie;

import java.util.EventObject;

public class LoginEvent extends EventObject {

	private static final long serialVersionUID = 3577351257551365168L;

	private User user;

	public LoginEvent(Object source, User user) {
		super(source);
		this.user = user;
	}

	public User getUser() {
		return user;
	}
}
