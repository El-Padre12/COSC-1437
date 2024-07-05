/*
Author: Angel Chavez
Assignment: Final Exam
Date: 5/10/2024
Language: Java
Description: subclass Educational Podcast uses showDetails from both super class and interface
*/
//resources https://www.reddit.com/r/javahelp/comments/xmuq2v/tostring_method_gets_ignored/
package PodcastLibrarySystem;

public class Educational extends Podcast implements ILibrary, IPlay{
    //instance variables
    private String subject, description;

    //constructors
    public Educational(String title, int minutes, String subject, String description) {
        super(title, minutes);
        this.subject = subject;
        this.description = description;
    }

    public Educational() {
        super();
        this.subject = "none";
        this.description = "none";
    }

    //getters and setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        System.out.println("Subject: " + subject);
        System.out.println("Description: " + description);
    }
}
