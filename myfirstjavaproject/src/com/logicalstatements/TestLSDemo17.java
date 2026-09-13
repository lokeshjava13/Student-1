package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo17 {
	
	 public static void main(String[] args) {
	  System.out.println("WELCOME TO D-MART PATHA GANDI GUDEM");
	  Scanner sc=new Scanner(System.in);
	  String yn="";
	  double total=0;
	  
	  System.out.println("DMart Products List:");
	  System.out.println("1->Rice 1KG - 60/-");
	  System.out.println("2->Oil 1L - 130/-");
	  System.out.println("3->Sugar 1KG - 45/-");
	  System.out.println("4->Natukodi Eggs Tray - 180/-");
	  System.out.println("5->Chicken 1KG - 250/-");
	  System.out.println("6->Surf Excel 1KG - 210/-");
	  System.out.println("7->Parle-G Biscuit - 30/-");
	  System.out.println("8->Coca-Cola 2L - 90/-");
	  
	  do{
	   System.out.println("Enter Product No: ");
	   int p=sc.nextInt();
	   System.out.println("Enter Qty: ");
	   int qty=sc.nextInt();
	   double price=0;
	   
	   switch(p){
	     case 1: price=60*qty; 
	     break;
	     case 2: price=130*qty; 
	     break;
	     case 3: price=45*qty; 
	     break;
	     case 4: price=180*qty; 
	     break;
	     case 5: price=250*qty; 
	     break;
	     case 6: price=210*qty; 
	     break;
	     case 7: price=30*qty; 
	     break;
	     case 8: price=90*qty;
	     break;
	     default: System.out.println("Product Ledu Anna"); 
	     price=0; 
	     break;
	   }
	   
	   // CONDITIONAL - Small qty check
	   if(qty <=0){
	     System.out.println("Wrong Qty - Add Correct");
	     price=0;
	   } else {
	     System.out.println("Item Cost = "+price);
	     total = total + price;
	   }
	   
	   System.out.println("Current Cart Total: "+total);
	   System.out.println("Add More Items? y/n");
	   yn=sc.next();
	  }while(yn.equalsIgnoreCase("y"));
	  
	  System.out.println("----------------------------------");
	  System.out.println("Your Total Bill = "+total);
	  
	
	  System.out.println("Do you have DMart Membership Card? y/n");
	  String card=sc.next();
	  
	  if(card.equalsIgnoreCase("y")){
	    if(total >= 5000){
	      System.out.println("Gold Member - 15% Discount!");
	      total = total - (total*0.15);
	    } else if(total >= 2000){
	      System.out.println("Member - 10% Discount");
	      total = total - (total*0.10);
	    } else {
	      System.out.println("Member - 5% Discount");
	      total = total - (total*0.05);
	    }
	  } else {
	
	    if(total >= 5000){
	      System.out.println("Big Bill - 5% Discount for All");
	      total = total - (total*0.05);
	    } else {
	      System.out.println("No Discount - Take Membership Next Time");
	    }
	  }
	  
	 
	  if(total > 0){
	    double gst = total * 0.05;
	    System.out.println("GST 5% = "+gst);
	    total = total + gst;
	  }
	  
	  System.out.println("FINAL PAYABLE AMOUNT: "+total+" /-");
	  System.out.println("Thank You Visit Again - D-MART");
	  sc.close();
	 }
	}