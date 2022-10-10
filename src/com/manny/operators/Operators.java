package com.manny.operators;

/**
 * 
 * @author gyabe
 * 
 * Operators Application
 *
 */
public class Operators {

	/**
	 * 
	 * @param args
	 * 
	 * Starting point of program where all other methods are calleds
	 */
	public static void main(String[] args) {
		unaryOperators();
		bitwiseOperators();
		ternaryOperator();
		/*
		 * Logical operators: AND(&&); Short-circuit OR(||): Stops with first true unlike Bitwise OR(|)
		 * which still evaluates second statement even if first statement is true.
		 * NB: (|) returns Exception even if first statement is true and second has an error 
		 */
		
	}

	/*
	 * Ternary Operator(?)
	 * (condition) ? true : false
	 * Returns what's at the true side if condition is true
	 * or returns false if condition is false
	 */
	private static void ternaryOperator() {
		System.out.println("==== Ternary Operator ====");
		// Example of Ternary operators
		System.out.println(4 > 3 ? "Statement is true" : "Statement is false");
		System.out.println(4 < 3 ? "Statement is true" : "Statement is false");
	}

	/*
	 * Bitwise Operators: &, |, ^, ~, >>, >>>, <<
	 */
	private static void bitwiseOperators() {		
		// Initializing variables
		int five = 5;
		int ten = 10;
		int six = 6;
		
		System.out.println("==== Bitwise Operators ====");
		
		
		//Displays decimal 5 in bits
		System.out.println("Binary of 5 is " + Integer.toBinaryString(5)); // 101
		//Displays decimal 10 in bits
		System.out.println("Binary of 10 is " + Integer.toBinaryString(10)); // 1010
		//Displays decimal 6 in bits
		System.out.println("Binary of 6 is " + Integer.toBinaryString(6)); // 1010
		
		/*
		 * Bitwise AND(&) operator; Compares bits of numbers
		 * and returns 1 if both bits 1 or 0 if either is 0
		 * 
		 * Eg: (5&10) & 101
		 *             1010 
		 *            =0000 or 0 in decimal
		 */
		// Example of bitwise AND
		System.out.println("Bitwise AND of 5 and 10 is " + (five&ten) +" in decimal"); // 0
		
		/*
		 * Bitwise OR(|) operator; Compares bits of numbers
		 * and returns 1 if both bits or either bit is 1 else 0
		 * 
		 * Eg: (5|10) | 101
		 *             1010
		 *            =1111 or 15 in decimal
		 */
		// Example of bitwise OR
		System.out.println("Bitwise OR of 5 and 10 is " + (five|ten) +" in decimal"); // 15
		
		/*
		 * Bitwise XOR(^) operator; Compares bits of numbers
		 * and returns 1 only if either bit is 1 else 0
		 * 
		 * Eg: (5^10) ^ 101                    | Eg2: (6^10)   ^ 110
		 *             1010                    |                1010
		 *            =1111 or 15 in decimal   |               =1100 or 12 in decimal
		 */
		// Examples of bitwise XOR
		System.out.println("Bitwise XOR of 5 and 10 is " + (five^ten) +" in decimal"); // 15
		System.out.println("Bitwise XOR of 6 and 10 is " + (six^ten) +" in decimal"); // 12
		
		/*
		 * Bitwise Complement(~) operator; Returns the inverse(complement) of bits
		 * thus returns 1 if bit is 0 or returns 0 if bit is 0
		 * 
		 * Eg: (~10)  ~1010 
		 *            =0101 or -11 since all preceeding bits is also reversed since first bit
		 *            is 1 which means negative i.e (11111111111111111111111111110101) Signed bits
		 *            
		 */
		System.out.println("Bitwise Complement of 10 is " + ~10 + " in decimal"); // -11
		
		/*
		 * 
		 * Other Bitwise Operators
		 * Right Shift operator >>: Shifts bits to the right by the specified number but does not shift the first bit(signed bit)
		 * Right Unsigned Shift operator >>>: Shifts bits to the right by the specified number including the first bit(signed bit)
		 * Left Shift operator >>: Shifts bits to the left by the specified number but does not shift the first bit(signed bit)
		 * NB: Right and Left Shift are very fast in Division and Multiplication respectively
		 * Thus: x << y = x * (2 ^ y) eg. (10 * 2 = 10 << 1)
		 * And x >> y = x / (2 ^ y) eg. (10 / 2 = 10 >> 1)
		 * 
		 */
		
		System.out.println();
	}

	/*
	 * Unary Operators: +, ++, -, --, !
	 */
	private static void unaryOperators() {
		
		System.out.println("==== UnaryOperators ====");
		
		// Initializing i to 10
		int i = 10; //10
		// Assigning i to i2, then increasing i by 1 (Postfix)
		int i2 = i++; // 10
		// Increasing i by 1 and assigning it to i3; (Prefix)
		int i3 = ++i; // 12
		// Assigning i to i4, then decreasing i by 1
		int i4 = i--; // 12
		// Decreasing i by 1 and assigning it to i3
		int i5 = --i; // 10
		// '!' Changes boolean to the opposite for eg. true to false
		boolean notTrue = !true;
		
		
		System.out.println("i= " + i);
		System.out.println("i2= " + i2);
		System.out.println("i3= " + i3);
		System.out.println("i4= " + i4);
		System.out.println("i5= " + i5);
		System.out.println("notTrue= " + notTrue);
		System.out.println();
	}

}
