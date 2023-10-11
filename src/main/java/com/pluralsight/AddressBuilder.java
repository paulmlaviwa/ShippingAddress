package com.pluralsight;

import java.util.Scanner;

        /*
        Billing Street: 123 Main Street
        Billing City: Middleton
        Billing State: TX
        Billing Zip: 75111
        Shipping Street: 456 Big Sky Blvd
        Shipping City: Outer Rim
        Shipping State: TX
        Shipping Zip: 75333
        */

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please provide the following information:");

        System.out.print("Full name: ");
        String fullName = myScanner.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = myScanner.nextLine();

        System.out.print("Billing City: ");
        String billingCity = myScanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = myScanner.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = myScanner.nextLine();

        System.out.print("Shipping Street: ");
        String shippingStreet = myScanner.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = myScanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = myScanner.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = myScanner.nextLine();

        StringBuilder userInfo = new StringBuilder();
        System.out.println("Billing Address: ");
        
        userInfo.append(fullName + "\n");
        userInfo.append(billingStreet + "\n");
        userInfo.append(billingCity + ", " + billingState + " " + billingZip + "\n");

        userInfo.append("\n"); // Add a blank line

        System.out.println("Shipping Address: ");
        userInfo.append(shippingStreet + "\n");
        userInfo.append(shippingCity + ", "+ shippingState + " " + shippingZip + "\n");

        String appendedInfo= userInfo.toString();
        System.out.println(appendedInfo);
    }
}
