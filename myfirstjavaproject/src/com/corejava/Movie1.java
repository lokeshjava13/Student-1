package com.corejava;

public class Movie1 {
	class Movie {

	    String movieName;
	    int releasedYear;
	    double ticketPrice;

	  
	    Movie movie1 = new Movie();
	    Movie movie2 = new Movie();
	    Movie movie3 = new Movie();

	    {
	        movie1.movieName = "Leo";
	        movie1.releasedYear = 2023;
	        movie1.ticketPrice = 200;
            System.out.println("movie name :"+movieName);
	        movie2.movieName = "Jailer";
	        movie2.releasedYear = 2023;
	        movie2.ticketPrice = 180;

	        movie3.movieName = "Vikram";
	        movie3.releasedYear = 2022;
	        movie3.ticketPrice = 220;
	    }
	   
	}
	

}
