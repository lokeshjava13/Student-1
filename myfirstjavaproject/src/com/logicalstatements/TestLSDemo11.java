package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo11 {

	public static void main(String[] args) {
		System.out.println("welcom to Godavari foods");
		Scanner sc = new Scanner(System.in);
		String yn="";
		do {
			
			System.out.println("AVAILABLE ITEMS");
			System.out.println("1->CHICKEN BHIRYANI");
			System.out.println("2->MUTTON BHIRYANI ");
			System.out.println("3->PRAWNS BHIRYANI");
			System.out.println("4-> MIXED BHIRYANI");
			System.out.println("5->FRIED PIECE BHIRYANI");
			System.out.println("6->DILKUSH BHIRYANI");
			int r=sc.nextInt();
			
			switch(r) {
			case 1 ->System.out.println("CHICKEN BHIRYANI    :₹250");
			case 2 ->System.out.println("MUTTON BHIRYANII    :₹450");
			case 3 ->System.out.println("PRAWNS BHIRYANI     :₹320");
			case 4 ->System.out.println("MIXED BHIRYANI      :₹450");
			case 5 ->System.out.println("FRIED PIECE BHIRYANI:₹300");
			case 6 ->System.out.println("DILKUSH BHIRYANI    :₹280");
			default ->System.out.println("Not Available This Item");
			}
			System.out.println("continue to eat y/n");
			yn=sc.next();
		
		
			
		}while(yn.equalsIgnoreCase("y"));
		System.out.println("THANK YOU FOR COMING");
		

	}

}
