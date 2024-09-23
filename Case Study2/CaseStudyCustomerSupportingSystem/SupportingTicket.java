package com.evergent.Corejava.CaseStudyCustomerSupportingSystem;

import java.util.ArrayDeque;

public class SupportingTicket {
	
	private ArrayDeque<String> ticketQueue = new ArrayDeque<>();
	
	// Method to add a ticket to the queue
    public void addTicket(String ticket) {
        ticketQueue.add(ticket);
        System.out.println("Added ticket: " + ticket);
    }
    
    // Method to process the next ticket in the queue
    public void processNextTicket() {
        String ticket = ticketQueue.poll();
        if (ticket == null) {
            System.out.println("No tickets to process.");
        } else {
            System.out.println("Processing ticket: " + ticket);
        }
    }
    
    // Method to check the next ticket without removing it
    public void peekNextTicket() {
        String ticket = ticketQueue.peek();
        if (ticket == null) {
            System.out.println("No tickets in the queue.");
        } else {
            System.out.println("Next ticket in queue: " + ticket);
        }
    }
    
    // Method to display all tickets currently in the queue
    public void displayQueue() {
        if (ticketQueue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Tickets in queue: " + ticketQueue);
        }
    }
	
	public static void main(String[] args) {
		SupportingTicket system = new SupportingTicket();
		
		system.addTicket("Issue with login");
        system.addTicket("Cannot reset password");
        system.addTicket("Billing query");
        system.displayQueue();

        system.processNextTicket();
        system.processNextTicket();

        system.peekNextTicket();

        system.displayQueue();

        system.processNextTicket();
        system.processNextTicket();
	}

}
