/*
Author: Angel Chavez
Assignment: Module 3 CLO Assignment
Date: 2/23/2024
Language: Java
Description: Game info program that outputs info about a game character to user.
*/
package CLO;

import java.util.Scanner;

public class CharacterDriver {
    public static void main(String[] args) {
        //variables
        String charName, charType, gameName, gameGenre, studio, studioLocation;
        int charHitPoints;

        Scanner myScan = new Scanner(System.in);

        Character myCharacter;
        VideoGame myGame;
        GameStudio myStudio;

        System.out.println("\n**Game Studio Info Generator**\n");

        System.out.print("Input Character Name: ");
        charName = myScan.nextLine();
        System.out.print("Input Character Type: ");
        charType = myScan.nextLine();
        System.out.print("Input Character Hit Points: ");
        charHitPoints = myScan.nextInt();

        myScan.nextLine();

        System.out.print("Input Game Name: ");
        gameName = myScan.nextLine();
        System.out.print("Input Game Genre: ");
        gameGenre = myScan.nextLine();
        System.out.print("Input Game Studio Name: ");
        studio = myScan.nextLine();
        System.out.print("Input Studio Location: ");
        studioLocation = myScan.nextLine();

        myCharacter = new Character(charName, charType, charHitPoints);
        myGame = new VideoGame(gameName, gameGenre, myCharacter);
        myStudio = new GameStudio(studio, studioLocation, myGame);

        System.out.print(myStudio);
    }
}
