package com.languvagefundmentalsmethods;

import java.util.Scanner;

public class ShoppingDetails {

	static Scanner sc = new Scanner(System.in);

	double productTotal(double price, double quantity) {
		System.out.print("Enter product price: ");
		price = sc.nextDouble();

		System.out.print("Enter quantity: ");
		quantity = sc.nextDouble();

		return price * quantity;
	}

	float discountAmount(float price, float discount) {
		System.out.print("Enter price: ");
		price = sc.nextFloat();

		System.out.print("Enter discount percentage: ");
		discount = sc.nextFloat();

		return price * discount / 100;
	}

	double gstAmount(double price, double gst) {
		System.out.print("Enter price: ");
		price = sc.nextDouble();

		System.out.print("Enter GST percentage: ");
		gst = sc.nextDouble();

		return price * gst / 100;
	}

	int totalItems(int item1, int item2) {
		System.out.print("Enter item 1 quantity: ");
		item1 = sc.nextInt();

		System.out.print("Enter item 2 quantity: ");
		item2 = sc.nextInt();

		return item1 + item2;
	}

	String productName(String name) {
		System.out.print("Enter product name: ");
		name = sc.next();

		return name;
	}

	char category(char category) {
		System.out.print("Enter category letter: ");
		category = sc.next().charAt(0);

		return category;
	}

	boolean discountEligible(double amount) {
		System.out.print("Enter shopping amount: ");
		amount = sc.nextDouble();

		return amount >= 5000;
	}

	long orderNumber(long number) {
		System.out.print("Enter order number: ");
		number = sc.nextLong();

		return number;
	}

	public static void main(String[] args) {

		ShoppingDetails s = new ShoppingDetails();

		double total = s.productTotal(0, 0);
		System.out.println("Product Total: " + total);

		float discount = s.discountAmount(0, 0);
		System.out.println("Discount Amount: " + discount);

		double gst = s.gstAmount(0, 0);
		System.out.println("GST Amount: " + gst);

		int items = s.totalItems(0, 0);
		System.out.println("Total Items: " + items);

		String product = s.productName("");
		System.out.println("Product Name: " + product);

		char cat = s.category(' ');
		System.out.println("Category: " + cat);

		boolean eligible = s.discountEligible(0);
		System.out.println("Discount Eligible: " + eligible);

		long order = s.orderNumber(0);
		System.out.println("Order Number: " + order);
	}
}