package com.languvagefundmentals;

public class Employee {
	
	int empid;
	String empname;
	long salary;
	double experience;
	char grade;
	boolean perminentstatus;
	
	void displayempdetails() {
		System.out.println("empid:"+ empid);
		System.out.println("empname:"+ empname);
		System.out.println("salary:"+ salary);
		System.out.println("experience:"+ experience);
		System.out.println("perminentstatus:"+ perminentstatus);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee m1 = new Employee();
		
		m1. empid = 101;
		m1. empname = "mohmad";
     	m1.salary = 50000;
		m1. experience = 10.5;
		m1.grade ='A';
		m1. perminentstatus = false;
		
		m1.displayempdetails();
		
       Employee m2 = new Employee();
		
		m2. empid = 103;
		m2. empname = "pranneth";
     	m2.salary = 60000;
		m2. experience = 5;
		m2.grade =68;
		m2. perminentstatus = true;
		
		m2.displayempdetails();
		
		 Employee m3 = new Employee();
			
			m3. empid = 103;
			m3. empname = "pranneth";
	     	m3.salary = 60000;
			m3. experience = 5;
			m3.grade =68;
			m3. perminentstatus = true;
			
			m3.displayempdetails();
			
		
		
		

	}

}
