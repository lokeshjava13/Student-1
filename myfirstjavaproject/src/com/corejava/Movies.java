package com.corejava;

public class Movies {
	String movieName;
	int realeasedYear;
	int ticketPrice;
	
	
	public static void main(String[] args) {
		Movies M1 =new Movies();
		Movies M2 = new Movies();
		Movies M3 = new Movies();
		M1.movieName="bahaubali 1";
		M1. realeasedYear=2012;
	    M1.ticketPrice= 250;
		
		
		
		System.out.println("movieName:"+M1.movieName);
		System.out.println("realeasedYear:"+M1. realeasedYear);
		System.out.println("ticketPrice:"+M1.ticketPrice);
		
		M2.movieName="RRR";
		M2. realeasedYear=2022;
	    M2.ticketPrice= 350;
		
		System.out.println("movieName:"+M2.movieName);
		System.out.println(" realeasedYear:"+M2. realeasedYear);
		System.out.println("ticketPrice:"+M2.ticketPrice);
		
		M3.movieName="SALAR";
		M3. realeasedYear=2023;
	    M3.ticketPrice= 350;
		
		System.out.println("movieName:"+M3.movieName);
		System.out.println(" realeasedYear:"+M3. realeasedYear);
		System.out.println("ticketPrice:"+M3.ticketPrice);
			
		}
	}


