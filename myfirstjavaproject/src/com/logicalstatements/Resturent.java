package com.logicalstatements;

import java.util.Scanner;

public class Resturent {

	public static void main(String[] args) {
		System.out.println("WELCOME TO APPALARAJU HOTEL");
		Scanner sc = new Scanner(System.in);
		double totalBill = 0;

		double vegItemBill = 0;
		double nvBill = 0;
		double destBill = 0;
		double drinksBill = 0;

		System.out.println("Enter your menu :" + "(veg / nonveg / dest / drinks)");
		String menu = sc.next().toLowerCase();
		String m = "";

		do {
			switch (menu) {
			case "veg" -> {
				System.out.println("available veg items:" + " mushroom_full, mushroom_half, sweetcorn, panasa, panner");
				System.out.println("Enter your item");
				String vitem = sc.next().toLowerCase();
				String vyn = "";

				do {
					switch (vitem) {
					case "mushroom_full", "ms_full", "ms full" -> {
						System.out.println("Mushroom Bhiryani full --₹250/-");
						vegItemBill += 250;
					}
					case "mushroom_half", "ms_half" -> {
						System.out.println("Mushroom Bhiryani Half --₹150/-");
						vegItemBill += 150;
					}
					case "sweetcorn", "sc" -> {
						System.out.println("Sweet corn Bhiryani --₹200/-");
						vegItemBill += 200;
					}
					case "panasa" -> {
						System.out.println("panasa bhiryani--₹250/-");
						vegItemBill += 250;
					}
					case "panner" -> {
						System.out.println("panner bhiryani--₹240/-");
						vegItemBill += 240;
					}
					default -> System.out.println("not available for this item check your menu");
					}
					System.out.println("you want continue with veg Item y/n");
					vyn = sc.next();
					if (vyn.equalsIgnoreCase("y")) {
						System.out.println("Enter your veg item again");
						vitem = sc.next().toLowerCase();
					}
				} while (vyn.equalsIgnoreCase("y"));
			}

			case "nonveg" -> {
				System.out.println("Available non-veg:"
						+ " chickfry, chickdum, chickrost, mogal, muttonfry, muttondum, fish, prawns");
				System.out.println("Enter item");
				String item = sc.next().toLowerCase();
				String nyn = "";
				do {
					switch (item) {
					case "chickfry", "chick_fry" -> {
						System.out.println("Chicken fry bhiryani is ₹250/-");
						nvBill += 250;
					}
					case "chickdum", "chick_dum" -> {
						System.out.println("chicken dum Bhiryani is ₹250/-");
						nvBill += 250;
					}
					case "chickrost" -> {
						System.out.println("chicken roast bhiryani is ₹220/-");
						nvBill += 220;
					}
					case "mogal", "mogalie" -> {
						System.out.println("mogalie bhiryani is ₹300/-");
						nvBill += 300;
					}
					case "muttonfry", "mutton_fry" -> {
						System.out.println("mutton fry bhiryani is ₹450/-");
						nvBill += 450;
					}
					case "muttondum", "mutton_dum" -> {
						System.out.println("mutton dum bhiryani is ₹500/-");
						nvBill += 500;
					}
					case "fish" -> {
						System.out.println("fish bhiryani is ₹350/-");
						nvBill += 350;
					}
					case "prawns" -> {
						System.out.println("prawns bhiryani is ₹300/-");
						nvBill += 300;
					}
					default -> System.out.println("not available in this item");
					}
					System.out.println("continue to eat non veg y/n");
					nyn = sc.next();
					if (nyn.equalsIgnoreCase("y")) {
						System.out.println("Enter non-veg item again");
						item = sc.next().toLowerCase();
					}
				} while (nyn.equalsIgnoreCase("y"));
			}

			case "dest" -> {
				System.out.println("Enter your desert: " + "gulabjam / kulfi / icecream");
				String dest = sc.next().toLowerCase();
				String dyn = "";
				do {
					switch (dest) {
					case "gulabjam", "gulab_jam" -> {
						System.out.println("gulab jam is ₹120/-");
						destBill += 120;
					}
					case "kulfi" -> {
						System.out.println("kulfi price is 40/-");
						System.out.println("how many kulfis :");
						int kulfi = sc.nextInt();
						destBill += (40 * kulfi);
					}
					case "icecream", "ice_cream" -> {
						String mice;
						do {
							System.out.println("enter flavour: "
									+ "vanilla / chocolate / strawberry / butterscotch / blackcurrent");
							String fav = sc.next().toLowerCase();
							switch (fav) {
							case "vanilla" -> {
								System.out.println("vanilla is ₹60/-");
								destBill += 60;
							}
							case "chocolate" -> {
								System.out.println("chocolate is ₹80/-");
								destBill += 80;
							}
							case "strawberry" -> {
								System.out.println("strawberry is ₹70/-");
								destBill += 70;
							}
							case "butterscotch" -> {
								System.out.println("butterscotch is ₹90/-");
								destBill += 90;
							}
							case "blackcurrent" -> {
								System.out.println("blackcurrent is ₹100/-");
								destBill += 100;
							}
							default -> System.out.println("flavour not available");
							}
							System.out.println("are you adding any more ice flavour y/n");
							mice = sc.next();
						} while (mice.equalsIgnoreCase("y"));
					}
					}
					System.out.println("Do you want one more desert y/n");
					dyn = sc.next();
					if (dyn.equalsIgnoreCase("y")) {
						System.out.println("Enter your desert");
						dest = sc.next().toLowerCase();
					}
				} while (dyn.equalsIgnoreCase("y"));
			}

			case "drinks" -> {
				String moreDrink;
				do {
					System.out.println("enter drink: coke / pepsi / sprite / juice / water / beer");
					String drink = sc.next().toLowerCase();
					switch (drink) {
					case "coke" -> {
						System.out.println("coke is ₹50/-");
						drinksBill += 50;
					}
					case "pepsi" -> {
						System.out.println("pepsi is ₹50/-");
						drinksBill += 50;
					}
					case "sprite" -> {
						System.out.println("sprite is ₹50/-");
						drinksBill += 50;
					}
					case "juice" -> {
						System.out.println("juice is ₹80/-");
						drinksBill += 80;
					}
					case "water" -> {
						System.out.println("water is ₹20/-");
						drinksBill += 20;
					}
					case "beer" -> {
						System.out.println("beer is ₹150/-");
						drinksBill += 150;
					}
					default -> System.out.println("drink not available");
					}
					System.out.println("you want more drinks? y/n");
					moreDrink = sc.next();
				} while (moreDrink.equalsIgnoreCase("y"));
			}
			default -> System.out.println("Invalid menu, choose veg/nonveg/dest/drinks");
			}

			System.out.println("are you continue adding any other menu y/n");
			m = sc.next();
			if (m.equalsIgnoreCase("y")) {
				System.out.println("enter your menu");
				menu = sc.next().toLowerCase();
			}
		} while (m.equalsIgnoreCase("y"));

		totalBill = vegItemBill + nvBill + destBill + drinksBill;
		double gstRate = 5;
		double gstAmount = totalBill * gstRate / 100;
		double grandTotal = totalBill + gstAmount;

		System.out.println("\n-------- BILL --------");
		System.out.println("vegetarian item bill     : " + vegItemBill);
		System.out.println("non vegetarian item bill : " + nvBill);
		System.out.println("desert item bill         : " + destBill);
		System.out.println("drinks bill              : " + drinksBill);
		System.out.println("------------------------");
		System.out.println("total bill               : " + totalBill);
		System.out.println("gst Amount               : " + gstAmount);
		System.out.println("-------------------------");
		System.out.println("Total bill  paid at...   :" + grandTotal);
		System.out.println("Thank you visit again!");
		sc.close();
	}
}