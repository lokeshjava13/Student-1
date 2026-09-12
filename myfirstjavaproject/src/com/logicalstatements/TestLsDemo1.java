package com.logicalstatements;

import java.util.Scanner;



public class TestLsDemo1 {
    static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to RTO office");
		System.out.println("main method stared");
		System.out.println("Enter your name:");
		String name= sc.next();
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("congratulations ");
			System.out.println("you are eligible for Driving liecence");
		}
		else {
			System.out.println("Babu chitti kanna inka chinna pilladive nuvvu thondarapdaku");
			
		}
		System.out.println("main method ended");

	}

}
