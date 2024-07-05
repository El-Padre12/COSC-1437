/*
Author: Angel Chavez
Assignment: Module 3 CLO Assignment
Date: 2/23/2024
Language: Java
Description: class for GameStudio objects
*/
package CLO;

public class GameStudio {
    //instance variables
    private String studioName, location;
    private VideoGame publishedGame;

    public GameStudio(String studioName, String location, VideoGame publishedGame) {
        this.studioName = studioName;
        this.location = location;
        this.publishedGame = new VideoGame(publishedGame);
    }

    public GameStudio() {
        this.studioName = "none";
        this.location = "none";
        this.publishedGame = new VideoGame();
    }

    //getters and setters
    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public VideoGame getPublishedGame() {
        return publishedGame;
    }

    public void setPublishedGame(VideoGame publishedGame) {
        this.publishedGame = new VideoGame(publishedGame);
    }

    //functions
    @Override
    public String toString() {
        return "\nGame Studio" + "\n" +
                "\tName: " + studioName + "\n" +
                "\tLocation: " + location + "\n" +
                "Published Game " + publishedGame;
    }
}
