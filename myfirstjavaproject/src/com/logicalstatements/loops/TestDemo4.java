package com.logicalstatements.loops;

import java.util.Scanner;

public class TestDemo4 {

	public static void main(String[] args) {
		System.out.println("Enter Given Number:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		
		for(int i=10;i>=0;i--) {
			
			System.out.println(n+" * "+i+"="+i*n);
			
			
		}

	}

}
