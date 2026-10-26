
import java.util.ArrayList;
import java.util.List;

/**
 * A simple song playlist manager system that demonstrates the use of
 * the List data structure in Java.
 *
 * Songs are stored in an ArrayList and can be added, inserted,
 * removed, retrieved, and displayed using common list operations.
 * The playlist maintains the order of songs and allows access
 * by index position.
 *
 * This project demonstrates core list behaviors including:
 * adding elements to the end of a list, inserting elements at
 * specific positions, removing elements, traversing a list with
 * loops, and retrieving elements by index.
 *
 * @author FIRST LAST
 * @version 1.0
 */
public class Unit3Project {

    private List<String> playlist = new ArrayList<>();

    public void addSong(String title) {
        // TODO: Add the provided song to the end of the playlist.
    }

    public void insertSong(int index, String title) {
        // TODO: Insert the song at a specific position if the index is valid.
    }

    public String removeSong(int index) {
        // TODO: Remove and return the song at the specified index.
        return null;
    }

    public String getSpecificSong(int index) {
        // TODO: Return the song stored at the specified index.
        return null;
    }

    public int size() {
        return playlist.size();
    }

    public void displaySongs() {
        // TODO:
        // Display "Current playlist:"
        // Traverse the playlist using a loop
        // Print each index and song title
    }


    public static void main(String[] args) {
        Unit3Project app = new Unit3Project();

        app.addSong("Song A");
        app.addSong("Song B");
        app.insertSong(1, "Song X");

        System.out.println("Playlist size: " + app.size());
        System.out.println("Song at index 1: " + app.getSpecificSong(1));
        System.out.println("Removed song: " + app.removeSong(0));
    }


}

