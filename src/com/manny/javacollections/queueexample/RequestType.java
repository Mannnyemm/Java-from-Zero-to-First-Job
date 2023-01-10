package com.manny.javacollections.queueexample;

public enum RequestType {
	//    <write your code here>
	// Constant request types
	OTHER(Priority.LOW), CHANGE_ACCOUNT_DETAILS(Priority.LOW), CAN_NOT_LOGIN(Priority.MEDIUM),
	ACCOUNT_IS_BLOCKED(Priority.MEDIUM), COOPERATION(Priority.MEDIUM), ACCOUNT_IS_HACKED(Priority.HIGH),
	CAN_NOT_COMPLETE_PURCHASE(Priority.HIGH), ORDER_IS_NOT_RECEIVED(Priority.HIGH);
	
	// Field - Priority of a request type
	Priority priority;

	// Constructor
	RequestType(Priority priority) {
		this.priority = priority;
	}
	
	// Returns the priority of a RequestType
	public Priority getPriority() {
		return priority;
	}
}
