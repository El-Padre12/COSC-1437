/*
Author: Angel Chavez
Assignment: Module 3 CLO Assignment
Date: 2/23/2024
Language: Java
Description: class for VideoGame objects
*/
package CLO;

public class VideoGame {
    //instance variables
    private String gameName, genre;
    private Character mainCharacter;

    public VideoGame(String gameName, String genre, Character mainCharacter) {
        this.gameName = gameName;
        this.genre = genre;
        this.mainCharacter = new Character(mainCharacter);
    }

    public VideoGame() {
        this.gameName = "none";
        this.genre = "none";
        this.mainCharacter = new Character();
    }

    public VideoGame(VideoGame pVideoGame) {
        this.gameName = pVideoGame.gameName;
        this.genre = pVideoGame.genre;
        this.mainCharacter = new Character(pVideoGame.mainCharacter);
    }

    //getters and setters
    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Character getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(Character mainCharacter) {
        this.mainCharacter = new Character(mainCharacter);
    }

    //functions
    @Override
    public String toString() {
        return "\n\tGame name: " + gameName + "\n" +
               "\tGenre: " + genre + "\n" +
               "Main Character\n" + mainCharacter;
    }
}
