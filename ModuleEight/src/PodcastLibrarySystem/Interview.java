/*
Author: Angel Chavez
Assignment: Final Exam
Date: 5/10/2024
Language: Java
Description: subclass Interview Podcast uses showDetails from both super class and interface
*/
//resources https://www.reddit.com/r/javahelp/comments/xmuq2v/tostring_method_gets_ignored/
package PodcastLibrarySystem;

public class Interview extends Podcast implements ILibrary, IPlay{
    //instance variables
    private String host, guest;

    //constructors
    public Interview(String title, int minutes, String host, String guest) {
        super(title, minutes);
        this.host = host;
        this.guest = guest;
    }

    public Interview() {
        super();
        this.host = "none";
        this.guest = "none";
    }

    //getters and setters
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
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
        System.out.println("Host: " + host);
        System.out.println("Guest: " + guest);
    }
}
