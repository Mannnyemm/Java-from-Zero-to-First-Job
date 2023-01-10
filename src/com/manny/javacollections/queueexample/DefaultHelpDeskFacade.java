package com.manny.javacollections.queueexample;

import java.util.Queue;
import java.util.PriorityQueue;

public class DefaultHelpDeskFacade implements HelpDeskFacade {
	//	<write your code here>
	
	// Queue to hold support tickets; process them according to custom comparator
	private Queue<SupportTicket> ticketsQueue;
	
	// Initializes ticketsQueue
	{
		ticketsQueue = new PriorityQueue<>(new CustomSupportTicketsComparator());
	}

	@Override
	/**
	 * Adds a given supportTicket to ticketsQueue
	 * @params supportTicket - SupportTicket to add to Queue
	 */
	public void addNewSupportTicket(SupportTicket supportTicket) {
		ticketsQueue.offer(supportTicket);
	}

	@Override
	/**
	 *  Return next ticket in ticketsQueue and remove it from the HelpDesk
	 *  @return SupportTicket - next ticket in ticketsQueue, else null if ticketsQueue is empty
	 */
	public SupportTicket getNextSupportTicket() {
		return ticketsQueue.poll();
	}

	@Override
	/**
	 * @return amount of tickets that are not processed
	 */
	public int getNumberOfTickets() {
		return ticketsQueue.size();
	}

}
