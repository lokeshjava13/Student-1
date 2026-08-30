package com.languvagefundmentalsmethods;

import java.util.Scanner;

public class BankDetails {
	
	static Scanner sc = new Scanner(System.in);

	
	double getBalance() {
		System.out.println("Enter Balance:");
		return sc.nextDouble();
	}
	
	String getAccountName() {
		System.out.println("Enter Account Name:");
		return sc.next();
		
	}
	
	long getAccountNumber() {
		System.out.println("Enter Account Number:");
		return sc.nextInt();
	}
	
	double getDeposit() {
		System.out.println("Enter deposit number");
		return sc.nextDouble();
	}
	double getWithdraw() {
		System.out.println("Enter withdrawl Amount:");
	    return sc.nextDouble();
	}
	public static void main(String[] args) {
		BankDetails b1 = new BankDetails();
		double balance = b1.getBalance();
		long accountNumber = b1.getAccountNumber();
		String accountName = b1.getAccountName();
		double deposit = b1.getDeposit();
		double withdraw = b1.getWithdraw();
		
	    System.out.println("------Bank Details------");
	    System.out.println("Balance:"+ balance);
        System.out.println("Account Number"+accountNumber);
        System.out.println("AccountName:"+accountName);
        System.out.println("Deposit"+deposit);
        System.out.println("Withdraw amount:"+withdraw);
	}

}
