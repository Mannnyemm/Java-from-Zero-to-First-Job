package com.manny.oop.exams.onlineshop.services.impl;

import java.util.Arrays;

import com.manny.oop.exams.onlineshop.enteties.Order;
import com.manny.oop.exams.onlineshop.enteties.User;
import com.manny.oop.exams.onlineshop.enteties.impl.DefaultUser;
import com.manny.oop.exams.onlineshop.services.UserManagementService;

public class DefaultUserManagementService implements UserManagementService {

	private static final String NOT_UNIQUE_EMAIL_ERROR_MESSAGE = "This email is already used by another user. Please, use another email";
	private static final String EMPTY_EMAIL_ERROR_MESSAGE = "You have to input email to register. Please, try one more time";
	private static final String NO_ERROR_MESSAGE = "new user is created";

	private static final int DEFAULT_USERS_CAPACITY = 10;

	private static DefaultUserManagementService instance;

	// <write your code here>
	// Array of users
	User[] users;
	// First index of users array where an order has not been inserted
	private int firstAvailableIndex = 0;
	// Initialize length of users array to DEFAULT_USERS_CAPACITY
	{
		users = new User[DEFAULT_USERS_CAPACITY];
	}

	private DefaultUserManagementService() {
	}

	/**
	 * Adds a user  to users array and return success message if successful
	 * or return error message if there is an error
	 * @param user User - user to be added 
	 * @return String - error or success message
	 */
	@Override
	public String registerUser(User user) {
		// <write your code here>
		
		if (user == null) {
			return NO_ERROR_MESSAGE;
		}

		// Return error message if user has inputed no email
		if (user.getEmail() == null || user.getEmail().isEmpty()) {
			return EMPTY_EMAIL_ERROR_MESSAGE;
		}

		// Return error message if user's email is not unique
		for (User currUser : getUsers()) {
			if (user.getEmail() != null && user.getEmail().equalsIgnoreCase(currUser.getEmail())) {
				return NOT_UNIQUE_EMAIL_ERROR_MESSAGE;
			}
		}
		
		// Double size of users array if it's full
		if (users.length <= firstAvailableIndex) {
			users = Arrays.copyOf(users, users.length << 1);
		}
		// Add order to users array
		users[firstAvailableIndex++] = user;
		return NO_ERROR_MESSAGE;
	}

	public static UserManagementService getInstance() {
		if (instance == null) {
			instance = new DefaultUserManagementService();
		}
		return instance;
	}

	@Override
	public User[] getUsers() {
		// <write your code here>
		
		// Returns non null users in users array
		return Arrays.copyOf(users, firstAvailableIndex);
	}

	/** 
	 * Return User whose email is same as userEmail
	 * @param userEmail String - email of user we want 
	 * @return User - user we want or null if such email does not exist
	 */
	@Override
	public User getUserByEmail(String userEmail) {
		// <write your code here>
		
		// Loop through all users in users array
		for (User user : this.getUsers()) {
			// Return a user if their email is same as userEmail
			if (user.getEmail().equalsIgnoreCase(userEmail)) {
				return user;
			}
		}
		// Return null if no user is found with userEmail
		return null;
	}

	void clearServiceState() {
		// <write your code here>
		
		// Resets users array to default
		users = new User[DEFAULT_USERS_CAPACITY];
		firstAvailableIndex = 0;

	}
}
