package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo14 {

	
	
	 public static void main(String[] args) {
	  System.out.println("PUNJULU CARE - MONTHLY COST");
	  Scanner sc=new Scanner(System.in);
	  String yn=""; 
	  double total=0;
	  System.out.println("1->PUNJULU SPECIAL FEED   1KG 80/-");
	  System.out.println("2->EGG PROTEIN           1 Tray 180/-");
	  System.out.println("3->KATHI / KADIYAM      - 150/-");
	  System.out.println("4->VITAMIN & DEWORMING   - 200/-");
	  System.out.println("5->SMALL CAGE           - 1500/-");
	  System.out.println("6->TRAINING STICK       - 300/-");
	  
	  do{
	   System.out.println("Enter Item No: "); 
	   int item=sc.nextInt();
	   System.out.println("Qty: ");
	   int q=sc.nextInt();
	   switch(item){
	    case 1 -> {System.out.println("Feed Cost = "+(80*q)); 
	    total+=80*q;}
	    case 2 -> {System.out.println("Egg Cost = "+(180*q)); 
	    total+=180*q;}
	    case 3 -> {System.out.println("Kathi Cost = "+(150*q));
	    total+=150*q;}
	    case 4 -> {System.out.println("Medicine = "+(200*q)); 
	    total+=200*q;}
	    case 5 -> {System.out.println("Cage     = "  +(1500*q));
	    total+=1500*q;}  
	    case 6 -> {System.out.println("Stick     = " +(300*q)); 
	    total+=300*q;}  
	    default -> System.out.println("Item Ledu");
	   }
	   System.out.println("Total Care Cost: "+total);
	   System.out.println("Add More? y/n"); yn=sc.next();
	  }while(yn.equalsIgnoreCase("y"));
	  System.out.println("TOTAL MONTHLY COST: "+total+" /-");
	  sc.close();
	 }
	}