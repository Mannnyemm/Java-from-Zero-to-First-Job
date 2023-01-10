package com.manny.javacollections.queueexample;

import java.util.Comparator;

public class CustomSupportTicketsComparator implements Comparator<SupportTicket> {
	//    <write your code here>
    
	/**
	 * Compares two Support tickets
	 */
	@Override
	public int compare(SupportTicket o1, SupportTicket o2) {
		// Return 0 if any  of parameters is null or has no priority
		if (o1 == null || o2 == null || o1.getPriority() == null || o2.getPriority() == null) {
			return 0;
		}
		
		// Compare tickets using their ticketId if both tickets has the same priority 
		if (o2.getPriority().compareTo(o1.getPriority()) == 0) {
			return o1.getSequentialNumber() - o2.getSequentialNumber();
		}
		// Return negative if o1 is bigger else positive if o2 is bigger
		return o2.getPriority().compareTo(o1.getPriority());
	}

}
