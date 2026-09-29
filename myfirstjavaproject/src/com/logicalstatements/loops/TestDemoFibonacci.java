package com.logicalstatements.loops;

import java.util.Scanner;

public class TestDemoFibonacci {
	
	static void fibonacci(int n) {
		int f1=0;
		int f2=1;
		System.out.println(f1+f2);
		for(int i= 2;i<=n;i++) {
			int f3=f2+f1;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
		
	}

	public static void main(String[] args) {
		System.out.println("ENter Given Number");
		
		Scanner sc= new Scanner(System.in);
	    int n =sc.nextInt();
		fibonacci(n);

	}

}
