package com.languvagefundmentalsConstuctors;

import java.util.Scanner;

class Ticket extends Railway {
	int numberOfTickets;
	double price = 500, totalAmount;

	Ticket(String passengerName, int age, String source, String destination, int numberOfTickets) {
		super(passengerName, age, source, destination);
		this.numberOfTickets = numberOfTickets;
	}

	Ticket(String passengerName, int age, String source, String destination) {
		this(passengerName, age, source, destination, 1);
	}

	void bookTicket() {
		totalAmount = numberOfTickets * price;
		System.out.println("Ticket Booked Successfully!");
		System.out.println("Total Amount to Pay: " + totalAmount);
	}

	void displayBookingDetails() {
		System.out.println("\n----- Booking Details -----");
		System.out.println("Passenger Name  : " + passengerName);
		System.out.println("Age             : " + age);
		System.out.println("From            : " + source);
		System.out.println("To              : " + destination);
		System.out.println("no of tickets   :"+numberOfTickets);
		System.out.println("Ticket price    :"+ price);
		System.out.println("final Amount    :"+totalAmount);

	}
}

public class Railway {

	String passengerName;
	String source;
	String destination;
	int age;

	Railway(String passengerName, int age, String source, String destination) {
		this.passengerName = passengerName;
		this.age = age;
		this.source = source;
		this.destination = destination;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Passenger Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Source: ");
		String src = sc.nextLine();
		System.out.print("Enter Destination: ");
		String dest = sc.nextLine();
		System.out.print("Enter Number of Tickets: ");
		int n = sc.nextInt();

		Ticket t1 = new Ticket(name, age, src, dest, n);
		t1.bookTicket();
		t1.displayBookingDetails();
	}

}
