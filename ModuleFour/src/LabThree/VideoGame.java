/*
Author: Angel Chavez
Assignment: Module 4 Lab 3
Date: 3/6/2024
Language: Java
Description: class for VideoGame objects
*/
package LabThree;

import java.text.NumberFormat;

public class VideoGame {
    private String title, genre, platform;
    private double price;

    //currency formatting for price
    NumberFormat currency = NumberFormat.getCurrencyInstance();

    //constructors
    public VideoGame(String title, String genre, String platform, double price) {
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.price = price;
    }

    public VideoGame() {
        this.title = "none";
        this.genre = "none";
        this.platform = "none";
        this.price = 0.0;
    }

    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //functions

    @Override
    public String toString() {
        return  "Title: " + title + " " +
                "Genre: " + genre + " " +
                "Platform: " + platform + " " +
                "Price: " + currency.format(price) + "\n";
    }
}
