/*
Author: Angel Chavez
Assignment: Module 3 CLO Assignment
Date: 2/23/2024
Language: Java
Description: class for Character objects
*/
package CLO;

public class Character {
    //instance variables
    private String characterName, characterType;
    private int hitPoints;

    // constructors
    public Character(String characterName, String characterType, int hitPoints) {
        this.characterName = characterName;
        this.characterType = characterType;
        this.hitPoints = hitPoints;
    }

    public Character() {
        this.characterName = "none";
        this.characterType = "none";
        this.hitPoints = 0;
    }

    public Character(Character pCharacter) {
        this.characterName = pCharacter.characterName;
        this.characterType = pCharacter.characterType;
        this.hitPoints = pCharacter.hitPoints;
    }

    //getters and setters
    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    //functions
    @Override
    public String toString() {
        return "\tCharacter name: " + characterName + "\n" +
               "\tCharacter type: " + characterType + "\n" +
               "\tHit points: " + hitPoints;
    }
}
