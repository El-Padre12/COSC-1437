/*
Author: Angel Chavez
Assignment: Module 2 Lab 1
Date: 2/5/2024
Language: Java
Description: Class for Sport object with name, number of players, wins, and losses attributes.
*/
//Resources used
//https://www.youtube.com/watch?v=xk4_1vDrzzo&t=744s&ab_channel=BroCode
package LabOne;

public class Sport {
    private String name;
    private int NumberOfPlayers;
    private double SeasonWins, SeasonLosses;

    //two constructors, one default and one parameterized.
    public Sport(String name, int players, double wins, double losses) {
        this.name = name;
        this.NumberOfPlayers = players;
        this.SeasonWins = wins;
        this.SeasonLosses = losses;
    }

    public Sport() {this ("Empty", -1, -1, -1);}

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return NumberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.NumberOfPlayers = numberOfPlayers;
    }

    public double getSeasonWins() {
        return SeasonWins;
    }

    public void setSeasonWins(double seasonWins) {
        this.SeasonWins = seasonWins;
    }

    public double getSeasonLosses() {
        return SeasonLosses;
    }

    public void setSeasonLosses(double seasonLosses) {
        this.SeasonLosses = seasonLosses;
    }

    //print team stats method
    public String printTeamStats() {
        String myMessage = "";
        myMessage += "\nThe name of the team: " + name;
        myMessage += "\nThe number of players on the team: " + NumberOfPlayers;
        myMessage += "\nThe number of wins the team has: " + (int)SeasonWins;
        myMessage += "\nThe number of losses the team has: " + (int)SeasonLosses;
        return myMessage;
    }

    // win/loss percentage method
    public double getWinLossPercent() {
        System.out.print("The win/loss percentage: ");
        return SeasonWins / (SeasonLosses + SeasonWins) * 100;
    }
}
