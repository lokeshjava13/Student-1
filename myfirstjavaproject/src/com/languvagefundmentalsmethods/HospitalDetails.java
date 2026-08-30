package com.languvagefundmentalsmethods;
import java.util.Scanner;

public class HospitalDetails {

	

	    static Scanner sc = new Scanner(System.in);

	    
	    double consultationFee(double fee, int visits) {
	        System.out.print("Enter consultation fee: ");
	        fee = sc.nextDouble();
	        sc.nextLine();

	        System.out.print("Enter number of visits: ");
	        visits = sc.nextInt();
	        sc.nextLine();

	        return fee * visits;
	    }

	    
	    float medicineCost(float price, int quantity) {
	        System.out.print("Enter medicine price: ");
	        price = sc.nextFloat();
	        sc.nextLine();

	        System.out.print("Enter quantity: ");
	        quantity = sc.nextInt();
	        sc.nextLine();

	        return price * quantity;
	    }

	 
	    double roomCost(double rent, int days) {
	        System.out.print("Enter room rent per day: ");
	        rent = sc.nextDouble();
	        sc.nextLine();

	        System.out.print("Enter number of days: ");
	        days = sc.nextInt();
	        sc.nextLine();

	        return rent * days;
	    }

	    
	    int totalTests(int bloodTests, int scanTests) {
	        System.out.print("Enter blood tests: ");
	        bloodTests = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter scan tests: ");
	        scanTests = sc.nextInt();
	        sc.nextLine();

	        return bloodTests + scanTests;
	    }

	    
	    String patientName(String name) {
	        System.out.print("Enter patient name: ");
	        name = sc.next();
	        sc.nextLine();

	        return name;
	    }

	    
	    long patientId(long id) {
	        System.out.print("Enter patient ID: ");
	        id = sc.nextLong();
	        sc.nextLine();

	        return id;
	    }

	    
	    char patientGender(char gender) {
	        System.out.print("Enter gender M/F: ");
	        gender = sc.next().charAt(0);
	        sc.nextLine();

	        return gender;
	    }

	    
	    boolean emergency(int condition) {
	        System.out.print("Enter emergency level (1-10): ");
	        condition = sc.nextInt();
	        sc.nextLine();

	        return condition >= 7;
	    }
	    public static void main(String[] args) {

	        HospitalDetails h = new HospitalDetails();

	        double consultation = h.consultationFee(0, 0);
	        System.out.println("Consultation Cost: " + consultation);

	        float medicine = h.medicineCost(0, 0);
	        System.out.println("Medicine Cost: " + medicine);

	        double room = h.roomCost(0, 0);
	        System.out.println("Room Cost: " + room);

	        int tests = h.totalTests(0, 0);
	        System.out.println("Total Tests: " + tests);

	        String name = h.patientName("");
	        System.out.println("Patient Name: " + name);

	        long id = h.patientId(0);
	        System.out.println("Patient ID: " + id);

	        char gender = h.patientGender(' ');
	        System.out.println("Gender: " + gender);

	        boolean emergency = h.emergency(0);
	        System.out.println("Emergency: " + emergency);
	    }
	}
