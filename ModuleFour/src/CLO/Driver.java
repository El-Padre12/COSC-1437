/*
Author: Angel Chavez
Assignment: Module 4 CLO 5/6
Date: 3/10/2024
Language: Java
Description: Contacts list program using parallel arrays in Java. viewing all contacts, searching by last name,
             searching by first name, sorting contacts, and quitting the program.
*/
//resources used: https://stackoverflow.com/questions/27028033/how-to-make-a-method-that-searches-a-parallel-array
package CLO;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    static Scanner myScan = new Scanner(System.in);

    public static void main(String[] args) {
        int menuChoice = 0;

        String[] firstName = {"bill", "susan", "thomas", "miguel", "abraham"};
        String[] lastName = {"ferrel", "thompson", "henderson", "lopez", "chavez"};
        String[] email = {"b.feral@hotmail.com", "susy.t@gmail.com", "tomhen35@yahoo.com", "milo777@gmail.com",
                          "abchavez@gmail.com"};
        String[] phoneNumber = {"2104567890", "2105679462", "8174560927", "2105679835", "2105672305"};


        System.out.println("Parallel Arrays Menu");
        do {
            System.out.println("1. Show all contacts");
            System.out.println("2. Search based off first name");
            System.out.println("3. Search based off last name");
            System.out.println("4. Sort contact list");
            System.out.println("5. exit");
            System.out.print("Enter your choice: ");
            menuChoice = myScan.nextInt();
            myScan.nextLine();

            switch (menuChoice) {
                case 1:
                    viewContacts(firstName, lastName, email, phoneNumber);
                    break;
                case 2:
                    searchByFirstName(firstName, lastName, email, phoneNumber);
                    break;
                case 3:
                    searchByLastName(firstName, lastName, email, phoneNumber);
                    break;
                case 4:
                    sortContacts(firstName, lastName, email, phoneNumber);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!!");
            }
        }while (menuChoice != 5);

    }// end of main

    //functions
    public static void viewContacts(String[] fName, String[] lName, String[] email, String[] pNumber) {
        for (int i = 0; i < fName.length; i++) {

            System.out.println(fName[i] + " " + lName[i] + "'s" + " Email: " + email[i] + " Phone Number: " +
                               pNumber[i] + "\n");
        }
    }

    public static void sortContacts(String[] fName, String[] lName, String[] email, String[] pNumber) {

        Arrays.sort(fName); Arrays.sort(lName); Arrays.sort(email); Arrays.sort(pNumber);

        System.out.println("Sorted contact list!");
        for (int i = 0; i < fName.length; i++) {
            System.out.println(fName[i] + " " + lName[i] + "'s" + " Email: " + email[i] + " Phone Number: " +
                               pNumber[i] + "\n");
        }
    }

    public static void searchByFirstName(String[] fName, String[] lName, String[] email, String[] pNumber) {
        String searchString;

        System.out.print("Enter first name: ");
        searchString = myScan.nextLine();

        for (int i = 0; i < fName.length; i++) {

            if (fName[i].equalsIgnoreCase(searchString)) {
                System.out.println("Person: " + i + "\n" +
                                    fName[i] + " " + lName[i] +
                                    " Email: " + email[i] +
                                    " Phone Number: " + pNumber[i]);
                return;
            }
        }
        System.out.println("Name not found...");
    }

    public static void searchByLastName(String[] fName, String[] lName, String[] email, String[] pNumber) {
        String searchString;

        System.out.print("Enter last name: ");
        searchString = myScan.nextLine();

        for (int i = 0; i < lName.length; i++) {

            if (lName[i].equalsIgnoreCase(searchString)) {
                System.out.println("Person: " + i + "\n" +
                                    fName[i] + " " + lName[i] +
                                    " Email: " + email[i] +
                                    " Phone Number: " + pNumber[i]);
                return;
            }
        }
        System.out.println("Name not found...");
    }
}// end of class