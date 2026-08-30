package com.languvagefundmentalsmethods;

import java.util.Scanner;

public class Student1 {
	
	 static Scanner sc = new Scanner(System.in);
	 
	 int getMarks() {
		 System.out.println("Enter Marks");
		 int marks = sc.nextInt();
		 return marks;
	 }
	 String getStudentName() {
		 System.out.println("Enter Student name:");
		 String name = sc.next();
		 return name;
	 }
	 int getAge() {
		 System.out.println("Enter Age");
		 int age = sc.nextInt()	;
		 return age;
	 }

	public static void main(String[] args) {
		
		Student1  s1 = new Student1();
		
		
		int marks =s1.getMarks();
		String name = s1.getStudentName();
		int age = s1.getAge();
		
		System.out.println("--------Student details-------");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("MArks:"+marks);
		
		

	}

}
