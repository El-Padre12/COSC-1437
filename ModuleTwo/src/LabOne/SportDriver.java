/*
Author: Angel Chavez
Assignment: Module 2 Lab 1
Date: 2/5/2024
Language: Java
Description: Sports team stats program that outputs name, number players, number of wins & losses
*/
//Resources used
//https://www.youtube.com/watch?v=xk4_1vDrzzo&t=744s&ab_channel=BroCode
package LabOne;

import java.util.Scanner;

public class SportDriver {
    public static void main(String[] args) {
        String teamName;
        int numPlayers;
        double numOfWins,
               numOfLosses;

        Scanner myScan = new Scanner(System.in);
        Sport football = new Sport();

        System.out.print("Input the name of your team: ");
        teamName = myScan.nextLine();
        System.out.print("Input the number of players on the team: ");
        numPlayers = myScan.nextInt();
        System.out.print("Input the number of wins for the season: ");
        numOfWins = myScan.nextDouble();
        System.out.print("Input the number losses for the season: ");
        numOfLosses = myScan.nextDouble();

        football.setName(teamName);
        football.setNumberOfPlayers(numPlayers);
        football.setSeasonWins(numOfWins);
        football.setSeasonLosses(numOfLosses);

        System.out.println(football.printTeamStats());
        System.out.println(football.getWinLossPercent());
    }
}
