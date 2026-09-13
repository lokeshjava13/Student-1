package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo15 {

	
	 public static void main(String[] args) {
	  System.out.println("WELCOME TO BHARGAV PANDEM PUNJULU FARM");
	  Scanner sc = new Scanner(System.in);
	  String yn="";
	  double total=0;
	  
	  System.out.println("AVAILABLE PUNJULU BREEDS");
	  System.out.println("1->PARROT BEAK LONG TAIL   - 5000/-");
	  System.out.println("2->KAKI NEMALI             - 7000/-");
	  System.out.println("3->SEETHU KODI PUNJU       - 6000/-");
	  System.out.println("4->DEGHA / NALLA PUNJU     - 8000/-");
	  System.out.println("5->WHITE JATHI PUNJU      - 10000/-");
	  System.out.println("6->PACHABOTTU PUNJU      - 6500/-");
	  System.out.println("7->CHITTA KODI PUNJU     - 7500/-");
	  System.out.println("8->PANDI PUNJU           - 4000/-");
	  
	  do {
	   System.out.println("Enter Punju Breed Number: ");
	   int p = sc.nextInt();
	   System.out.println("Enter Age in Months: ");
	   int age = sc.nextInt();
	   
	   switch(p) {
	    case 1 : 
	      System.out.println("PARROT BEAK PUNJU - Age "+age+" Months");
	      if(age>12) {System.out.println("Price 5000/-");
	      total+=5000;}
	      else {System.out.println("Pilla Price 3000/-");
	      total+=3000;}
	    break;
	    case 2 : System.out.println("KAKI NEMALI - 7000/-");
	    total+=7000; break;
	    case 3 : System.out.println("SEETHU PUNJU - 6000/-"); 
	    total+=6000; break;
	    case 4 : System.out.println("DEGHA NALLA PUNJU - 8000/- - Top Fighter");
	    total+=8000; break;
	    case 5 : System.out.println("WHITE JATHI - 10000/- - Premium"); 
	    total+=10000; break;
	    case 6 : System.out.println("PACHABOTTU - 6500/-");
	    total+=6500; break;
	    case 7 : System.out.println("CHITTA KODI - 7500/-"); 
	    total+=7500; break;
	    case 8 : System.out.println("PANDI PUNJU - 4000/-"); 
	    total+=4000; break;
	    default : System.out.println("BREED LEDU ANNA"); break;
	   }
	   System.out.println("Current Total: "+total);
	   System.out.println("Add Another Punju? y/n");
	   yn=sc.next();
	  }while(yn.equalsIgnoreCase("y"));
	  
	  System.out.println("--------------------------------");
	  System.out.println("FINAL PUNJULU BILL: "+total+" /-");
	  System.out.println("VACHINANDHUKU DHANYAVADH");
	  sc.close();
	 }
	}