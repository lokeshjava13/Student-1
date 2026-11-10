package com.oops;

//File: Main.java

//Parent Class
class Payment {
 String customerName;
 double amount;

 Payment(String customerName, double amount) {
     this.customerName = customerName;
     this.amount = amount;
 }

 void makePayment() {
     System.out.println("Payment of ₹" + amount + " made by " + customerName);
 }
}

//Child 1: UPI Payment
class UPIPayment extends Payment {
 String upiId;

 UPIPayment(String customerName, double amount, String upiId) {
     super(customerName, amount);
     this.upiId = upiId;
 }

 @Override
 void makePayment() {
     System.out.println("--- UPI Payment ---");
     System.out.println("Customer: " + customerName);
     // Condition: UPI ID must contain @
     if (upiId.contains("@") && upiId.length() > 3) {
         System.out.println("UPI ID " + upiId + " validated successfully.");
         System.out.println("Payment of ₹" + amount + " successful via UPI.");
     } else {
         System.out.println("Invalid UPI ID: " + upiId + ". Payment Failed!");
     }
     System.out.println("---------------------------");
 }
}

//Child 2: Card Payment
class CardPayment extends Payment {
 String cardNumber;
 String cvv;

 CardPayment(String customerName, double amount, String cardNumber, String cvv) {
     super(customerName, amount);
     this.cardNumber = cardNumber;
     this.cvv = cvv;
 }

 @Override
 void makePayment() {
     System.out.println("--- Card Payment ---");
     System.out.println("Customer: " + customerName);
     // Condition: Card number 16 digits, CVV 3 digits
     if (cardNumber.length() == 16 && cvv.length() == 3) {
         System.out.println("Card Number and CVV validated successfully.");
         System.out.println("Payment of ₹" + amount + " successful via Card.");
     } else {
         System.out.println("Invalid Card Number or CVV. Payment Failed!");
         System.out.println("Card must be 16 digits, CVV must be 3 digits.");
     }
     System.out.println("---------------------------");
 }
}

//Child 3: Cash Payment
class CashPayment extends Payment {
 double cashGiven;

 CashPayment(String customerName, double amount, double cashGiven) {
     super(customerName, amount);
     this.cashGiven = cashGiven;
 }

 @Override
 void makePayment() {
     System.out.println("--- Cash Payment ---");
     System.out.println("Customer: " + customerName);
     System.out.println("Bill Amount: ₹" + amount);
     System.out.println("Cash Given: ₹" + cashGiven);
     // Condition: Check if cash is sufficient
     if (cashGiven >= amount) {
         double balance = cashGiven - amount;
         System.out.println("Payment successful via Cash.");
         System.out.println("Remaining Balance to return: ₹" + balance);
     } else {
         double needed = amount - cashGiven;
         System.out.println("Insufficient Cash! Payment Failed!");
         System.out.println("Still need ₹" + needed + " more.");
     }
     System.out.println("---------------------------");
 }
}

//Main Class
  class PaymentDemo {
 public static void main(String[] args) {
     UPIPayment upi = new UPIPayment("Rahul", 500, "rahul@okhdfc");
     CardPayment card = new CardPayment("Priya", 1200, "1234567812345678", "123");
     CashPayment cash = new CashPayment("Amit", 800, 1000);

     // Demonstrating Method Overriding - same method name, different behavior
     upi.makePayment();
     card.makePayment();
     cash.makePayment();

     // Extra test - Failed cases
     System.out.println("\n--- Testing Failed Cases ---");
     UPIPayment upiFail = new UPIPayment("Sneha", 300, "sneha123");
     upiFail.makePayment();

     CardPayment cardFail = new CardPayment("Vikram", 2000, "1234", "12");
     cardFail.makePayment();

     CashPayment cashFail = new CashPayment("Ravi", 900, 500);
     cashFail.makePayment();
 }
}