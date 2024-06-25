package com.faayeez.assignment.assignment4;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Display available tickets before any booking
				Tickets.displayTickets();
				
				// Book tickets
				Tickets ticket1 = new Tickets();
				System.out.println(ticket1);
				Tickets.displayTickets();
				
				Tickets ticket2 = new Tickets();
				System.out.println(ticket2);
				Tickets.displayTickets();
				
				Tickets ticket3 = new Tickets();
				System.out.println(ticket3);
				Tickets.displayTickets();
				
				Tickets ticket4 = new Tickets();
				System.out.println(ticket4);
				Tickets.displayTickets();
				
				Tickets ticket5 = new Tickets();
				System.out.println(ticket5);
				Tickets.displayTickets();
				
				// Attempt to book a sixth ticket (should not be available)
				Tickets ticket6 = new Tickets();
				System.out.println(ticket6);
				
				// Display available tickets after booking
				Tickets.displayTickets();

	}

}
