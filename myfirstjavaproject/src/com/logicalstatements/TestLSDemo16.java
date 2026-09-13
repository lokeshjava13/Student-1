package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo16 {

	public static void main(String[] args) {
		System.out.println("NATUKOLLA FARMING");
		Scanner sc = new Scanner(System.in);
		String yn = "";
		double total = 0;

		do {
			System.out.println("Enter kodi type 1 us male ,2 is female");
			int type = sc.nextInt();
			System.out.println("Enter age in months:");
			int age = sc.nextInt();
			System.out.println("Enter weight in kg:");
			double kg = sc.nextInt();
			double price = 0;

			if (type == 1) {
				if (age < 3) {
					System.out.println("pilla kodi-small");
					price = 200 * kg;
				} else if (age >= 3 && age <= 8) {
					System.out.println("young punju- medium growth");
					price = 500 * kg;

				} else if (age > 8) {
					System.out.println("full from growth -premium");
					if (kg > 3) {
						price = 800 * kg;

					} else {
						price = 600 * kg;
					}
				}
			} else if (type == 2) {
				if (age < 6) {
					System.out.println("petta pilla");
					price = 300 * kg;
				} else {
					System.out.println("guduki vachina petta - high demand");
					price = 500 * kg;

				}

			} else {
				System.out.println("Wrong type");
			}
			System.out.println("price of this kodi:" + price);
			total = total + price;
			System.out.println("add more y/n");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));
		
		System.out.println("final bill:₹"+total+"/--");

	}
}
