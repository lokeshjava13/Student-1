package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo13 {
	public static void main(String[] args) {
			 System.out.println("WELCOME TO LOKI CHICKEN CENTER");
			 Scanner sc = new Scanner(System.in);
			 String yn="";
			 double total=0;

			 System.out.println("AVAILABLE ITEMS TODAY");
			 System.out.println("1->CHICKEN SKINLESS 1KG");
			 System.out.println("2->CHICKEN WITH SKIN 1KG");
			 System.out.println("3->CHICKEN LOLLIPOP 1KG");
			 System.out.println("4->EGGS 1 TRAY (30 EGGS)");
			 System.out.println("5->MUTTON 1KG");
			 System.out.println("6->FISH 1KG");
			 System.out.println("7->PRAWNS 1KG");
			 System.out.println("8->CHICKEN BIRYANI FULL");

			 do {
			 System.out.println("Enter your selected item number:...");
			 int y=sc.nextInt();

			 switch(y) {
			 case 1:System.out.println("CHICKEN SKINLESS  :₹ 220");
			 total=total+220;
			 break;
			 case 2:System.out.println("CHICKEN WITH SKIN :₹ 180");
			 total=total+180;
			 break;
			 case 3:System.out.println("CHICKEN LOLLIPOP  :₹ 200");
			 total=total+200; 
			 break;
			 case 4:System.out.println("EGGS TRAY         :₹ 180");
			 total=total+180;
			 break;
			 case 5:System.out.println("MUTTON            :₹ 800");
			 total=total+800;
			 break;
			 case 6:System.out.println("FISH              :₹ 250");
			 total=total+250;
			 break;
			 case 7: System.out.println("PRAWNS           :₹ 400");
			 total=total+400;
			 break;
			 case 8:System.out.println("CHICKEN BIRYANIFULL:₹ 250");
			 total=total+250;
			 break;
			 default:System.out.println("NAA DAGGARA LEDHU BRO ");
			 break;
			 }
			 System.out.println("Add more items? y/n");
			 yn=sc.next();

			 }while(yn.equalsIgnoreCase("y"));
			 System.out.println("--------------------------------------");
			 System.out.println("TOTAL BILL:₹"+total+" /-");
			 System.out.println("Thanks Anna - Malla Raa");
			 sc.close();
		}
}

