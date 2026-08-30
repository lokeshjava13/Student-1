package com.languvagefundmentalsmethods;
import java.util.Scanner;

public class ProductDetails {

	

	    static Scanner sc = new Scanner(System.in);

	   
	    double productTotal(double price, int quantity) {
	        System.out.print("Enter product price: ");
	        price = sc.nextDouble();

	        System.out.print("Enter quantity: ");
	        quantity = sc.nextInt();

	        return price * quantity;
	    }

	    
	    float discountAmount(float price, float discount) {
	        System.out.print("Enter price: ");
	        price = sc.nextFloat();

	        System.out.print("Enter discount percentage: ");
	        discount = sc.nextFloat();

	        return price * discount / 100;
	    }

	    
	    double finalPrice(double price, double discount) {
	        System.out.print("Enter product price: ");
	        price = sc.nextDouble();

	        System.out.print("Enter discount amount: ");
	        discount = sc.nextDouble();

	        return price - discount;
	    }

	    
	    int totalQuantity(int q1, int q2) {
	        System.out.print("Enter quantity 1: ");
	        q1 = sc.nextInt();

	        System.out.print("Enter quantity 2: ");
	        q2 = sc.nextInt();

	        return q1 + q2;
	    }

	    
	    String productName(String name) {
	        System.out.print("Enter product name: ");
	        name = sc.next();

	        return name;
	    }

	   
	    long productCode(long code) {
	        System.out.print("Enter product code: ");
	        code = sc.nextLong();

	        return code;
	    }

	    
	    char productCategory(char category) {
	        System.out.print("Enter category E/F/C: ");
	        category = sc.next().charAt(0);

	        return category;
	    }

	    
	    boolean availableStock(int stock) {
	        System.out.print("Enter available stock: ");
	        stock = sc.nextInt();

	        return stock > 0;
	    }

	    public static void main(String[] args) {

	        ProductDetails p = new ProductDetails();

	        double total = p.productTotal(0, 0);
	        System.out.println("Product Total: " + total);

	        float discount = p.discountAmount(0, 0);
	        System.out.println("Discount Amount: " + discount);

	        double finalAmount = p.finalPrice(0, 0);
	        System.out.println("Final Price: " + finalAmount);

	        int quantity = p.totalQuantity(0, 0);
	        System.out.println("Total Quantity: " + quantity);

	        String name = p.productName("");
	        System.out.println("Product Name: " + name);

	        long code = p.productCode(0);
	        System.out.println("Product Code: " + code);

	        char category = p.productCategory(' ');
	        System.out.println("Product Category: " + category);

	        boolean stock = p.availableStock(0);
	        System.out.println("Available Stock: " + stock);
	    }
	}