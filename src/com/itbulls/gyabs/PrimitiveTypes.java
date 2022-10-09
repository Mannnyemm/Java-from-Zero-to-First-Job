package com.itbulls.gyabs;

public class PrimitiveTypes {

	public static void main(String[] args) {
		
		
		// Unboxing Integer Wrapper
		Integer one = 1;
		// Autoboxing int
		int aone = 1;
		// Comparing wrapped and unwrapped
		System.out.println(aone == one);
		// Comparing converted unwrapped to wrapped and  its unwrapped form
		System.out.println((int)one == one);
	}

}
