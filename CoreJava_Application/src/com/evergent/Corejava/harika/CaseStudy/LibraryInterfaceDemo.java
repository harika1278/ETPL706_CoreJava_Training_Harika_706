package com.evergent.Corejava.harika.CaseStudy;
import java.util.*;
public class LibraryInterfaceDemo {

	public static void main(String[] args) throws LibraryException{
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Test Case #1:");
		 
		 System.out.println("Enter the kid1 details : \n");
		 
		 // KidUser with age 10 BookType kids
		 System.out.println("Enter age of Kid User 1 : ");
		 int kid1Age = scan.nextInt();
		 System.out.print("Enter book type for Kid User 1: ");
		 String kid1BookType = scan.nextLine();
		 KidUsers kid1 = new KidUsers(kid1Age,kid1BookType);
		 kid1.registerAccount(kid1Age);
		 kid1.requestBook(kid1BookType);
		 
		 System.out.println("Enter the kid2 details : \n");

		// KidUser with age 18 Book Type Fiction
		 System.out.println("Enter age of Kid User 2 : ");
		 int kid2Age = scan.nextInt();
		 System.out.print("Enter book type for Kid User 2: ");
		 String kid2BookType = scan.nextLine();
		 KidUsers kid2 = new KidUsers(kid2Age,kid2BookType);
		 kid2.registerAccount(kid2Age);
		 kid2.requestBook(kid2BookType);

	     
	     System.out.println("\nTest Case #2:");
	     
	     System.out.println("Enter the Adult1 details : \n");
	     
	     // AdultUser with age 5 Book Type Kids
	     System.out.println("Enter age of Adult User 1 : ");
	     System.out.println("Enter age of Kid User 1 : ");
		 int adult1Age = scan.nextInt();
		 System.out.print("Enter book type for Kid User 1: ");
		 String adult1BookType = scan.nextLine();
		 Adultusers adult1 = new Adultusers(adult1Age,adult1BookType);
		 adult1.registerAccount(adult1Age);
		 adult1.requestBook(adult1BookType);

		  // AdultUser with age 23 and Fiction
		 System.out.println("Enter age of Adult User 2 : ");
	     System.out.println("Enter age of Kid User 2 : ");
		 int adult2Age = scan.nextInt();
		 System.out.print("Enter book type for Kid User 2: ");
		 String adult2BookType = scan.nextLine();
		 Adultusers adult2 = new Adultusers(adult1Age,adult1BookType);
		 adult1.registerAccount(adult1Age);
		 adult1.requestBook(adult1BookType);
	    	 
	     }

	}


