package com.manny.javacollections.queueexample;

public class DefaultSupportTicket implements SupportTicket {
//	<write your code here>
	// Fields
	
	// A ticket's RequestType
	private RequestType requestType;
	
	// Total tickets
	private static int ticketCount = 0;
	
	// A ticket's id
	private int ticketId;
	
	// Initialize: Always assign ticketId whenever a new support ticket is created
	{
		this.ticketId = ++ticketCount;
	}
	
	// Constructor
	public DefaultSupportTicket(RequestType requestType) {
		super();
		this.requestType = requestType;	
	}
	
	// Empty Constructor
	public DefaultSupportTicket() {
		
	}
	
	@Override
	public Priority getPriority() {
		if (requestType == null) {
			return null;
		}
		return this.requestType.getPriority();
	}
	
	@Override
	public int getSequentialNumber() {
		return this.ticketId;
	}
	@Override
	public RequestType getRequestType() {
		return this.requestType;
	}

//	@Override
//	public String toString() {
//		return "DefaultSupportTicket [requestType=" + requestType + ", ticketId=" + ticketId + "]";
//	}
	
}
