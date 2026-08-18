package com.languvagefundmentals;

public class Account {
	
	 String name;
	 long accno;
	 long bal;
	 boolean status;
	 void displayaccount(){
		 System.out.println("NAME:"+ name);
		 System.out.println("ACCNO:" + accno); 
		 System.out.println("BAL:" + bal); 
		 System.out.println("STATUS:"+ status);
		 
	
		 
	 }
	 

	public static void main(String[] args) {
		Account a1 = new Account();
		
		a1.name= "lokesh kuamr";
		a1.accno = 892486235428l;
		a1.bal = 743984;
		a1.status= true;
		
		a1.displayaccount();
		
			Account a2 = new Account();
			
			a2.name= "kondayya";
			a2.accno = 89958349394428l;
			a2.bal = 4793535l;
			a2.status= true;
			
			a2.displayaccount();
		
				Account a3= new Account();
				
				a3.name= "bhargav kuamr";
				a3.accno = 89248756348l;
				a3.bal = 73463;
				a3.status= true;
				
				a3.displayaccount();
				
				
					Account a4= new Account();
				
					a4.name= "aruna kumari";
					a4.accno = 892486235428l;
					a4.bal = 743984;
					a4.status= true;
				
					a4.displayaccount();
						
				
		

   }
	
 }
