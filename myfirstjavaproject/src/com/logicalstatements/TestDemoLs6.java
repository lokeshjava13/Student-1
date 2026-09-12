package com.logicalstatements;

import java.util.Scanner;

public class TestDemoLs6 {
	public static void main(String[] args) {
		System.out.println("WELCOME TO SHOPPING MALL");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your t shirt size:");
		int size = sc.nextInt();
		
			
		
		switch(size) {
		case 36: System.out.println("Based on your t shirt number the size would Small ");
		System.out.println("the price 999/-");
		
		case 38: System.out.println("Based on your t shirt number the size would Small ");
		System.out.println("the price 999/-");
		case 40: System.out.println("Based on your t shirt number the size would medium");
		System.out.println("the price 999/-");
		case 42: System.out.println("Based on your t shirt number the size would large ");
		System.out.println("the price 1050/-");
		case 44: System.out.println("Based on your t shirt number the size would x large");
		System.out.println("the price 1111/-");
		case 46: System.out.println("Based on your t shirt number the size would xxl");
		System.out.println("the price 1500/-");
		
		default:System.out.println("this size not avilable in my shooping mall"
				+ "thank you for visiting");
	
		}
		
	}

}
