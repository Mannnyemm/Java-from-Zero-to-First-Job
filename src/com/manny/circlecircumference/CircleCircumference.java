package com.manny.circlecircumference;

import java.util.Scanner;

public class CircleCircumference {

	public static void main(String[] args) {
		// Initializing new Scanner to sc
		Scanner sc = new Scanner(System.in);
		// Gets radius of circle from user
		System.out.print("Please, enter circle radius: ");
		double radius = Double.parseDouble(sc.next());
		// Calculates circumference of circle
		double circleCircumference = calculateCircleCircumference(radius);
		// Displays results
		System.out.println("Circle circumference is: " + circleCircumference);

	}

	private static double calculateCircleCircumference(double radius) {
		// Calculates circumference of a circle using given radius
		// Initialize pi
		double pi = Math.PI;
		// Calculate circumference of a circle
		double circleCircumference = 2 * pi * radius;
		return circleCircumference;
	}

}
