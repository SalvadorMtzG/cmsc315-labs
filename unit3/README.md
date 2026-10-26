Unit 3 Lab: Song Playlist Manager

In this lab, you will create a playlist manager that models the following:

- List behavior for storing songs
- Indexed access for retrieving and inserting songs
- Dynamic list operations such as adding and removing playlist items


Learning Goals

- Practice working with Java `ArrayList`
- Implement indexed list operations
- Understand dynamic data storage and retrieval
- Create and execute JUnit test methods
- Explain how lists are used in real-world software systems

Lab Setup

TODO: ALOFT directions

In IntelliJ, you can test your code by running the individual JUnit test classes. Once the tests pass, follow the submission instructions below for the lab assignment and reflection essay.

JUnit Tests
In an IDE, test your code by running the individual JUnit test methods:

- `addSongTest`

- `insertSongTest`

- `removeSongTest`

- `getSpecificSongTest`

- `displaySongsTest` (student-created)

Requirements

Edit the `Unit3Project` class to implement the methods described below.

1. Complete `addSong`.  
   Check the method by running the test in `addSongTest`.

2. Complete `insertSong`.  
   Check the method by running the test in `insertSongTest`.

3. Complete `removeSong`.  
   Check the method by running the test in `removeSongTest`.

4. Complete `getSpecificSong`.  
   Check the method by running the test in `getSpecificSongTest`.

5. Complete `displaySongs`.  
   The method should:
- Display `"Current playlist:"`
- Traverse the playlist using a loop
- Print the index and song title for each song in the playlist

6. Add another test method named `displaySongsTest`. The test should:
- Add 3 songs to the playlist
- Call `displaySongs`
- Use assertions to verify the printed output
- Use an assertion to verify the size of the playlist

7. Comment all code.


Reflection Essay Instructions 

Explain how lists differ from stacks and queues.
Describe why an ArrayList was appropriate for this project.
Reflect on which method was easier or harder to implement and why.
Describe how you implemented displaySongsTest.
Explain how the test captures console output for assertions.
Include a copy of your displaySongsTest method code.
Include a screenshot showing the successful execution of the displaySongsTest method.

1. Submit your reflection essay to the LEO/D2L Unit 3 Lab.

2. Submit Unit3Project.java to the zyBooksUnit 3 Lab.

Real-World Applications

Lists are commonly used in software systems that require dynamic collections of data, including:

Music and video playlists

Shopping carts

Task management systems

Contact lists

Inventory systems

Search history and recommendation systems