/*
Author: Angel Chavez
Assignment: Final Exam
Date: 5/10/2024
Language: Java
Description: Final exam/ Podcast Library System
*/
//resources https://www.reddit.com/r/javahelp/comments/xmuq2v/tostring_method_gets_ignored/
package PodcastLibrarySystem;

public class Driver {
    public static void main(String[] args) {
        Podcast episode1 = new Educational("Java Objects", 45, "Java Programming", "Overview of OOP in Java");
        Podcast episode2 = new Interview("Interview with the Mayor", 20, "Joe Rogan", "Ron Nirenberg");
        Podcast episode3 = new Story("Lord of the Rings", 120, "Robin Williams", "J.R.Tolkien");

        PodcastComposite joeRoganPodcast = new PodcastComposite();

        System.out.println("------------------------------------");
        System.out.println("Adding Podcast to my Playlists");
        System.out.println("------------------------------------");

        joeRoganPodcast.addPodcast(episode1);
        System.out.println("Java Objects added to playlist");
        joeRoganPodcast.addPodcast(episode2);
        System.out.println("Mayor Interview added to playlist");
        joeRoganPodcast.addPodcast(episode3);
        System.out.println("LOTR added to playlist\n");

        System.out.println("------------------------------------");
        System.out.println("Showing my entire Playlist");
        System.out.println("------------------------------------");

        joeRoganPodcast.showDetails();

        System.out.println("------------------------------------");
        System.out.println("Playing my Podcasts from my Playlist");
        System.out.println("------------------------------------");

        episode1.start();
        episode1.stop();




    }
}
