package com.languvagefundmentalsmethods;

import java.util.Scanner;

public class LoanManageMent {
	
	static Scanner sc = new Scanner(System.in);
	
	String customerName;
	double loanAmount;
	float interestRate;
	int loanTenure;
	
    double calculateInterest(double loanamount,float interestRate) {
    	
    	System.out.println("Eneter loanAmount:");
    	loanAmount =sc.nextDouble();
    	sc.nextLine();
    	System.out.println("Enter interest Rate:");
    	interestRate = sc.nextFloat();
    	sc.nextLine();
    	
    	return (loanAmount * interestRate * loanTenure)/100;
    	
    	
    }
    
    double calculateAmount(double interest) {
    	
    	double totalAmount = interest+loanAmount;
    	return totalAmount;
    	
    }
    
    double calculateMonthlyEMI(double totalAmount,int loneTenure) {
    	
    	double monthlyEMI =totalAmount/loneTenure*12;
    	
    	return monthlyEMI;
    	
    	
    }
    
    void loanSummary(double interest,double totalAmount, double EMI) {
    	
    	System.out.println("=================================-----");
    	
    	System.out.println("------------LOAN SUMMARY-------------");
    	
    	System.out.println("Customer Name:"+customerName);
    	System.out.println("loan  Amount:"+loanAmount);
    	System.out.println("interest Rate:"+interestRate+ "%");
    	System.out.println("Loan TEnure"+loanTenure +"years");
    	
    	System.out.println("INTERST:"+interest);
    	
    	System.out.println("TOtal AMount:"+ totalAmount);
    	
    	System.out.println("MONTHLY EMI:"+ EMI);
    	
    	
    }
    
    

	public static void main(String[] args) {
		
		LoanManageMent l1 = new LoanManageMent();
		
		l1.loanAmount = 10000;
		
		l1.customerName="lokesh kumar";
		l1.interestRate= 12.5f;
		l1.loanTenure =6;
		l1.calculateAmount(0);
		l1.calculateInterest(0, 0);
		l1.calculateMonthlyEMI(0, 0);
		l1.loanSummary(0, 0, 0);
		l1.
		
		
		
		
		
		

	}

}
