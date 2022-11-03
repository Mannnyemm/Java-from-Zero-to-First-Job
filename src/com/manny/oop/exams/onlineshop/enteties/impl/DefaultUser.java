package com.manny.oop.exams.onlineshop.enteties.impl;

import com.manny.oop.exams.onlineshop.enteties.User;

public class DefaultUser implements User {

	// <write your code here>
	// Id counter
	private static int idCount;
	// A User's firstName
	private String firstName;
	// A User's lastName
	private String lastName;
	// A User's password
	private String password;
	// A User's email
	private String email;
	// A User's id
	private int id;
	{
		// Sets user id
		id = ++idCount;
	}

	// Constructor
	public DefaultUser() {
	}

	// Main constructor
	public DefaultUser(String firstName, String lastName, String password, String email) {
		// <write your code here>
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
//		this.id = ++idCount;
	}

	@Override
	public String getFirstName() {
		// <write your code here>
		return this.firstName;
	}

	@Override
	public String getLastName() {
		// <write your code here>
		return this.lastName;
	}

	@Override
	public String getPassword() {
		// <write your code here>
		return this.password;
	}

	@Override
	public String getEmail() {
		// <write your code here>
		return this.email;
	}

	

	@Override
	public String toString() {
		return "DefaultUser [firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}

	// Sets a user's password
	@Override
	public void setPassword(String password) {
	    if (password == null){
	        return;
	    }
		this.password = password;
	}

	// Sets a user's email
	@Override
	public void setEmail(String newEmail) {
	    if (newEmail == null){
	        return;
	    }
		this.email = newEmail;
	}

	// Returns a user's id
	@Override
	public int getId() {
		// <write your code here>
		return this.id;
	}

	void clearState() {
		// <write your code here>
		
		// Resets user counter
		idCount = 0;
	}
}
