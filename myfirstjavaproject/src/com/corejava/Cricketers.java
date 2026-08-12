package com.corejava;

public class Cricketers {

	
		
		
			static int countryID = 1;
			static String countryName = "HinduStan";
			
			
			int jerseyNumber  = 1;
			String cricketerName = "Unknown";
			public static void main(String[] args) {
				System.out.println("main method started ");
				System.out.println("Welcome to Indian Cricket Team !");
//			
				System.out.println("****Object1 info *******************");
				Cricketers msd = new Cricketers();
				countryID = 91;
				countryName = "India";
				msd.jerseyNumber = 7;
				msd.cricketerName = "Mahendra Singh Dhoni ";
//				
				System.out.println("Country ID : " + countryID);
				System.out.println("Country Name : " + countryName);
//				
				System.out.println("Jersey Number : " + msd.jerseyNumber);
				System.out.println("Cricketer Name : " + msd.cricketerName);
				System.out.println("****Object2 info *******************");
				Cricketers virat = new Cricketers();
				virat.jerseyNumber = 18;
				virat.cricketerName = "Virat Kohli";
				System.out.println("Country ID : " + countryID);
				System.out.println("Country Name : " + countryName);
				System.out.println("Jersey Number : " + virat.jerseyNumber);
				System.out.println("Cricketer Name : " + virat.cricketerName);
				System.out.println("****Object3 info *******************");
				Cricketers rohit = new Cricketers();
				rohit.jerseyNumber = 45;
				rohit.cricketerName = "Rohit Sharma";
				System.out.println("Country ID : " + countryID);
				System.out.println("Country Name : " + countryName);
				System.out.println("Jersey Number : " + rohit.jerseyNumber);
				System.out.println("Cricketer Name : " + rohit.cricketerName);
				
				System.out.println("*********** Object 4 Info *********");
				Cricketers vaibhav = new Cricketers();
				countryID = 92;
				countryName = "Bharath";
				vaibhav.jerseyNumber = 3;
				vaibhav.cricketerName = "Vaibhav Sooryavansi ";
				System.out.println("Country ID : " + countryID);
				System.out.println("Country Name : " + countryName);
				System.out.println("Jersey Number : " + vaibhav.jerseyNumber);
				System.out.println("Cricketer Name : " + vaibhav.cricketerName);
				Cricketers kl = new Cricketers();
				
				kl.jerseyNumber = 1;
				kl.cricketerName = "K Lokesh Rahul ";
				System.out.println("Country ID : " + countryID);
				System.out.println("Country Name : " + countryName);
				System.out.println("Jersey Number : " + kl.jerseyNumber);
				System.out.println("Cricketer Name : " + kl.cricketerName);
//				
			}
		}





		