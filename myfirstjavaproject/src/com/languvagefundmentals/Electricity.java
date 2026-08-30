
package com.languvagefundmentals;

import java.util.Scanner;

public class Electricity {

	double bill = 0;

	public static void main(String[] args) {

		Electricity e = new Electricity();
		Scanner sc = new Scanner(System.in);
		System.out.println("=====ELECTRICITY BILL");

		System.out.println("Enter Customer ID:");
		int id = sc.nextInt();
		System.out.println("Enter Name ");
		String name = sc.next();
		System.out.println("enter units:");
		double units = sc.nextDouble();

		e.customerDetails(id, name);
		e.showUnits(units);
		e.calculateBill(units);
		e.calculateTax(e.bill);
		e.discount(e.bill, 5);
		e.showBill(e.bill);

		System.out.println("Enter Amount Paid");
		double paid = sc.nextDouble();
		e.payment(e.bill, paid);
		e.billStaus(e.bill);
		sc.close();
	}

	void customerDetails(int id, String name) {
		System.out.println("customer ID:" + id);
		System.out.println("Custome Name:" + name);

	}

	void showUnits(double units) {
		System.out.println("Units Consumed:" + units);
	}

	void calculateBill(double units) {
		if (units <= 100) {
			bill = units * 2;

		} else if (units < 200) {
			bill = (100 * 2) + (units - 100) + 3;
		} else {
			bill = (100 * 2) + (00 * 3) + ((units - 200) * 5);
		}
		System.out.println("Electricity Bill:" + bill);
	}

	void calculateTax(double amount) {
		double tax = amount * 5 / 10;
		bill = bill + tax;
		System.out.println("Tax:" + tax);

	}

	void discount(double amount, double discount) {
		double discountAmount = amount * discount / 100;
		bill = bill - discountAmount;

		System.out.println("Discount:" + amount);
	}

	void showBill(double amount) {
		System.out.println("Total Electricity bill:" + amount);
	}

	void payment(double billAmount, double paidAmount) {
		if (paidAmount >= billAmount) {
			double balance = paidAmount;
			System.out.println("Paymenyt succesfull");
			System.out.println("Balance amount");

		} else {
			double pending = billAmount - paidAmount;
			System.out.println("paymentpending");
			System.out.println("Pending payment:" + pending);
		}
	}

	void billStaus(double amount) {
		if (amount > 0) {
			System.out.println("bill status generated");
		} else {
			System.out.println("NO PENDING BILLS");
		}
	}

}
