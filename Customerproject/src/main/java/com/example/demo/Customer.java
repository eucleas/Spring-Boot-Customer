package com.example.demo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Customer {

	@NotEmpty
	@Size(min = 5, max = 12, message = "Username 5 ile 12 arasında olmalı")
	private String username;
	@NotEmpty
	@Size(min = 6, max = 12, message = "Password 6 ile 12 arasında olmalı")
	private String password;
	@NotEmpty
	@Size(min = 2, max = 25, message = "Name 2 ile 25 arasında olmalı")
	private String name;
	@NotEmpty
	@Size(min = 3, max = 30, message = "Surname 3 ile 30 arasında olmalı")
	private String surname;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
