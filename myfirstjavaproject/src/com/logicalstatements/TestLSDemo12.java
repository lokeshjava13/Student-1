package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo12 {

	public static void main(String[] args) {
		System.out.println("WELCOME TO BHARGAV VEGETABLE SHOP");
		Scanner sc = new Scanner(System.in);
		String yn="";
		double total=0;
		
			System.out.println("AVAILABLE ITEMS SHOP"); 
			System.out.println("1->bhirakayalu"); 
			System.out.println("2->BENDAKAYYALU"); 
			System.out.println("3->DONDAKAYYALU"); 
			System.out.println("4->KAKARAKAYYALU"); 
			System.out.println("5->TOMATO"); 
			System.out.println("6->VANKAYYALU"); 
			System.out.println("7->DOSAKAYYALU"); 
			System.out.println("8->MIRAPAKAYYALU"); 
			do {
			
			System.out.println("Enter your selected items in numbers:...");
			
			int y=sc.nextInt();
			
			switch(y) {
			case 1 :System.out.println("BHIRAKAYYALU  :₹ 40");
			total=total+40;
			break;
			case 2 :System.out.println("bendakayyalu  :₹ 30");
			total=total+30;
			break;
			
			case 3 :System.out.println("dondakayyalu  :₹ 35");
			total=total+35;
			break;
			case 4 :System.out.println("kakarakayyalu :₹ 38");
			total=total+38;
			break;
			
			case 5 :System.out.println("tomato        :₹ 40");
			total=total+40;
			break;
			case 6 :
			        System.out.println("vankayyalu    :₹ 45");
			total=total+45;
			break;
			case 7: System.out.println("dosakayyalu   :₹ 20");
			total=total+20;
			break;
			case 8:System.out.println("mirapakayyalu  :₹ 50");
			total=total+50;
			break;
			default :System.out.println("MA DAGGARA LEVA BABU ");
			break;
			}
			System.out.println("continue for next y/n");
			yn=sc.next();
			
		
			
		}while(yn.equalsIgnoreCase("y"));
		System.out.println("--------------------------------------");
		System.out.println("TOTAL BILL:"+total);
		System.out.println("thank you for coming");
		sc.close();
		
		

	}

}
