package com.languvagefundmentalsmethods;

import java.util.Scanner;

public class Hotel {
	
	

	void customerDetails(String name, int age) {
		System.out.println("Customer Name: " + name);
		System.out.println("Age: " + age);
	}

	void roomDetails(int roomNo, String roomType) {
		System.out.println("Room Number: " + roomNo);
		System.out.println("Room Type: " + roomType);
	}

	void calculateRoomBill(double price, int days) {
		double bill = price * days;
		System.out.println("Room Bill: ₹" + bill);
	}

	void foodBill(double foodAmount, double tax) {
		double total = foodAmount + (foodAmount * tax / 100);
		System.out.println("Food Bill: ₹" + total);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Hotel h = new Hotel();

		System.out.print("Enter customer name: ");
		String name = sc.nextLine();

		System.out.print("Enter age: ");
		int age = sc.nextInt();

		System.out.print("Enter room number: ");
		int roomNo = sc.nextInt();

		sc.nextLine();

		System.out.print("Enter room type: ");
		String roomType = sc.nextLine();

		System.out.print("Enter room price per day: ");
		double price = sc.nextDouble();

		System.out.print("Enter number of days: ");
		int days = sc.nextInt();

		System.out.print("Enter food bill: ");
		double food = sc.nextDouble();

		System.out.print("Enter food tax percentage: ");
		double tax = sc.nextDouble();

		System.out.println("\n--- Hotel Details ---");

		h.customerDetails(name, age);
		h.roomDetails(roomNo, roomType);
		h.calculateRoomBill(price, days);
		h.foodBill(food, tax);

		sc.close();
	}
}