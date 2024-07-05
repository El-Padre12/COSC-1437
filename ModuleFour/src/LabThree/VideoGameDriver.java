/*
Author: Angel Chavez
Assignment: Module 4 Lab 3
Date: 3/6/2024
Language: Java
Description: a program to manage a collection of video games using a VideoGame class, includes functions to add
             new video games to the inventory, display the entire inventory of video games, and allow users to search
             for games by their title or platform.
*/
package LabThree;

import java.util.ArrayList;
import java.util.Scanner;

public class VideoGameDriver {
    public static void main(String[] args) {
        int menuChoice = 0;

        ArrayList<VideoGame> gameLibrary = new ArrayList<VideoGame>();
        Scanner myScan = new Scanner(System.in);

        System.out.println("Video Game Management Application");
        do {
            System.out.println("1. Add a Video Game");
            System.out.println("2. View Inventory");
            System.out.println("3. Search by Title");
            System.out.println("4. Search by Platform");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            menuChoice = myScan.nextInt();
            myScan.nextLine();

            switch (menuChoice) {
                case 1:
                    addGame(gameLibrary, myScan);
                    break;
                case 2:
                    viewInventory(gameLibrary);
                    break;
                case 3:
                    searchByTitle(gameLibrary, myScan);
                    break;
                case 4:
                    searchByPlatform(gameLibrary, myScan);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(menuChoice != 5);

    }// end of main

    //functions
    public static void addGame(ArrayList<VideoGame> gameLibrary, Scanner myScan) {
        String title, genre, platform;
        double price;

        System.out.print("Enter the title of the game: ");
        title = myScan.nextLine();

        System.out.print("Enter the genre of the game: ");
        genre = myScan.nextLine();

        System.out.print("Enter the platform of the game: ");
        platform = myScan.nextLine();

        System.out.print("Enter the price of the game: ");
        price = myScan.nextDouble();

        VideoGame game = new VideoGame(title, genre, platform, price);
        gameLibrary.add(game);

        System.out.println("Game added to inventory successfully!");
    }

    public static void viewInventory(ArrayList<VideoGame> gameLibrary) {
        if(gameLibrary.isEmpty()) {
            System.out.println("\nGame library empty...\n");
        }else {
            System.out.println("\nContents: ");

            for(VideoGame aVideoGame : gameLibrary) {
                System.out.println(aVideoGame);
            }
        }
    }

    public static void searchByTitle(ArrayList<VideoGame> gameLibrary, Scanner myScan) {
        String searchString;
        boolean isFound = false;

        System.out.print("Enter title to search: ");
        searchString = myScan.nextLine();
        if(gameLibrary.isEmpty()) {
            System.out.println("\nLibrary empty...\n");
        }else {
            for(VideoGame myGame : gameLibrary) {

                if(myGame.getTitle().equalsIgnoreCase(searchString)) {

                    System.out.println("Video games found: ");
                    System.out.println(myGame);
                }
            }
        }if(!isFound) {
            System.out.println("Game not found");
        }
    }

    public static void searchByPlatform(ArrayList<VideoGame> gameLibrary, Scanner myScan) {
        String searchString;
        boolean isFound = false;

        System.out.print("Enter platform to search: ");
        searchString = myScan.nextLine();
        if(gameLibrary.isEmpty()) {
            System.out.println("\nLibrary empty...\n");
        }else {
            for(VideoGame myGame : gameLibrary) {

                if(myGame.getPlatform().equalsIgnoreCase(searchString)) {

                    System.out.println("Video games found: ");
                    System.out.println(myGame);
                    isFound = true;
                }
            }
        }
        if(!isFound) {
            System.out.println("Game not found");
        }
    }

}//end of class