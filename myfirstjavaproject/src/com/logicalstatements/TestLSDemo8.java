package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo8 {

	public static void main(String[] args) {
		System.out.println("Enter days In Number 1to7:");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		switch (d) {
		case 1 -> System.out.println("MONDAY");
		case 2 -> System.out.println("TUESDAY");
		case 3 -> System.out.println("WEDNESDAY");
		case 4 -> System.out.println("THURSDAY");
		case 5 -> System.out.println("FRIAY");

		case 6 -> System.out.println("SATURDAY");
		case 7 -> System.out.println("SUNDAY");
		default -> System.out.println("Invalid Day");

		}

	}

}

