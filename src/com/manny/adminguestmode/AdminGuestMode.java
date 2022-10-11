package com.manny.adminguestmode;


public class AdminGuestMode {

	public static void main(String[] args) {
	    // Converts string array to a single string
		String arguments = String.join(",", args);
		// Prints error if user chooses both options
		if (arguments.contains("--admin") && arguments.contains("--guest")){
			System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
		}
		// Else Welcomes user if user is Admin
		else if (arguments.contains("--admin")) {
			System.out.println("Hello, Admin!");
		}
		//Else Welcomes user if user is Guest
		else if (arguments.contains("--guest")) {
			System.out.println("Hello, Guest!");
		}
		// Prints error if user chooses no option
		else {
			System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
		}

	}

}
