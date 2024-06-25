package com.faayeez.assignment.assignment4;

public class Tickets {
	
	private int ticketNo; // instance variable
	private static int availableTickets; // static variable
	
	// Static block to initialize the available tickets
	static {
		availableTickets = 5; 
	}

	// Default constructor
	Tickets() {
		if (availableTickets > 0) {
			availableTickets--;
			ticketNo = 5 - availableTickets;
		} else {
			System.out.println("No tickets available.");
			ticketNo = -1; // Indicates no ticket
		}
	}
	
	// Static method to display the available tickets
	static void displayTickets() {
		System.out.println("Available Tickets: " + availableTickets);
	}

	@Override
	public String toString() {
		if (ticketNo == -1) {
			return "No ticket issued.";
		}
		return "Tickets [Ticket Number=" + ticketNo + "]";
	}
}
