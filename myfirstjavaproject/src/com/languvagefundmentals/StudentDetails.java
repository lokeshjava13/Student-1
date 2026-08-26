package com.languvagefundmentals;

public class StudentDetails {
	
	String studentName;
	int age;
	int admissionYear;
	int rollNumber;
	long  mobileNumber;
	float attendencePercentage;
	int totalfees;
	char grade;
	String status;
	long stdid;
	int paidFees;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDetails s1 = new StudentDetails();
		
		 s1.studentName = "lokesh kuamr";
		s1.age = 22;
		s1.admissionYear = 2026;
		s1.rollNumber = 7367;
		s1.mobileNumber = 8328560329l;
		s1.attendencePercentage = 67;
		s1.totalfees = 30000;
		s1.grade =  'A';
		s1.status = "pass";
		s1.stdid = 532353524;
		s1.paidFees = 27000;
		
		System.out.println("studentName:" + s1.studentName);
		System.out.println("AGE:" + s1.age );
		System.out.println("admissionYear:" + s1.admissionYear);
		System.out.println("rollNumber:" + s1.rollNumber);
		System.out.println(" mobileNumber:" + s1. mobileNumber);
		System.out.println("attendencePercentage:" + s1.attendencePercentage);
		System.out.println(" totalfees:" + s1. totalfees);
		System.out.println("grade:" + s1.grade);
		System.out.println(" status:" + s1. status);
		System.out.println( "stdid:" + s1. stdid);
		System.out.println("paidFees:" + s1.paidFees);

	}

}
