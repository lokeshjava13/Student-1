package com.languvagefundmentalsmethods;

import java.util.Scanner;

public class Hospital {

	void welcome() {
		System.out.println("Welcome to Hospital");
	}

	void patientDetails(String name, int age) {
		System.out.println("Patient Name = " + name);
		System.out.println("Patient Age = " + age);
	}

	void doctorDetails(String doctorName, String department) {
		System.out.println("Doctor Name = " + doctorName);
		System.out.println("Department = " + department);
	}

	void calculateBill(double consultationFee, double medicineFee) {
		double total = consultationFee + medicineFee;
		System.out.println("Total Bill = Rs. " + total);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Hospital h = new Hospital();

		h.welcome();

		System.out.print("Enter Patient Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Patient Age: ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Doctor Name: ");
		String doctorName = sc.nextLine();

		System.out.print("Enter Department: ");
		String department = sc.nextLine();

		System.out.print("Enter Consultation Fee: ");
		double consultationFee = sc.nextDouble();

		System.out.print("Enter Medicine Fee: ");
		double medicineFee = sc.nextDouble();

		h.patientDetails(name, age);
		h.doctorDetails(doctorName, department);
		h.calculateBill(consultationFee, medicineFee);

		sc.close();
	}
}
