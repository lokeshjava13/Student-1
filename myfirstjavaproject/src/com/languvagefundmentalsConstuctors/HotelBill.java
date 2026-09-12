package com.languvagefundmentalsConstuctors;

import java.util.Scanner;

public class HotelBill {

	String roomType;
	int numDays;
	double roomPrice;
	double foodCharges;
	double roomCost;
	double finalBill;

	HotelBill() {
		System.out.println("Hotel Bill Object Created");
	}

	HotelBill(String roomType) {
		this();
		this.roomType = roomType;
	}

	HotelBill(String roomType, int numDays, double roomPrice) {
		this(roomType);
		this.numDays = numDays;
		this.roomPrice = roomPrice;
		this.roomCost = this.roomPrice * this.numDays;
	}

	HotelBill(String roomType, int numDays, double roomPrice, double foodCharges) {
		this(roomType, numDays, roomPrice);
		this.foodCharges = foodCharges;
		this.finalBill = this.roomCost + this.foodCharges;
	}

	void displayBill() {
		System.out.println("\n----- Hotel Bill -----");
		System.out.println("Room Type      : " + roomType);
		System.out.println("Room Price     : " + roomPrice);
		System.out.println("Number of Days : " + numDays);
		System.out.println("Room Cost      : " + roomCost);
		System.out.println("Food Charges   : " + foodCharges);
		System.out.println("Final Bill     : " + finalBill);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Room Type: ");
		String type = sc.nextLine();

		System.out.print("Enter Number of Days: ");
		int days = sc.nextInt();

		System.out.print("Enter Room Price: ");
		double price = sc.nextDouble();

		System.out.print("Enter Food Charges: ");
		double food = sc.nextDouble();

		HotelBill bill = new HotelBill(type, days, price, food);
		bill.displayBill();

		sc.close();
	}
}
