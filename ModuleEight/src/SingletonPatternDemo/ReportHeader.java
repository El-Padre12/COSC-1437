/*
Author: Angel Chavez
Assignment: Module 8 Lab 1
Date: 5/8/2024
Language: Java
Description: singleton class to ensure there is always a single, consistent header across all apps
*/
package SingletonPatternDemo;

// Class to handle the singleton instance of ReportHeader
public class ReportHeader {
    // Static variable to hold the single instance, marked as volatile to ensure visibility
    // of changes across threads.
    private static volatile ReportHeader instance;

    // Private variable to hold the header text
    private String header;

    // Private constructor to prevent instantiation from outside the class
    private ReportHeader() {
        // Initializes the header string with specific details
        this.header = "ABC Programming Company\nSan Antonio Office\n210-837-1234\n\n";
    }

    // Public method to get the singleton instance
    public static ReportHeader getInstance() {
        // First check to see if an instance already exists without locking
        if (instance == null) {
            // Synchronize on the class object to ensure only one thread can enter
            // this block at a time.
            synchronized (ReportHeader.class) {
                // Double check to make sure the instance was not created in another thread
                // while the current thread was waiting on the class' lock.
                if (instance == null) {
                    // If the instance is still null, create a new one
                    instance = new ReportHeader();
                }
            }
        }
        // Return the instance
        return instance;
    }

    // Getter method for the header string
    public String getHeader() {
        return this.header;
    }
    // Method to print the header to the console
    public void printHeader() {
        System.out.println(this.header);
    }
}

