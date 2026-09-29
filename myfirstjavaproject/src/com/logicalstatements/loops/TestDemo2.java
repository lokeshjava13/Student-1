package com.logicalstatements.loops;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
		
//		for (int i=1;i<=20;i++) {
//			System.out.println(i);
//			
//		}
		
		
//		for(int i=1;i<=50;i++) {
//			
//			if(i%2==0){
//			
//			System.out.println(i);
//			}
//		}
      Scanner sc = new Scanner(System.in);
      System.out.println(" ENter n:");
      int n=sc.nextInt();
      int sum=0;
		
		for(int i=1;i<=n;i++) {
			if(i%3==0&&i%5==0) {
				sum=sum+i;
			
			}
			
		}
		System.out.println(sum);
		System.out.println("main method ended");
	}

}
