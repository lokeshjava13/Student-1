package com.languvagefundmentalsmethods;

import java.util.Scanner;


public class CarRentals {
	
	Scanner sc = new Scanner(System.in);
	String  getCompanyName(String comName) {
		System.out.println("zoom cars Rentals");
		return "zoomcars Rentals";
				
		
	}
	double dailyRate(double rate) {
		System.out.print("Eneter per day amount:   ");
		
		rate = sc.nextDouble();
		
		return rate;
	}
	
	
	double calculateRent(int days,double a ) {
		a = dailyRate(0);
		System.out.println("");
		System.out.print("Enter days : " );
		days = sc.nextInt();
	
		
		return days*a;
	
		
	}
	
	double  getinsurance(double insurance,double b) {
		
		b=calculateRent(0, 0);
		System.out.print("enter Insuramce:  ");
	    insurance=sc.nextDouble();
	    
	    return insurance + b;
	   
	}
	
//	1500
	
	
	public static void main(String[] args) {
		
     CarRentals c1 = new CarRentals();
     
   //  c1.dailyRate(0);
       
       System.out.println("Welcome to zoom cars");
       System.out.println("Comapny Name:"+c1.getCompanyName(null));
      System.out.println(" Total  paid Amount:"+c1.getinsurance(0, 0));
		
		
	}

}
