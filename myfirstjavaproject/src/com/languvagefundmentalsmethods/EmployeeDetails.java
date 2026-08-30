package com.languvagefundmentalsmethods;

import java.util.Scanner;

public class EmployeeDetails {

	static Scanner sc = new Scanner(System.in);

	double totalSal(double basicsal, double allowances) {
		System.out.println("Eneter Basic Salary:");
		basicsal = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Allowances:");
		allowances = sc.nextDouble();
		sc.nextLine();
		return basicsal + allowances;

	}

	double calculateBonus(double bonusSal, double percentage) {
		System.out.println("Enter Bonus Salry:");
		bonusSal = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Percentage:");
		percentage = sc.nextDouble();
		sc.nextLine();
		return bonusSal + percentage / 100;

	}

	long annuvalSalary(long annuvalSal, long months) {
		System.out.println("Eneter Annuval salary:");
		annuvalSal = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter months:");
		months = sc.nextLong();
		sc.nextLine();
		return annuvalSal + months;

	}

	int experince(int joiningYear, int currentYear) {
		System.out.println("Enter joining Year:");
		joiningYear = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter current Year:");
		currentYear = sc.nextInt();
		sc.nextLine();
		return joiningYear - currentYear;
	}

	String employeeName(String name) {
		System.out.println("Enter name:");
		name = sc.next();
		return name;
	}

	char employeeGrade(char grade) {

		System.out.println("Enter Gender:");
		grade = sc.next().charAt(0);
		sc.nextLine();

		return grade;

	}

	boolean checkeligibilty(int age, double sal) {

		System.out.println("Eneter age:");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter salary:");
		sal = sc.nextDouble();
		sc.nextLine();
		return age >= 18 && sal >= 50000;

	}

	float calculateTax(float sal, float taxRate) {
		System.out.println("ENter salary:");
		sal = sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter Taxrate");
		taxRate = sc.nextFloat();
		sc.nextLine();
		return sal * taxRate / 100;

	}

	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();

		double salary = e.totalSal(0, 0);
		double bonus = e.calculateBonus(0, 0);
		long annuvalSal = e.annuvalSalary(0, 0);
		int experience = e.experince(0, 0);
		char grade = e.employeeGrade('0');
		String name = e.employeeName(null);
		boolean eligibility = e.checkeligibilty(0, 0);
		float tax = e.calculateTax(0, 0);

		System.out.println("Name:" + name);
		System.out.println("Salary:" + salary);
		System.out.println("Bonus:" + bonus);
		System.out.println("Annuval Salary:" + annuvalSal);

		System.out.println("Experience:" + experience);
		System.out.println("Eligibility:" + eligibility);
		System.out.println("Grade:" + grade);
		System.out.println("Tax " + tax);

	}

}
