/*
Author: Angel Chavez
Assignment: Final Exam
Date: 5/10/2024
Language: Java
Description: Composite for Podcast Library System uses showDetails method from interface to iterate through arraylist of Podcasts
*/
//resources https://www.reddit.com/r/javahelp/comments/xmuq2v/tostring_method_gets_ignored/
package PodcastLibrarySystem;

import java.util.ArrayList;

//composite
public class PodcastComposite extends Podcast implements ILibrary, IPlay{
    private ArrayList<Podcast> podcastList = new ArrayList<>();

    public PodcastComposite() {
        super();
    }

    @Override
    public void stop() {
        System.out.println("Stopping all podcasts");
    }

    @Override
    public void start() {
        System.out.println("Playing all podcasts");
    }

    public void showDetails() {
        for (Podcast pod : podcastList) {
            pod.showDetails();
            System.out.println();
        }
    }
    public void addPodcast(Podcast pod) {
        podcastList.add(pod);
    }
    public void removePodcast(Podcast pod) {
        podcastList.remove(pod);
    }
}
