package com.evergent.Corejava.harika.CaseStudy;

public class KidUsers implements LibraryUser{
	private int age;
    private String bookType;
    
    public KidUsers(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }
    
    public void registerAccount(int age) {
    	try {
    		if(age < 12) {
        		System.out.println("You have successfully registered under a Kids Account");
        	}
    		else {
        		throw new AgeException("Sorry, Age must be less than 12 to register as a kid");
        	}
    	}
    	catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    	
    }
    public void requestBook(String btype) {
    	try {
    		if("Kids".equals(bookType)) {
        		System.out.println("Book Issued successfully, please return the book within 10 days");
        	}
        	else {
        		throw new BookTypeException("Oops, you are allowed to take only kids books");
        	}
    	}
    	catch(BookTypeException e) {
    		System.out.println(e.getMessage());
    	}
    	
    }
}
