package com.languvagefundmentalsmethods;
import java.util.Scanner;

public class ElectricityDetails {
	
	static Scanner sc = new Scanner(System.in);
	
	double  unitCost(double units,double rate) {
		System.out.println("Eneter units:");
		units =sc.nextDouble();
		
		System.out.println("Enter rate");
		rate =sc.nextDouble();
		return units*rate;
	}
	
	int fixedCharge(int charge,int months) {
		System.out.println("Eneter charge:");
		charge = sc.nextInt();
		sc.nextLine();
		System.out.println("Eneter months:");
		months = sc.nextInt();
		sc.nextLine();
		return charge* months;
		
	}
	double totalBill(double unitCost,double fixedCharge) {
		System.out.println("Eneter Unit cost:");
		unitCost = sc.nextDouble();
		sc.nextLine();
		System.out.println("ENter fixedCharge:");
		fixedCharge = sc.nextDouble();
		sc.nextLine();
		return unitCost + fixedCharge;
		
	}
	float taxAmount(float bill,float taxRate) {
		System.out.println("Eneter bill:");
		bill = sc.nextFloat();
		sc.nextLine();
		System.out.println("Eneter tax Rate:");
		taxRate= sc.nextFloat();
		sc.nextLine();
		return  bill*taxRate/100;
		
		
				
	}
	
	String consumerName(String name) {
		System.out.println("Eneter name:");
		name = sc.next();
		sc.nextLine();
		return name;
	}
	
	long meterNumber(long number) {
		System.out.println("ENeter meter number");
		
		number = sc.nextLong();
		sc.nextLine();
		return number;
		
	}
	
	char connectionType(char type) {
		System.out.println("Enter connection Type D/c:");
		type = sc.next().charAt(0);
		return type;
		
		
	}
	
	boolean hignUsage(int units) {
		System.out.println("Enter Units:");
		units = sc.nextInt();
		sc.nextLine();
		return units>300;
	}

	public static void main(String[] args) {
		
		ElectricityDetails e = new ElectricityDetails();
		
		double unitCost = e.unitCost(0, 0);
		int fixedCharge = e.fixedCharge(0, 0);
		double totalbill =e.totalBill(0, 0);
		float  taxAmount =e.taxAmount(0, 0);
		String name = e.consumerName(null);
		long mterNumber =e.meterNumber(0);
		char type = e.connectionType('0');
		boolean highUsage=e.hignUsage(0);
		
		System.out.println("=======electricty Details=====");
		
		System.out.println("unitCost:"+unitCost);
		System.out.println("fixedCharge:"+fixedCharge);
		System.out.println("totalbill:"+totalbill);
		System.out.println("taxAmount:"+taxAmount);
		System.out.println(" mterNumber:"+ mterNumber);
		System.out.println("name:"+name);

		System.out.println(" type:"+ type);
		System.out.println("highUsage:"+highUsage);


		
		

		
		
		

	

}
}