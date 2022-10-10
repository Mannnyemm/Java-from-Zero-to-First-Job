package com.manny.areaoftriangle;

import java.util.Scanner;

/**
 * 
 * @author gyabe
 * 
 * Application that calculates Area Of A Triangle
 *
 */
public class AreaOfTriangle {

	/**
	 * 
	 * @param args
	 * 
	 * Starting point of program
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter A side of a triangle: ");
		// Gets A side of Triangle from user
		double a = Double.parseDouble(sc.next());
		
		System.out.print("Please, enter B side of a triangle: ");
		// Gets B side of Triangle from user
		double b = Double.parseDouble(sc.next());
		
		System.out.print("Please, enter C side of a triangle: ");
		// Gets C side of Triangle from user
		double c = Double.parseDouble(sc.next());
		
		double triangleArea = calculateAreaOfTriangle(a, b, c);
		
		// Displays Results
		System.out.println("Triangle area is: " + triangleArea);
		

	}

	/**
	 * Calculates Area of Triangle using Heron's formula given the length of
	 * the three sides of the triangle @param, @param and @param c
	 * @return Area of Triangle (double)
	 */
	private static double calculateAreaOfTriangle(double a, double b, double c) {
		// p is half the perimeter of the triangle
		double p = (a + b + c) / 2.0;
		// Gets radicand for square root
		double radicand = p*(p-a)*(p-b)*(p-c);
		// Calculates Area of A Triangle
		double triangleArea = Math.sqrt(radicand);
		return triangleArea;
	}

}
