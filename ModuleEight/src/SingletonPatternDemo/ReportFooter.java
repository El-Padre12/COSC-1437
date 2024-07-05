/*
Author: Angel Chavez
Assignment: Module 8 Lab 1
Date: 5/8/2024
Language: Java
Description: singleton class to ensure there is always a single, consistent footer across all apps
*/
package SingletonPatternDemo;

public class ReportFooter {

    private static volatile ReportFooter instance;

    private String footer;

    private ReportFooter() {
        this.footer = "\n\nABC Programing\n222 West Alamo st\nEnd of Report";
    }

    public static ReportFooter getInstance() {
        if (instance == null) {
            synchronized (ReportFooter.class) {
                if (instance == null) {
                    instance = new ReportFooter();
                }
            }
        }
        // Return the instance
        return instance;
    }

    public String getFooter() {
        return this.footer;
    }

    public void printFooter() {
        System.out.println(this.footer);
    }
}
