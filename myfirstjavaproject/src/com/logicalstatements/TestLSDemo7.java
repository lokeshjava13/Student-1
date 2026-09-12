package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo7 {

	public static void main(String[] args) {
		System.out.println("Welcome to my Schools");
		String yn = "";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first Number");
			double d1 = sc.nextDouble();

			System.out.println("Enter second Number :");
			double d2 = sc.nextDouble();
			System.out.println("Enter symbol for using yiur caslculation" + "  +  -  /  % *");
			String symb = sc.next();

			switch (symb) {

			case " + ":
				System.out.println("Sum of Two Numbers is :" + (d1 + d2));
			case "-":
				System.out.println("Difference of two numbers is :" + (d1 - d2));
			case "*":
				System.out.println("product  of two numbers is :" + (d1 * d2));
			case "/":
				System.out.println("quotient of two numbers is :" + (d1 / d2));
			case "%":
				System.out.println("remainder of two numbers is :" + (d1 % d2));
			default:
				System.out.println("Invalid Symbol enterd please check ");

			}
			System.out.println("Do you want to Continue ...." + "Click Y for yes Click N for no");
			yn = sc.next();

		} while (yn.contentEquals(yn));
		System.out.println("You Clicked For Exist");

	}

}
