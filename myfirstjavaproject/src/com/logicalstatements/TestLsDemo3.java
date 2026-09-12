package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo3 {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Main Methiod Started");
		
		System.out.println("ENter Number:");
		int num=sc.nextInt();
		
		if(num>0) {
			System.out.println("this number is positive");
		}
		else {
			System.out.println("This Number is Negitive");
		}
		

	}

}
