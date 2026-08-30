package com.languvagefundmentalsmethods;

import java.util.Scanner;

public class Bank {

	double balance = 50000;

	void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to bank");

		showBalance(balance);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter deposite amount: ");
		double amount = sc.nextDouble();
		depositAmount(amount);
		
		System.out.println("enter withdra amount: ");
		double amount1 = sc.nextDouble();
		withDraw(amount1);
		

	}

	void showBalance(double balance) {
		System.out.println("currrent balance is:" + balance);

	}

	void depositAmount(double amount) {
		balance = balance + amount;
		showBalance(balance);

	}

	void withDraw(double withdraw) {
		balance = balance - withdraw;
		
		showBalance(balance);

	}

}
