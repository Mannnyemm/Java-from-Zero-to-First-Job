package com.manny.enumexample;

public enum MessageType {
	// Constant values
	A(Priority.HIGH), B(Priority.MEDIUM), C(Priority.LOW), D(Priority.LOW);
	
	// Member variable
	private Priority priority;
	// Constructor
	MessageType(Priority priority) {
		this.priority = priority;
	}
	
	Priority getPriority() {
		return this.priority;
	}
}
