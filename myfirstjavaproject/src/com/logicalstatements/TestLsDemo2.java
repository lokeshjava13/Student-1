package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo2 {
    static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("check even or odd");
		System.out.println("Enter number:");
		float num=sc.nextFloat();
		
		if(num %2 ==0) {
			System.out.println("this Number is even");
			
		}
		else {
			System.out.println("This Number is odd");
		}

	}

}
