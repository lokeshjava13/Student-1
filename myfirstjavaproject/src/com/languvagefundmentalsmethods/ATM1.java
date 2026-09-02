//package com.languvagefundmentalsmethods;

//
//public class ATM1 {
//	
//	static String bankName = "State Bank Of India";
//	
//	long accountNumber;
//	double balance;
//	
//	void deposit(double depositAmount) {
//		
//		balance = balance + depositAmount;
//		System.out.println("Deposited: "+depositAmount);
//	}
//	
//	void withdraw(double withdrawAmount) {
//		if (balance>withdrawAmount) {
//			balance = balance - withdrawAmount;
//			System.out.println("Withdraw:"+withdrawAmount);
//		}
//		
//		else {
//			System.out.println("insufficient Balnce");
//		}
//		
//	}
//	
//	void checkBalance() {
//		System.out.println("Accountumber:"+accountNumber);
//		
//		System.out.println("currentblanace:"+balance);
//	}
//	
//
//	public static void main(String[] args) {
//		
//		ATM1 account1 = new ATM1();
//		ATM1 account2 = new ATM1();
//		
//		account1.accountNumber=1000102;
//		account1.balance=50000;
//		
//		
//		account2.accountNumber=12233446;
//		account2.balance=30000;
//		
//		System.out.println("Bank name:"+bankName);
//		
//		account1.deposit(10000);
//		account1.withdraw(1200);
//		account1.checkBalance();
//		
//		account2.deposit(1000);
//		account2.withdraw(1500);
//		account2.checkBalance();
//		
//		
//		
//		
//
//	}
//
//}
