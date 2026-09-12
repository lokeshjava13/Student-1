package com.languvagefundmentalsConstuctors;

import java.util.Scanner;
public class Bank {
	

		String accNo;
		String customerName;
		double balance=0.0;

		{
			System.out.println("--------------------Bank Details --------------------");
		}
		double deposit(double depo) {
			balance = balance + depo;
//			checkBalance();     
			return balance;
		}
		double Withdraw(double withdraw) {
			balance = balance - withdraw;
//			checkBalance();
			return balance;
		}
		Bank(){
			
		}
		Bank(Bank a,Bank b,double amount){
			a.Withdraw(amount);
			b.deposit(amount);
			System.out.println("Transfer Successful");
		}
		void checkBalance() {
			System.out.println("Customer Account Number : "+accNo);
			System.out.println("Customer Account Name : "+customerName);
			System.out.println("This is the Current balance in You Account : "+balance);
			System.out.println("-----------------------------------------");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);	
			Bank chandu = new Bank();
			System.out.println("Enter Customer Id : ");
			chandu.accNo=sc.next();
			System.out.println("Enter Customer Name : ");
			chandu.customerName = sc.next();
			System.out.println("Enter Amount to Deposit : ");
			chandu.deposit(sc.nextDouble());
			chandu.checkBalance();
			System.out.println("Enter Amount to Withdraw : ");
			chandu.Withdraw(sc.nextDouble());
			chandu.checkBalance();
			
			
//			Scanner sc = new Scanner(System.in);	
			Bank deepak = new Bank();
			System.out.println("Enter Customer Id : ");
			deepak.accNo=sc.next();
			System.out.println("Enter Customer Name : ");
			deepak.customerName = sc.next();
			System.out.println("Enter Amount to Deposit : ");
			deepak.deposit(sc.nextDouble());
			deepak.checkBalance();
			System.out.println("Enter Amount to Withdraw : ");
			deepak.Withdraw(sc.nextDouble());
			deepak.checkBalance();
			
			double tf = sc.nextDouble();
			System.out.println("Enter Transfer Amount : ");
			Bank transfer = new Bank(chandu,deepak,tf);
			System.out.println("After Transfer Chandu's Balance : " );
			chandu.checkBalance();
			System.out.println("After Transfer Deepak's Balance : ");
			deepak.checkBalance();
			
		}

	}
