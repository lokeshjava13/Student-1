package com.languvagefundmentals;

public class Movies {

	int movieid;
	String moviename;
	String heroName;
	int availableseats;
	static String theaterName = "imax";
	static String managerName = "anjibabu";
	
	 void dispalyMovieDetails() {
		 System.out.println("movieid:"+movieid);
		 System.out.println("moviename:"+moviename);
		 System.out.println(" heroName:"+ heroName);
		 System.out.println("availableseats:"+availableseats);
	 }
	 
	 void bookseat() {
		 
			 
		 if(availableseats >0){
		 availableseats --;
		 System.out.println("seat book succesfully:"+moviename);
		
		 }else{
				 System.out.println("no seats available for :"+moviename); 
			
		 }
	 } 
	        static void displayTheaterDetails() {
			 System.out.println("theaterName:"+theaterName);
			 System.out.println("managerName:"+managerName);
			 
		 }
           static void changemanager(String newmanagerName) {
        	   managerName = newmanagerName ;
           }
	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movies m1 = new Movies();
		Movies m2 = new Movies();

		
		theaterName = "pvr mall";
		managerName = "lokeshkumar";
		
		m1.movieid = 121;
		m1.moviename = "chatrapthi";
	    m1.heroName = "prabhas";
		m1.availableseats = 30;
		m2.movieid = 121;
    	m2.moviename = "chatrapthi";
	    m2.heroName = "prabhas";
		m2.availableseats = 30;
		
		System.out.println("=====theater details====");
		m1.displayTheaterDetails();
		m2.displayTheaterDetails();
		System.out.println("=====MOVIE DETAILS====");
		m1.dispalyMovieDetails();
		m2.dispalyMovieDetails();
		System.out.println("=====BOOKING SEATS====");
		
		m1.bookseat();
		m2.bookseat();
		
		System.out.println("=====UPDATED MOVIE====");

         m1.dispalyMovieDetails();
         m2.dispalyMovieDetails();
         
         changemanager("suresh");
         
         
	}

}
