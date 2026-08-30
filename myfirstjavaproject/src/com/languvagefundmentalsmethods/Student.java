package com.languvagefundmentalsmethods;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Student s1 = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("===student Details");
		
		System.out.println("Enter student id:");
		int id = sc.nextInt();
		System.out.println(" Enter student name");
		String name =sc.next();
		System.out.println("enter marks");
		double marks = sc.nextDouble();
		
		System.out.println("Enter Attendence:");
		double attendence = sc.nextDouble();	
		
		s1.studentDetails(id, name);
		s1.displayMarks(marks);
		s1.checkgrade(marks);
		s1.pass(marks);
		s1.checkgrade(marks);
		s1.attendence(attendence);
		s1.result(name, id, attendence);
		
		sc.close();
		
		
		 
		
		
		
		
				
	

	}
	
	void studentDetails(int id, String name) {
		System.out.println("student ID:"+id);
		System.out.println("Student name:"+name);
		
	}
	
	void displayMarks(double marks){
		System.out.println("Student marks:"+marks);
		
			
	}
	
	 void pass(double marks) {
		if(marks>40) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
	}
	
	
	
	
	
	
     void checkgrade(double marks) {
    	 
    	 if(marks>=90) {
    		 System.out.println("grade A");
    		 
    	 }else if(marks>=75) {
    		 System.out.println("grade B");
    	 }
    	 else if(marks>=60) {
    		 System.out.println("grade C");
    		 
    	 }else if(marks>=40) {
    		 System.out.println("Grade D");
    	 }else {
    		 System.out.println("FAIL");
    	 }
    	 
     }
     void attendence(double attendence) {
    	 if (attendence >=75) {
    		 System.out.println("you are eligible exams");
    	 }
    	 else {
    		 System.out.println("you are not eligible for exams");
    	 }
    	 
     }
     void result (String name,int marks,double attendence) {
    	 System.out.println("Name:"+name);
    	 System.out.println("grade:"+ marks);
         System.out.println("Attendence"+ attendence);  
     }
}
