package com.languvagefundmentalsmethods;

import java.util.Scanner;

public class School {

	void studentDetails(String name, int rollNo) {
		System.out.println("Student Name: " + name);
		System.out.println("Roll Number: " + rollNo);
	}

	void marksDetails(int maths, int science) {
		System.out.println("Maths Marks: " + maths);
		System.out.println("Science Marks: " + science);
	}

	void calculateTotal(int maths, int science) {
		int total = maths + science;
		System.out.println("Total Marks: " + total);
	}

	void calculatePercentage(int total, int subjects) {
		double percentage = (double) total / subjects;
		System.out.println("Percentage: " + percentage);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		School s = new School();

		System.out.print("Enter student name: ");
		String name = sc.nextLine();

		System.out.print("Enter roll number: ");
		int rollNo = sc.nextInt();

		System.out.print("Enter Maths marks: ");
		int maths = sc.nextInt();

		System.out.print("Enter Science marks: ");
		int science = sc.nextInt();

		int total = maths + science;

		System.out.println("\n--- Student Details ---");

		s.studentDetails(name, rollNo);
		s.marksDetails(maths, science);
		s.calculateTotal(maths, science);
		s.calculatePercentage(total, 2);

		sc.close();
	}
}