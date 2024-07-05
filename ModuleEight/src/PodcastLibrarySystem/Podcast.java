/*
Author: Angel Chavez
Assignment: Final Exam
Date: 5/10/2024
Language: Java
Description: super class for different Podcast objets uses showDetails from both super class and interface
*/
//resources https://www.reddit.com/r/javahelp/comments/xmuq2v/tostring_method_gets_ignored/
package PodcastLibrarySystem;

public abstract class Podcast{
    //instance variables
    private String title;
    private int minutes;

    //constructors
    public Podcast(String title, int minutes) {
        this.title = title;
        this.minutes = minutes;
    }

    public Podcast() {
        this.title = "none";
        this.minutes = 0;
    }

    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    //abstract method
    public void showDetails();
//    public abstract void start();
//    public abstract void stop();

    //functions
    @Override
    public String toString() {
        return  "Podcast Title: " + title + "\n" +
                "Length: " + minutes;
    }
}
