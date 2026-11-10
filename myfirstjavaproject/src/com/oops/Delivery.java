package com.oops;

class Delivery {
	int deliveryId;
	String partnerName;
	double distance;

	// Constructor
	Delivery(int deliveryId, String partnerName, double distance) {
		this.deliveryId = deliveryId;
		this.partnerName = partnerName;
		this.distance = distance;
	}

		double calculateDeliveryCharge() {
		return 0;
	}

	void displayDetails() {
		System.out.println("Delivery ID: " + deliveryId);
		System.out.println("Partner Name: " + partnerName);
		System.out.println("Distance: " + distance + " km");
	}
}

class BikeDelivery extends Delivery {
	BikeDelivery(int deliveryId, String partnerName, double distance) {
		super(deliveryId, partnerName, distance);
	}

	@Override
	double calculateDeliveryCharge() {
		return distance * 10;
	}

	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Vehicle: Bike Delivery");
		System.out.println("Total Charge: ₹" + calculateDeliveryCharge());
		System.out.println("---------------------------");
	}
}

class CycleDelivery extends Delivery {
	CycleDelivery(int deliveryId, String partnerName, double distance) {
		super(deliveryId, partnerName, distance);
	}

	@Override
	double calculateDeliveryCharge() {
		return distance * 5;
	}

	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Vehicle: Cycle Delivery");
		System.out.println("Total Charge: ₹" + calculateDeliveryCharge());
		System.out.println("---------------------------");
	}
}

class ExpressDelivery extends Delivery {
	ExpressDelivery(int deliveryId, String partnerName, double distance) {
		super(deliveryId, partnerName, distance);
	}

	@Override
	double calculateDeliveryCharge() {
		return distance * 20;
	}

	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Vehicle: Express Delivery");
		System.out.println("Total Charge: ₹" + calculateDeliveryCharge());
		System.out.println("---------------------------");
	}
}

class Main {
	public static void main(String[] args) {
		BikeDelivery bike = new BikeDelivery(101, "Rahul", 5.5);
		CycleDelivery cycle = new CycleDelivery(102, "Amit", 3.0);
		ExpressDelivery express = new ExpressDelivery(103, "Priya", 8.0);

		bike.displayDetails();
		cycle.displayDetails();
		express.displayDetails();
	}
}