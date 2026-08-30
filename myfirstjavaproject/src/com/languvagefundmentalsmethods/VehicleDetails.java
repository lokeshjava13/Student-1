package com.languvagefundmentalsmethods;
import java.util.Scanner;

public class VehicleDetails {

	
	    static Scanner sc = new Scanner(System.in);

	    
	    double calculateSpeed(double distance, double time) {
	        System.out.print("Enter distance: ");
	        distance = sc.nextDouble();
	        sc.nextLine();

	        System.out.print("Enter time: ");
	        time = sc.nextDouble();
	        sc.nextLine();

	        return distance / time;
	    }

	    
	    float calculateDistance(float speed, float time) {
	        System.out.print("Enter speed: ");
	        speed = sc.nextFloat();
	        sc.nextLine();

	        System.out.print("Enter time: ");
	        time = sc.nextFloat();
	        sc.nextLine();

	        return speed * time;
	    }

	    
	    double fuelCost(double litres, double price) {
	        System.out.print("Enter fuel litres: ");
	        litres = sc.nextDouble();
	        sc.nextLine();

	        System.out.print("Enter price per litre: ");
	        price = sc.nextDouble();
	        sc.nextLine();

	        return litres * price;
	    }

	    
	    int totalKilometers(int km1, int km2) {
	        System.out.print("Enter first trip kilometers: ");
	        km1 = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter second trip kilometers: ");
	        km2 = sc.nextInt();
	        sc.nextLine();

	        return km1 + km2;
	    }

	    
	    long vehicleNumber(long number) {
	        System.out.print("Enter vehicle number: ");
	        number = sc.nextLong();
	        sc.nextLine();

	        return number;
	    }

	   
	    String vehicleBrand(String brand) {
	        System.out.print("Enter vehicle brand: ");
	        brand = sc.next();
	        sc.nextLine();

	        return brand;
	    }

	    
	    char vehicleType(char type) {
	        System.out.print("Enter vehicle type C/B: ");
	        type = sc.next().charAt(0);
	        sc.nextLine();

	        return type;
	    }

	    
	    boolean serviceRequired(int kilometers) {
	        System.out.print("Enter vehicle kilometers: ");
	        kilometers = sc.nextInt();
	        sc.nextLine();

	        return kilometers >= 10000;
	    }

	    public static void main(String[] args) {

	        VehicleDetails v = new VehicleDetails();

	        double speed = v.calculateSpeed(0, 0);
	        System.out.println("Speed: " + speed);

	        float distance = v.calculateDistance(0, 0);
	        System.out.println("Distance: " + distance);

	        double fuel = v.fuelCost(0, 0);
	        System.out.println("Fuel Cost: " + fuel);

	        int total = v.totalKilometers(0, 0);
	        System.out.println("Total Kilometers: " + total);

	        long number = v.vehicleNumber(0);
	        System.out.println("Vehicle Number: " + number);

	        String brand = v.vehicleBrand("");
	        System.out.println("Vehicle Brand: " + brand);

	        char type = v.vehicleType(' ');
	        System.out.println("Vehicle Type: " + type);

	        boolean service = v.serviceRequired(0);
	        System.out.println("Service Required: " + service);
	    }
	}