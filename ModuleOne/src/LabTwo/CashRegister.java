/*
Author: Angel Chavez
Assignment: Module 1 Lab 2
Date: 1/28/2024
Language: Java
Description: Program for your organization that will add up all the money in the cash register.
*/

// ran into a problem with the NumberFormat method
// didn't know you can't create a new instance of it with it being abstract, since I skipped over that bit in the book
// won't happen again.
//https://stackoverflow.com/questions/22535868/why-am-i-getting-a-cannot-find-symbol-when-i-compile

package LabTwo;

import java.text.NumberFormat;
import java.util.Scanner;

public class CashRegister {
    public static void main(String[] args) {
        int twentyBills = 0;
        int tenBills = 0;
        int fiveBills = 0;
        int oneBills = 0;
        double quarterCoins = 0.0;
        double dimeCoins = 0.0;
        double nickelCoins = 0.0;
        double pennyCoins = 0.0;
        double safeCount = 0.0;

        Scanner myScan = new Scanner(System.in);
        NumberFormat usDollar = NumberFormat.getCurrencyInstance();

        System.out.println("Safe Count");
        System.out.println("Enter in dollar amount");
        System.out.println();
        System.out.print("Enter amount for $20: ");
        twentyBills = myScan.nextInt();
        System.out.print("Enter amount for $10: ");
        tenBills = myScan.nextInt();
        System.out.print("Enter amount for $5: ");
        fiveBills = myScan.nextInt();
        System.out.print("Enter amount for $1: ");
        oneBills = myScan.nextInt();
        System.out.print("Enter amount for 25c: ");
        quarterCoins = myScan.nextDouble();
        System.out.print("Enter amount for 10c: ");
        dimeCoins = myScan.nextDouble();
        System.out.print("Enter amount for  5c: ");
        nickelCoins = myScan.nextDouble();
        System.out.print("Enter amount for  1c: ");
        pennyCoins = myScan.nextDouble();

        System.out.println();

        System.out.println("Twenties: " + usDollar.format(twentyBills));
        System.out.println("Tens: " + usDollar.format(tenBills));
        System.out.println("Fives: " + usDollar.format(fiveBills));
        System.out.println("Ones: " + usDollar.format(oneBills));
        System.out.println("Quarters: " + usDollar.format(quarterCoins));
        System.out.println("Dimes: " +  usDollar.format(dimeCoins));
        System.out.println("Nickels: " +  usDollar.format(nickelCoins));
        System.out.println("Pennies: " + usDollar.format(pennyCoins));
        System.out.println();

        safeCount = (twentyBills + tenBills + fiveBills + oneBills) +
                    (quarterCoins + dimeCoins + nickelCoins + pennyCoins);

        System.out.println("Total safe count: " + safeCount);

    }
}
