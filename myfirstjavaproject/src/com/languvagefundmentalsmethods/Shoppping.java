package com.languvagefundmentalsmethods;
import java.util.Scanner;

public class Shoppping {

	


	    void productDetails(String productName, double price) {
	        System.out.println("Product Name: " + productName);
	        System.out.println("Price: ₹" + price);
	    }

	    void calculateTotal(double price, int quantity) {
	        double total = price * quantity;
	        System.out.println("Total Amount: ₹" + total);
	    }

	    void discount(double total, double discountPercentage) {
	        double discount = total * discountPercentage / 100;
	        double finalAmount = total - discount;

	        System.out.println("Discount: ₹" + discount);
	        System.out.println("Final Amount: ₹" + finalAmount);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        Shoppping s1 = new Shoppping();

	        System.out.print("Enter product name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter price: ");
	        double price = sc.nextDouble();

	        System.out.print("Enter quantity: ");
	        int quantity = sc.nextInt();

	        System.out.print("Enter discount percentage: ");
	        double discount = sc.nextDouble();

	        double total = price * quantity;

	        System.out.println("\n--- Shopping Details ---");

	        s1.productDetails(name, price);
	        s1.calculateTotal(price, quantity);
	        s1.discount(total, discount);

	        sc.close();
	    }
	}
