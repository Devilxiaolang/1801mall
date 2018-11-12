package com.company.service.dto;

import java.io.Serializable;

public class Loginvo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;

	public Loginvo(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Loginvo() {
	}

	@Override
	public String toString() {
		return "Loginvo{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
