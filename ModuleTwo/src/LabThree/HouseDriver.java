/*
Author: Angel Chavez
Assignment: Module 2 Lab 3
Date: 2/9/2024
Language: Java
Description: Program that displays house address, bedrooms, restrooms, sale price, price per square foot,
             and total square footage. Also gets updated price from user and displays that updated price.
*/
package LabThree;

import java.text.NumberFormat;
import java.util.Scanner;

public class HouseDriver {
    public static void main(String[] args) {
        String userAddress;
        int userBedrooms, userSquareFeet;
        double userPrice, userBathrooms, userUpdatedPrice;

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        Scanner myScan = new Scanner(System.in);
        House usersHouse;

        System.out.print("Input Address: ");
        userAddress = myScan.nextLine();
        System.out.print("Input how many Bedrooms: ");
        userBedrooms = myScan.nextInt();
        System.out.print("Input how many Bathrooms: ");
        userBathrooms = myScan.nextDouble();
        System.out.print("Input Square footage of house: ");
        userSquareFeet = myScan.nextInt();
        System.out.print("Input Price of the house: ");
        userPrice = myScan.nextInt();

        usersHouse = new House(userAddress, userBedrooms, userSquareFeet, userBathrooms, userPrice);

        System.out.println(usersHouse.printInfo());
        System.out.println(currencyFormatter.format(usersHouse.calculatePricePerSqFt()));

        //prompt user to input updated price.
        System.out.print("\nInput updated price: ");
        userUpdatedPrice = myScan.nextDouble();

        usersHouse.setHousePrice(userUpdatedPrice);

        System.out.println("New Price of house: " + currencyFormatter.format(usersHouse.getHousePrice()));
        System.out.println(currencyFormatter.format(usersHouse.calculatePricePerSqFt()));
    }
}
