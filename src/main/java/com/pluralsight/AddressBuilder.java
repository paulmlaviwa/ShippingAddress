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
        userInfo.append("Full Name: " + fullName + "\n");
        userInfo.append("Billing Street: " + billingStreet + "\n");
        userInfo.append("Billing City: " + billingCity + "\n");
        userInfo.append("Billing State: " + billingState + "\n");
        userInfo.append("Billing Zip: " + billingZip + "\n");
        userInfo.append("Shipping Street: " + shippingStreet + "\n");
        userInfo.append("Shipping City: " + shippingCity + "\n");
        userInfo.append("Shipping State: " + shippingState + "\n");
        userInfo.append("Shipping Zip: " + shippingZip + "\n");

        System.out.println("User Informati
        System.out.println(userInfo.toString());


    }
}
