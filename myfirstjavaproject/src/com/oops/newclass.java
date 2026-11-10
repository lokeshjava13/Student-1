
package com.oops;

public class newclass {

    public static void main(String[] args) {

        // Laptop object
        Laptop lap = new Laptop();

        lap.brand = "HP";
        lap.price = 65000;
        lap.ram = "16GB";
        lap.processor = "Intel i5";

        // Mobile object
        Mobile mob = new Mobile();

        mob.brand = "Samsung";
        mob.price = 25000;
        mob.camera = "50MP";
        mob.battery = "5000mAh";

        // Runtime Polymorphism
        DevicePoly1 d1 = lap;
        DevicePoly1 d2 = mob;

        System.out.println("=== Runtime Polymorphism Demo ===");

        d1.displayDetails();

        System.out.println();

        d2.displayDetails();

        System.out.println("\n=== Child Specific Methods ===");

        lap.runIDE();
        lap.compileCode();

        mob.makeCall();
        mob.takePhoto();
    }
}

// Parent class
class DevicePoly1 {

    protected String brand;
    protected double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

// Child class 1
class Laptop extends DevicePoly1 {

    String ram;
    String processor;

    void runIDE() {
        System.out.println("Running IDE on " + brand);
    }

    void compileCode() {
        System.out.println("Running on processor: " + processor);
    }

    @Override
    void displayDetails() {

        System.out.println("----- Laptop Details -----");

        super.displayDetails();

        System.out.println("RAM: " + ram);
        System.out.println("Processor: " + processor);
    }
}

// Child class 2
class Mobile extends DevicePoly1 {

    String camera;
    String battery;

    void makeCall() {
        System.out.println("Making call from " + brand + " Mobile");
    }

    void takePhoto() {
        System.out.println("Taking photo with " + camera + " camera");
    }

    @Override
    void displayDetails() {

        System.out.println("----- Mobile Details -----");

        super.displayDetails();

        System.out.println("Camera: " + camera);
        System.out.println("Battery: " + battery);
    }
}
