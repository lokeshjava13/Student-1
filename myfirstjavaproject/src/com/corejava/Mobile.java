package com.corejava;

public class Mobile {
	
	static String company= "samsunng stores";
	String brand;
	String model;
	int price;
	int ram;
	static {
		System.out.println("static block called");
	}
	{
		System.out.println("instance block called");
	}
	static void displaycompany() {
		System.out.println("company:"+company);
	}
	void displaymobiledetails(){
		System.out.println("Brand:"+ brand);
		System.out.println("Model:"+ model);
		System.out.println("Price:"+ price);
		System.out.println("ram:"+ ram);
		
		
		
	}
	
	public static void main(String[] args) {
         Mobile.displaycompany();
		
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		Mobile m3 = new Mobile();
	    
		
		m1.brand = "apple";
		m1.model = " appple  16 pro";
		m1.price = 40000;
		m1.ram = 8;
		
		m2.brand = "samsung";
		m2.model = " galaxy A4";
		m2.price = 40000;
		m2.ram =16;
		
		m3.brand = "oneplus";
		m3.model = " 11R";
		m3.price = 40000;
		m3.ram = 16;
		m1.displaymobiledetails();
		m2.displaymobiledetails();
		m3.displaymobiledetails();
	
		

	}
}
