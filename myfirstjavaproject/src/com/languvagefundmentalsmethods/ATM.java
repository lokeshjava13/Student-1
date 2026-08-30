package com.languvagefundmentalsmethods;

import java.util.Scanner;

public class ATM {

	static double balance = 100000;
	static int pin = 1213;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("welcome to ATM");

		System.out.println("Enterd  PIN:");
		int enterpin = sc.nextInt();
		checkPin(enterpin);
		showBalance();

		System.out.println(" enetr deposit amount:");
		double amount = sc.nextDouble();

		deposit(amount);

		System.out.println("enter withdraw amount");
		double amount1 = sc.nextDouble();
		withDraw(amount1);

		System.out.println("transfer amount:");
		double transfer = sc.nextDouble();
		transferMoney(transfer);

		displayAccount("lokesh", 9427569947265l);

	}

	static void showBalance() {
		System.out.println("current balance is:" + balance);
	}

	 static void deposit(double amount) {
		balance = balance + amount;
		System.out.println("amount deposited succesfullly");

	}

	static void withDraw(double amount) {
		balance = balance - amount;
		System.out.println("amount debited");

	}

	static void checkPin(int enterPin) {

		if (enterPin == pin) {
			System.out.println("pin is correct");

		} else {
			System.out.println("incorrect pin");
		}
	}

	static void changePin(int oldPin, int newPin) {

	}

	static void transferMoney(double amount) {

		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("transfer amount:" + amount);
		} else {
			showBalance();
			System.out.println("insufficient balance");
		}

	}

	static void displayAccount(String Name, long accountNumber) {
		System.out.println("Account Holder:" + Name);
		System.out.println("AACOUNT NUMBER:" + accountNumber);

	}

	void dispalyMessege(String messege) {

	}

}
