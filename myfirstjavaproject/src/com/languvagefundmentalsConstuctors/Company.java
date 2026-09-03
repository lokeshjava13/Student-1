package com.languvagefundmentalsConstuctors;

public class Company {

	String employeeName;
	double salary;
	String companyName;

	Company(String eName, double salary, String companyName) {

		this.employeeName = eName;
		this.salary = salary;
		this.companyName = companyName;

	}

	void displaydetails() {

		System.out.println("Employee Name:" + employeeName);

		System.out.println("Employeee Salary:" + salary);
		System.out.println("Employee company:" + companyName);

	}

	public static void main(String[] args) {
		Company c1 = new Company("lokesh", 30000, "Amazon");
		Company c2 = new Company("ramesh", 20000, "TGH");

		c1.displaydetails();
		System.out.println("--------------------------------------");
		c2.displaydetails();

	}

}
