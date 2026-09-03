package com.languvagefundmentalsConstuctors;

public class Employee {
	static int id;
	static String name;
	static double salary;
    
	
	Employee(){
		this(id,name,salary);
	}
    Employee(int id,String name,double salary){
    	System.out.println("3 Arg Constructor Called");
    	this.id=id;
    	this.name=name;
    	this.salary=salary;
    }
	
	void displayDetails() {
		System.out.println("Employee ID:"+id);
		System.out.println("Employee name:"+name);

		System.out.println("Employee salary:"+salary);

	}
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"loki",45000);
		Employee e2 = new Employee(102,"janu",45000);
		e1.displayDetails();
		e2.displayDetails();

		
	

	}

}
