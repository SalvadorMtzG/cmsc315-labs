import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class Unit3ProjectTest {
    @Test
    void addSongTest() {
        Unit3Project app = new Unit3Project();

        app.addSong("Song A");

        assertEquals(1, app.size(),
                "addSong should increase the playlist size to 1.");

        assertEquals("Song A", app.getSpecificSong(0),
                "The first song in the playlist should be 'Song A'.");

        System.out.println(
                "PASS: addSong added 'Song A' to the playlist. " +
                        "This test fails in the starter code because addSong() has not been implemented yet."
        );
    }
    @Test
    void displaySongsTest() {
        Unit3Project app = new Unit3Project();

        app.addSong("Song A");
        app.addSong("Song B");
        app.addSong("Song C");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        app.displaySongs();

        System.setOut(originalOut);

        String result = output.toString();

        assertTrue(result.contains("Current playlist:"),
                "displaySongs should print the heading 'Current playlist:'.");

        assertTrue(result.contains("0: Song A"),
                "displaySongs should print Song A at index 0.");

        assertTrue(result.contains("1: Song B"),
                "displaySongs should print Song B at index 1.");

        assertTrue(result.contains("2: Song C"),
                "displaySongs should print Song C at index 2.");

        assertEquals(3, app.size(),
                "displaySongs should not change the number of songs in the playlist.");

        System.out.println(
                "PASS: displaySongs printed the playlist heading and each song with its correct index."
        );
    }

    @Test
    void getSpecificSongTest() {
        Unit3Project app = new Unit3Project();

        app.addSong("Song A");
        app.addSong("Song B");
        app.addSong("Song C");

        assertEquals("Song B", app.getSpecificSong(1),
                "getSpecificSong should return the song stored at index 1.");

        assertEquals(3, app.size(),
                "getSpecificSong should not remove or change any songs.");

        System.out.println(
                "PASS: getSpecificSong returned 'Song B' from index 1 without changing the playlist."
        );
    }
    @Test
    void insertSongTest() {
        Unit3Project app = new Unit3Project();

        app.addSong("Song A");
        app.addSong("Song B");
        app.insertSong(1, "Song X");

        assertEquals(3, app.size(),
                "insertSong should increase the playlist size to 3.");

        assertEquals("Song X", app.getSpecificSong(1),
                "insertSong should place 'Song X' at index 1.");

        System.out.println(
                "PASS: insertSong placed 'Song X' at index 1 and shifted the other songs correctly."
        );
    }
    @Test
    void removeSongTest() {
        Unit3Project app = new Unit3Project();

        app.addSong("Song A");
        app.addSong("Song B");

        String removed = app.removeSong(0);

        assertEquals("Song A", removed,
                "removeSong should return the song that was removed.");

        assertEquals(1, app.size(),
                "removeSong should decrease the playlist size by 1.");

        assertEquals("Song B", app.getSpecificSong(0),
                "After removing Song A, Song B should move to index 0.");

        System.out.println(
                "PASS: removeSong removed 'Song A', returned it, and shifted 'Song B' to index 0."
        );
    }


}
