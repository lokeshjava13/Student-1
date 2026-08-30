package com.languvagefundmentalsmethods;
import java.util.Scanner;

public class Calculator {
	static Scanner sc= new Scanner(System.in);

	
	   
	    int addition(int a, int b) {
	        System.out.print("Enter first number: ");
	        a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        b = sc.nextInt();

	        return a + b;
	    }

	    
	    int subtraction(int a, int b) {
	        System.out.print("Enter first number: ");
	        a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        b = sc.nextInt();

	        return a - b;
	    }

	    
	    long multiplication(long a, long b) {
	        System.out.print("Enter first number: ");
	        a = sc.nextLong();

	        System.out.print("Enter second number: ");
	        b = sc.nextLong();

	        return a * b;
	    }

	    
	    double division(double a, double b) {
	        System.out.print("Enter first number: ");
	        a = sc.nextDouble();

	        System.out.print("Enter second number: ");
	        b = sc.nextDouble();

	        return a / b;
	    }

	    
	    float average(float a, float b, float c) {
	        System.out.print("Enter first number: ");
	        a = sc.nextFloat();

	        System.out.print("Enter second number: ");
	        b = sc.nextFloat();

	        System.out.print("Enter third number: ");
	        c = sc.nextFloat();

	        return (a + b + c) / 3;
	    }

	    
	    char operator(char op) {
	        System.out.print("Enter operator (+,-,*,/): ");
	        op = sc.next().charAt(0);

	        return op;
	    }

	    
	    boolean isPositive(int number) {
	        System.out.print("Enter number: ");
	        number = sc.nextInt();

	        return number >= 0;
	    }

	    
	    String calculatorName(String name) {
	        System.out.print("Enter calculator name: ");
	        name = sc.next();

	        return name;
	    }

	    public static void main(String[] args) {

	        Calculator c = new Calculator();

	        int add = c.addition(0, 0);
	        System.out.println("Addition: " + add);

	        int sub = c.subtraction(0, 0);
	        System.out.println("Subtraction: " + sub);

	        long mul = c.multiplication(0, 0);
	        System.out.println("Multiplication: " + mul);

	        double div = c.division(0, 0);
	        System.out.println("Division: " + div);

	        float avg = c.average(0, 0, 0);
	        System.out.println("Average: " + avg);

	        char op = c.operator(' ');
	        System.out.println("Operator: " + op);

	        boolean positive = c.isPositive(0);
	        System.out.println("Positive: " + positive);

	        String name = c.calculatorName("");
	        System.out.println("Calculator Name: " + name);
	    }
	}