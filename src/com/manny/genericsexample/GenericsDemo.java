package com.manny.genericsexample;

public class GenericsDemo <T>{

	T name;
	T cry;
	
	public GenericsDemo(T name, T cry) {
		this.cry = cry;
		this.name = name;
		System.out.println(this.name.getClass());
		System.out.println(this.cry.getClass());
	}
	
	public static void main(String[] args) {
		GenericsDemo<String> test = new GenericsDemo<>("kitty", "meow");
		GenericsDemo<Integer> test2 = new GenericsDemo<>(2, 3930);
	}
}
