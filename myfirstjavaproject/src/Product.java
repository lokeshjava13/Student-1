
public class Product {

	
	    // fields
	    int productId;
	    String productName;
	    double price;

	    // 1. Three-argument constructor
	    Product(int productId, String productName, double price) {
	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	    }

	    // 2. Default constructor with this() chaining - MUST be first line
	    Product() {
	        this(101, "Laptop", 55000.50); // calling 3-arg constructor
	        System.out.println("Default constructor called");
	    }

	    // 3. printDetails() method
	    void printDetails() {
	        System.out.println("Product ID: " + productId);
	        System.out.println("Product Name: " + productName);
	        System.out.println("Price: " + price);
	    }

	    // 4. Create object by passing details
	    public static void main(String[] args) {
	        Product p1 = new Product(102, "Mobile", 25000);
	        p1.printDetails();

	        System.out.println("-----------");

	        Product p2 = new Product(); // will call default -> 3-arg
	        p2.printDetails();
	    }
	}