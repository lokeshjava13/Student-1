package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo9 {

	public static void main(String[] args) {
		System.out.println("MAIN METHOD STARTED");
		Scanner sc = new Scanner(System.in);
		String yn="";
		do {
			System.out.println("Enter Month 1to 12:");
			int m=sc.nextInt();
			switch (m) {
			
			case 1,3,5,7,8,10,12->System.out.println("31 days this Month");
			
			case 4,6,9,11 ->System.out.println("30 days this month");
			case 2 ->System.out.println("28/29 this month");
			default->System.out.println("Invalid Number ");
			}
			System.out.println("Continue ?....y/n");
			yn =sc.next();
			
		}while(yn.equalsIgnoreCase("y"));
		System.out.println("you are EXIT");
		

	}

}
