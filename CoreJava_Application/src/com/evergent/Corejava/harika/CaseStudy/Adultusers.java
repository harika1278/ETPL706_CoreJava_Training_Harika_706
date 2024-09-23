package com.evergent.Corejava.harika.CaseStudy;

public class Adultusers implements LibraryUser{
	private int age;
    private String bookType;
    

    public Adultusers(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }
    
    public void registerAccount(int age) {
    	try {
    		if(age > 12) {
        		System.out.println("You have successfully registered under an Adult Account");
        	}
        	else {
        		throw new AgeException("Sorry, Age must be greater than 12 to register as an adult");
        	}
    	}
    	catch(AgeException e) {
    		System.out.println(e.getMessage());
    	}
    	
    }
    public void requestBook(String btype) {
    	try {
    		if("Fiction".equals(bookType)) {
        		System.out.println("Book Issued successfully, please return the book within 7 days");
        	}
        	else {
        		throw new BookTypeException("Oops, you are allowed to take only adult Fiction books");
        	}
    	}
    	catch(BookTypeException e) {
    		System.out.println(e.getMessage());
    	}
    	
    }
}
