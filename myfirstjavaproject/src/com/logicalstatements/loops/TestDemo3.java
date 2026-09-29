package com.logicalstatements.loops;

import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
      
		System.out.println("Main method ended");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number");
		int n=sc.nextInt();
		
		boolean prime=isPrime(n);
		if(prime) {
			System.out.println("its prime number");
		}else {
			System.out.println("it is not prime Number");
		}
		
		
	}
	
	static boolean isPrime(int n) {
		boolean status=true;
		
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {
				
				status=false;
				
			}
		}
		
		return status;
		
	}
	

}
