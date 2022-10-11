package com.manny.addnumbers;

public class AddNumbers {

	public static void main(String[] args) {
		// If any of the arguments has decimals
		if (args[0].contains(".") || args[1].contains(".")) {
			// Converts params into double
			double param1 = Double.parseDouble(args[0]);
			double param2 = Double.parseDouble(args[1]);
			// Displays sum of parameters
			System.out.println(param1 + param2);
		}
		// If arguments are only integers
		else {
			// Converts params into integer
			int param1 = Integer.parseInt(args[0]);
			int param2 = Integer.parseInt(args[1]);
			// Displays sum of parameters
			System.out.println(param1 + param2);
		}
	}
}
