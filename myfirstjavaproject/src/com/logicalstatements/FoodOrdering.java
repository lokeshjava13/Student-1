package com.logicalstatements;

import java.util.Scanner;

public class FoodOrdering {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("loki foods");
		System.out.println("menu");
		System.out.println("1--> pizza         ₹200");
		System.out.println("2--> Burger        ₹120");
		System.out.println("3--> Bhiryani      ₹180");
		System.out.println("4--> Noodles       ₹100");
		
		
		double totalPrice=0;
		String loki="";
		
		String yn="";
		do {
			System.out.println("Selecte your item 1-4");
		int food=sc.nextInt();
		System.out.println("Enter quantity");
		int qty=sc.nextInt();
		
		switch(food) {
		
		case 1->{
			 double pizzaPrice=200 *qty;
			System.out.println("pizza     price   "+ pizzaPrice);
			  loki=loki+"pizza             "+pizzaPrice +"\n";
			 totalPrice+=pizzaPrice;
			 
		}
		case 2 ->{
			System.out.println("Burger   ");
			double bPrice=120*qty;
			System.out.println("burger Amount :"+   bPrice);
			loki=loki+"Burger          "+bPrice +"\n";
			totalPrice+=bPrice;
		}
		
		case 3->{
			System.out.println("   Bhiryani");
			double bhPrice=180*qty;
			System.out.println("Bhiryani price  "+bhPrice);
			loki=loki+"Bhiryani        "+bhPrice +"\n";
			
			totalPrice+=bhPrice;
			
		}
		case 4->{
			System.out.println("Noodles");
			
			double nPrice=100*qty;
			System.out.println("Noodle price"+nPrice);
			loki=loki+"noodles          "+nPrice +"\n";
			
			totalPrice+=nPrice;
				
			}default->System.out.println("enter valid number choose 1-4");
		}
		System.out.println("continue too this add food item  y/n");
		yn=sc.next();
		
		}while(yn.equalsIgnoreCase("y"));
		
		
		System.out.println(loki);
		System.out.println("-------------------------------");
		
			
		
		System.out.println("Totall   bill     :"+totalPrice);
		
		
		

	}

}
