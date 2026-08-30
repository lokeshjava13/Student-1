package com.languvagefundmentalsmethods;
import java.util.Scanner;

public class HotelDetails {
	
	static Scanner sc=new Scanner(System.in);
	
	String HotelDetails(String HotelName,String personName,String Girlfriend) {
		System.out.println("Enetr HotelName:");
		HotelName = sc.next();
		sc.nextLine();
		System.out.println("Eneter Person Name:");
		personName=sc.next();
		sc.nextLine();
		System.out.println("Enter Girlfreind name:");
	     Girlfriend = sc.next();
		
		sc.nextLine();
		return HotelName ;
		
		
	}
	
	double roomCost(double rent,int days) {
		System.out.println("ENTER ROMM RENT:");
		rent = sc.nextDouble();
		sc.nextLine();
		System.out.println("ENter days");
		days = sc.nextInt();
		sc.nextLine();
		
		return rent*days;
	}
	
	float foodCost(float foodPrice,int quantity) {
		System.out.println("Enetr food cost:");
		foodPrice=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter quantity:");
		quantity = sc.nextInt();
		sc.nextLine();
		
		return foodPrice*quantity;

	}
	int totalGuest(int adults,int child) {
		System.out.println("Enetr adults members");
		adults =sc.nextInt();
		
		sc.nextLine();
		System.out.println("ENeter childs:");
		child = sc.nextInt();
		
		return adults+child;
	}
	
	long BookingNumber(long BookingNumber) {
		System.out.println("Eneter Booking Number");
		BookingNumber = sc.nextLong();
		sc.nextLine();
		return BookingNumber;
	}
	
	//char roomType(char type) {
	//	System.out.println("Enter room Type S/D");
	//	type = sc.next().charAt('0');
	//	sc.nextLine();
	//	return type;
		
	//viswanadha}
	boolean isVip(double amount) {
		System.out.println("Enter Bookinh Amount");
		return amount>=10000;
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		
       HotelDetails h =new HotelDetails();
     String name = h.HotelDetails(null,null,null);
     double roomCost = h.roomCost(0, 0);
     float foodCost=h.foodCost(0, 0);
     int totalGuest= h.totalGuest(0, 0);
     long BookingNumber =h.BookingNumber(0);
     
     boolean isVip = h.isVip(0);
     
     System.out.println("HOTEL DETALS:"+name);
     System.out.println("roomcost :"+roomCost);
     System.out.println("food Bill:"+foodCost);
     System.out.println("totalGuest:"+totalGuest); 
     System.out.println("Booking Number:"+BookingNumber); 
   //  System.out.println("Room Type:"+Roomtype);
     System.out.println("isvip:"+isVip);
     
     
     
     
	}

}
