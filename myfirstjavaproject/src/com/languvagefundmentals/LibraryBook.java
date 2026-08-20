package com.languvagefundmentals;

public class LibraryBook {
	int bookid;
	String booktitle;
	String authorname ;
	int availablecopies;
	static String libraryname = "ufgweuyfgew";
	static String librarianname = "lokiehshdfgf";
	
	
	  void displaybookdetails() {
		  System.out.println("bookid:"+ bookid);
		  System.out.println("booktitle:"+ booktitle);
		  System.out.println("authorname :"+ authorname );
		  System.out.println("availablecopies:"+ availablecopies);
		  
	  
	  }
	
	   void issueBook(){
		 if (availablecopies>0) {
			 availablecopies--;
			 System.out.println("book issued succcesfully");
			 
		 }
		 else {
			 System.out.println("Book is not available");
		 }
	}
	  
     	void displaylibrarydetails() {
     		System.out.println("libraryname:"+ libraryname);
     		System.out.println("librarianname:"+librarianname);
		
	}
     	void changelibrarian() {
     		librarianname = "gopi";
     	
     	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryBook lb1 = new LibraryBook();
		LibraryBook lb2 = new LibraryBook();
		
		lb1.bookid= 121;
		lb1.booktitle= "mahatmaji";
		lb1.authorname = "gandhiji";
		lb1.availablecopies= 10;
		
		lb1.issueBook();
		lb1.displaylibrarydetails();
		
		lb1.displaybookdetails();
		
		lb2.bookid= 122;
		lb2.booktitle= "mahatmaji";
		lb2.authorname = "gandhiji";
		lb2.availablecopies= 89;
		
		lb2.issueBook();
		lb2.displaylibrarydetails();
		
		lb2.displaybookdetails();
	
		
	}
	
	

}
