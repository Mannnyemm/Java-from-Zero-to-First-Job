package com.manny.oop.exams.onlineshop.services;

import com.manny.oop.exams.onlineshop.enteties.User;

public interface UserManagementService {

	String registerUser(User user);

	User[] getUsers();

	User getUserByEmail(String userEmail);

}
