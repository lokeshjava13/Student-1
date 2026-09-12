package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Jersey Number");
		int jno =sc.nextInt();
		  switch(jno) {
		  
		  
		case  7:
			System.out.println("Mahendra sing Dhonii + jersy no is : 7");
			System.out.println("cool Captain");
			System.out.println("");
			
		case 45:
			System.out.println("Rohith Sharma + Jersey Number is 45");
			System.out.println("He is a Consistant player");
			System.out.println("he is good batsman and good captain");
			
		case 18:
			System.out.println("he is a good batsman and he is ver talentsed ,"
					+ "right handed batsman "
					+ "he is staying in london");
		 
		  
		  default:
		  System.out.println("this number not in lits23");
		  }

	}

}
