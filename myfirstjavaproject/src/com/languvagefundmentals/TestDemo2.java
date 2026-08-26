package com.languvagefundmentals;

public class TestDemo2 {
	Integer stid;
	
	String stname;
	Character gender;
	String branchname;
	String collgename;
	
	   void display() {
		   System.out.println("stid: "+stid);  
		   System.out.println("Student Name : "+stname);  
		   System.out.println("gender: "+gender);  
		   System.out.println("branchname : "+branchname);  
		   System.out.println("collgename: "+collgename);  

	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo2 t1 = new TestDemo2();
		
		t1.stid = 121;
		
		t1.stname = "lokesh";
		t1.gender = 'm';
		t1.branchname = "mgcs";
		t1.collgename = "DNR";
		t1.display();
		
       TestDemo2 t2 = new TestDemo2();
		
		t2.stid = 122;
		
		t2.stname = "RAKESH";
		t2.gender = 'm';
		t2.branchname = "mpcs";
		t2.collgename = "aditya";
		t2.display();
	}

}
