package com.corejava;

public class LibraryBook {
	
	int book_id ;
	String book_title ;
	String author_name ;
	int availablecopies;
	static String libraryname;
	static String librarianname;
	
			
      public  void displayBookdetails() {
    	  
    	  System.out.println("book_id:"+ book_id);
    	  System.out.println("book_title:"+ book_title);
    	  System.out.println("authr_name:"+ author_name);
    	  System.out.println("availablecopies"+availablecopies);
    	  

      }
   
		public void displaylibrarydetails() {
		  System.out.println("libraryname:"+libraryname);
		  System.out.println("librarianname:"+librarianname);   
			
		}

	public static void main(String[] args) {
		System.out.println("Library Details");
		
		LibraryBook b1 = new LibraryBook();
		
		b1.book_id = 101 ;
		b1.author_name ="java";
		b1.availablecopies = 3;
		b1.libraryname = "gandhiji studies";
		b1.librarianname = "Prasanth";
		b1.displaylibrarydetails();
		b1.displayBookdetails();
		
		System.out.println("******* object 2*****");
		
LibraryBook b2 = new LibraryBook();
		
		b2.book_id = 102 ;
		b2.author_name ="mahatama  gandhi";
		b2.availablecopies = 10;
		
		b1.displaylibrarydetails();
		b1.displayBookdetails();
		
	
		
		
		

	}

}
