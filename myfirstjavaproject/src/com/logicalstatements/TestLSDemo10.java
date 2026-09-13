package com.logicalstatements;

import java.util.Scanner;



public class TestLSDemo10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn="";
		do {
			System.out.println("Enter signal R/Y/G");
			String s=sc.next();
			
			switch(s) {
			case "R" ->System.out.println("RED-> STOP THE VEHICLE");
			case "y"->System.out.println("YELLOW ->READY TO START");
			case "G"->System.out.println("GREEN -> GO");
			default->System.out.println("invalid signal");
			
			}
			System.out.println("CLICK CONTINUE Y/N");
			yn=sc.next();
		}
		while(yn.equalsIgnoreCase("y"));
		System.out.println("YOU ARE EXIST");

	}

}
