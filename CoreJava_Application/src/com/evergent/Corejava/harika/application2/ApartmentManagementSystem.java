package com.evergent.Corejava.harika.application2;

import java.io.IOException;

import java.util.Scanner;


public class ApartmentManagementSystem {
	
	enum module1{A,P,B,E};
	enum submodule1{A,S,D,M};
	enum submodule2{A,B,C};
	enum submodule3{BHK1,BHK2,BHK3};
	enum submodule4{S,M};
	enum submodule5{M,F};
	static int apartmentCost;
	static int servicesCost;
	static int noOfApartments;
	static int apamountdisc;
	static int flamountdisc;
	static int amount;
	static int floorNumber;

	public static void main(String[] args) {
		
		String module= null;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\t\t \t\t **Welcome To APARTMENT MANAGEMENT SYSTEM**");
		
		while(true) {
			System.out.println("***********************");
			System.out.println(" AMS MAIN MENU");
			System.out.println("***********************");
			System.out.println("A - Apartment Module");
			System.out.println("P - Payment Module");
			System.out.println("B - Billing Module");
			System.out.println("E - Quit Module");
			System.out.println("***********************");
		    System.out.println("\n Enter your Module code (A,P,B,E) : ");
		    
		    module = scan.nextLine();
		    
		    switch(module1.valueOf(module)) {
		    	
		    	case A:
			    	System.out.println("APARTMENT MODULE");
			    	System.out.println("***********************************");
			    	System.out.println("A - To Choose different apartments");
			    	System.out.println("S - To choose other services");
			    	System.out.println("D - To choose Discounts");
			    	System.out.println("M - Return to Main Menu");
			    	System.out.println("***********************************");
			    	System.out.println("Enter your Module code (A,S,D,M) : ");
		    	
			    	module = scan.nextLine();
			    	
			    	switch(submodule1.valueOf(module)) {
			    		
			    		case A:
			    			System.out.println();
			    			System.out.println("Here you can choose different types of Apartments\n");
			    			System.out.println("**********************************************");
			    			System.out.println("Menu \t Description \t Cost");
			    			System.out.println("A \t 1BHK \t\t Rs.10,000");
			    			System.out.println("B \t 2BHK \t\t Rs.20,000");
			    			System.out.println("C \t 3BHK \t\t Rs.30,000");
			    			System.out.println("**********************************************");
			    			System.out.println("\n Enter your code (A,B,C)");
			    			
			    			module = scan.nextLine();
			    			
			    			switch(submodule2.valueOf(module)) {
			    				
			    				case A:
			    					apartmentCost = 10000;
			    					break;
			    				case B:
			    					apartmentCost = 20000;
			    					break;
			    				case C:
			    					apartmentCost = 30000;
			    					break;
			    					
			    			}
			    			//System.out.println("Apartment Cost : "+apartmentCost);
			    			break;
			    			
			    		case S:
			    			System.out.println("\n Here you can choose the other services : \n");
			    			System.out.println("**********************************************");
			    			System.out.println("ITEMS \t DESCRIPTION \t\t COST");
			    			System.out.println("1. \t GYM \t\t\t Rs.2000 per month");
			    			System.out.println("2. \t Community Hall \t Rs.500 per month");
			    			System.out.println("3. \t Sports Club \t\t Rs.500 per month");
			    			System.out.println("4. \t Laundry Services \t Rs.500 per month");
			    			System.out.println("5. \t House Keeping \t\t Rs.1500 per month");
			    			System.out.println("6. \t For all services \t\t Rs.4500 per month");
			    			System.out.println("**********************************************");
			    			System.out.println("\n Enter the Service Number You Required (1,2,3,4,5) : ");
			    			
			    			module = scan.nextLine();
			    			int i = Integer.parseInt(module);
			    			switch(i) {
			    				case 1:
			    					servicesCost = 2000;
			    					break;
			    				case 2:
			    					servicesCost = 500;
			    					break;
			    				case 3:
			    					servicesCost = 500;
			    					break;
			    				case 4:
			    					servicesCost = 600;
			    					break;
			    				case 5:
			    					servicesCost = 1500;
			    					break;
			    				case 6:
			    					servicesCost = 4500;
			    					break;
			    			}
			    			//System.out.println("Services Cost : " +servicesCost);
			    			break;
			    		case D:
			    			System.out.println("Here you can go through the discounts");
			    			System.out.println("********************************************");
			    			System.out.println("M - Discounts for choosing more apartments");
			    			System.out.println("F - Discounts for higher floors");
			    			System.out.println("***********************************");
			    			//noOfApartments = scan.nextInt();
			    			System.out.println("\n Enter the module (M,F)");
			    			module = scan.nextLine();
			    			switch(submodule5.valueOf(module)) {
			    			case M:
			    				System.out.println("Enter the number of apartements want to buy : ");
			    				noOfApartments =Integer.parseInt(scan.nextLine());
			    				amount = apartmentCost * noOfApartments;
			    				if(noOfApartments > 1 && noOfApartments <= 3) {
			    					apamountdisc=(int) (amount-(amount*0.03));
			    			}
			    			else if(noOfApartments > 3 && noOfApartments <= 5) {
			    				apamountdisc=(int) (amount-(amount*0.05));
			    			}
			    			System.out.println("\n\n Discount amount : \n\n"+apamountdisc);
			    			break;
			    			case F:
			    				System.out.println("Enter the Floor Numbers : ");
			    				floorNumber = Integer.parseInt(scan.nextLine());
			    				amount = apartmentCost * floorNumber;
			    				if(floorNumber > 1 && floorNumber <= 3) {
			    					flamountdisc = (int)(amount - (amount * 0.03));
			    				}
			    				else if(floorNumber > 3 && floorNumber <= 5) {
			    					flamountdisc = (int)(amount - (amount * 0.05));
			    				}
			    				System.out.println("\n\n Discount amount : \n\n"+flamountdisc);
			    				break;
			    			}
			    		
			    				
			    	}
			    break;
			    
		    	case P:
		    		System.out.println("Payment Module");
		    		System.out.println("************************************");
		    		System.out.println("Total Payment Including Services : ");
		    		System.out.println("BHK1 - Total Amount for 1BHK");
		    		System.out.println("BHK2 - Total Amount for 2BHK");
		    		System.out.println("BHK3 - Total Amount for 3BHK");
		    		System.out.println("************************************");
		    		System.out.println("\n Enter Your Module (BHK1,BHK2,BHK3) : ");
		    		
		    		module = scan.nextLine();
		    		switch(submodule3.valueOf(module)) {
		    		
		    			case BHK1:
		    				System.out.println("Total amount to be paid : Rs."+(apartmentCost + servicesCost + apamountdisc + flamountdisc));
		    				break;
		    			case BHK2:
		    				System.out.println("Total amount to be paid : Rs."+(apartmentCost + servicesCost + apamountdisc + flamountdisc));
		    				break;
		    			case BHK3:
		    				System.out.println("Total amount to be paid : Rs."+(apartmentCost + servicesCost + apamountdisc + flamountdisc));
		    				break;
		    		}
			    	break;
		    	case B:
		    		System.out.println("Billing Module");
		    		System.out.println("****************************");
		    		System.out.println("S - Summary of the Process");
		    		System.out.println("M - Main Menu");
		    		System.out.println("****************************");
		    		System.out.println("\n Enter Your module (S,M) : ");
		    		
		    		module = scan.nextLine();
		    		switch(submodule4.valueOf(module)) {
		    			
		    			case S:
		    				System.out.println("\n\t Total Amount");
		    				System.out.println("Amount paid for Apartment : " +apartmentCost);
				    		System.out.println("Amount paid for Services  : " +servicesCost);
				    		System.out.println("Total amount to be paid   : " +(apartmentCost + servicesCost + apamountdisc + flamountdisc));
				    		break;
		    		}
		    		break;
		    		
		    	case E:
		    		System.out.println("Quit Module");
		    		System.exit(0);
		    		break;
		    		
		    }
		}

	}

}
