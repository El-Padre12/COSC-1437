/*
Author: Angel Chavez
Assignment: Final Exam
Date: 5/10/2024
Language: Java
Description: subclass Story Podcast uses showDetails from both super class and interface
*/
//resources https://www.reddit.com/r/javahelp/comments/xmuq2v/tostring_method_gets_ignored/
package PodcastLibrarySystem;

public class Story extends Podcast implements ILibrary, IPlay{
    //instance variables
    private String narrator, author;

    public Story(String title, int minutes, String narrator, String author) {
        super(title, minutes);
        this.narrator = narrator;
        this.author = author;
    }

    public Story() {
        super();
        this.narrator = "none";
        this.author = "none";
    }

    //getters and setters
    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //method
    @Override
    public void start() {
        System.out.println("Playing Educational Podcast:");
        System.out.println("Starting to play Lord of the Rings");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Lord of the Rings");
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString());
        System.out.println("Narrator: " + narrator);
        System.out.println("Author: " + author);
    }
}
