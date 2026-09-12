package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("ENter age:");
		int age = sc.nextInt();

		if (age > 50) {
			System.out.println("Yes  you are senior citizen");
		} else {
			System.out.println("you are junior");
		}
	}

}
