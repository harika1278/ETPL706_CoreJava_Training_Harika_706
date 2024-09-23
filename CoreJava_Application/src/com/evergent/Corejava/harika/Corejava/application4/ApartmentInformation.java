package com.evergent.Corejava.harika.Corejava.application4;
import java.util.Scanner;

public class ApartmentInformation extends ApartmentInfoDetails implements ApartmentInterface {
    
    static int apartmentCost;
    static int servicesCost;
    static int noOfApartments;
    static int amount;
    static int apamountdisc;
    static int floorNumber;
    static int flamountdisc;

    // Abstract class implementation
    public void ApartmentDetails() {
        System.out.println("*************************");
        System.out.println("A - Apartment Module");
        System.out.println("P - Payment Module");
        System.out.println("B - Billing Module");
        System.out.println("E - Quit Module");
        System.out.println("*************************");
    }

    public void apartmentInfo() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n APARTMENT MODULE\n");
            System.out.println("***************************************");
            System.out.println("A - To Choose different apartments");
            System.out.println("S - To choose other services");
            System.out.println("D - To choose Discounts");
            System.out.println("M - Return to Main Menu");
            System.out.println("***************************************");
            System.out.println("\n\nEnter your Module code (A,S,D,M) : ");
            String s = scan.nextLine();
            switch (s.toUpperCase()) {
                case "A":
                    System.out.println();
                    System.out.println("\n\nHere you can choose different types of Apartments\n");
                    System.out.println("**************************************");
                    System.out.println("Menu \t Description \t Cost");
                    System.out.println("A \t 1BHK \t\t Rs.10,000");
                    System.out.println("B \t 2BHK \t\t Rs.20,000");
                    System.out.println("C \t 3BHK \t\t Rs.30,000");
                    System.out.println("**************************************");
                    System.out.println("\n\n Enter your code (A,B,C)\n");

                    s = scan.nextLine();
                    switch (s.toUpperCase()) {
                        case "A":
                            apartmentCost = 10000;
                            System.out.println("You have chosen 1BHK");
                            break;
                        case "B":
                            apartmentCost = 20000;
                            System.out.println("You have chosen 2BHK");
                            break;
                        case "C":
                            apartmentCost = 30000;
                            System.out.println("You have chosen 3BHK");
                            break;
                    }
                    break;
                case "S":
                    servicesInfo();
                    break;
                case "D":
                    discountsInfo();
                    break;
                case "M":
                    return; // Return to main menu
                default:
                    System.out.println("Invalid input, please try again.");
            }
        }
    }

    public void servicesInfo() {
        System.out.println("\n Here you can choose the other services : \n");
        System.out.println("***********************************************");
        System.out.println("ITEMS \t DESCRIPTION \t\t COST");
        System.out.println("1. \t GYM \t\t\t Rs.2000 per month");
        System.out.println("2. \t Community Hall \t Rs.500 per month");
        System.out.println("3. \t Sports Club \t\t Rs.500 per month");
        System.out.println("4. \t Laundry Services \t Rs.500 per month");
        System.out.println("5. \t House Keeping \t\t Rs.1500 per month");
        System.out.println("6. \t For all services \t Rs.4500 per month");
        System.out.println("***********************************************");
        System.out.println("\n Enter the Service Number You Required (1,2,3,4,5) : ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int i = Integer.parseInt(s);
        switch (i) {
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
        System.out.println("Service cost : " + servicesCost);
    }

    public void discountsInfo() {
        System.out.println("Here you can go through the discounts");
        System.out.println("******");
        System.out.println("M - Discounts for choosing more apartments");
        System.out.println("F - Discounts for higher floors");
        System.out.println("*****");
        System.out.println("\n Enter the module (M,F)");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        switch (s.toUpperCase()) {
            case "M":
                System.out.println("\n\n Enter the number of apartments you want to buy : ");
                noOfApartments = Integer.parseInt(scan.nextLine());
                amount = apartmentCost * noOfApartments;
                if (noOfApartments >= 1 && noOfApartments <= 3) {
                    apamountdisc = (int) (amount - (amount * 0.03));
                } else if (noOfApartments > 3 && noOfApartments <= 5) {
                    apamountdisc = (int) (amount - (amount * 0.05));
                }
                System.out.println("\n\n Discount amount : " + apamountdisc);
                break;
            case "F":
                System.out.println("Enter the Floor Number : ");
                floorNumber = Integer.parseInt(scan.nextLine());
                amount = apartmentCost * floorNumber;
                if (floorNumber > 1 && floorNumber <= 3) {
                    flamountdisc = (int) (amount - (amount * 0.03));
                } else if (floorNumber > 3 && floorNumber <= 5) {
                    flamountdisc = (int) (amount - (amount * 0.05));
                }
                System.out.println("\n\n Discount amount : " + flamountdisc);
                break;
        }
    }

    public void paymentInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Payment Module");
        System.out.println("****");
        System.out.println("Total Payment Including Services : ");
        System.out.println("BHK1 - Total Amount for 1BHK");
        System.out.println("BHK2 - Total Amount for 2BHK");
        System.out.println("BHK3 - Total Amount for 3BHK");
        System.out.println("****");
        System.out.println("\n Enter Your Module (BHK1,BHK2,BHK3) : ");

        String s = scan.nextLine();
        switch (s.toUpperCase()) {
            case "BHK1":
            case "BHK2":
            case "BHK3":
                System.out.println("Total amount to be paid : Rs." + (apartmentCost + servicesCost + apamountdisc + flamountdisc));
                break;
            default:
                System.out.println("Invalid input, please try again.");
        }
    }

    public void billingInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Billing Module");
        System.out.println("****");
        System.out.println("S - Summary of the Process");
        System.out.println("M - Main Menu");
        System.out.println("****");
        System.out.println("\n Enter Your module (S,M) : ");

        String s = scan.nextLine();
        switch (s.toUpperCase()) {
            case "S":
                System.out.println("\n\t Total Amount");
                System.out.println("Amount paid for Apartment : " + apartmentCost);
                System.out.println("Amount paid for Services  : " + servicesCost);
                System.out.println("Total amount to be paid   : " + (apartmentCost + servicesCost + apamountdisc + flamountdisc));
                break;
            case "M":
                return; // Return to main menu
            default:
                System.out.println("Invalid input, please try again.");
        }
    }

    public void exitInfo() {
        System.out.println("You have exited");
        System.exit(0);
    }

    public static void main(String[] args) {
        Apartment ap1 = new Apartment();
        ApartmentInformation ap = new ApartmentInformation();
        Scanner scan = new Scanner(System.in);

        while (true) {
            ap.ApartmentDetails();
            System.out.println("Enter your choice (A, P, B, E): ");
            String choice = scan.nextLine();

            switch (choice.toUpperCase()) {
                case "A":
                    ap.apartmentInfo();
                    break;
                case "P":
                    ap.paymentInfo();
                    break;
                case "B":
                    ap.billingInfo();
                    break;
                case "E":
                    ap.exitInfo();
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
            }
        }
    }
}