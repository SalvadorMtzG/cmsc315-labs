
/**
 * Unit5Project
 *
 * This program demonstrates how searching algorithms can be used
 * in a student score lookup tool. The program allows a teacher or
 * administrator to search for a specific student score using either
 * linear search or binary search.
 *
 * Concepts Demonstrated:
 * - Linear Search
 * - Binary Search
 * - Arrays
 * - Algorithm Efficiency
 *
 * Author: Your Name

 */
public class Unit5Project {

    public int linearSearch(int[] scores, int targetScore) {

        //TODO 1: Loop through each score in the scores array

        //TODO 2: Check whether the current score matches targetScore

        //TODO 3: Return the index where the score is found

        //TODO 4: Return -1 if the target score is not found
        return 0;
    }

    public int binarySearch(int[] scores, int targetScore) {

        //TODO 5: Implement binary search for a sorted scores array
        return 0;
    }

    public void printConceptualAnalysis() {
        System.out.println("Conceptual Analysis:");
        System.out.println("- Linear search checks each student score one at a time.");
        System.out.println("- Binary search requires a sorted list of student scores.");
        System.out.println("- Binary search is more efficient for large sorted datasets.");
    }

    public static void main(String[] args) {

        // Create the application object
        Unit5Project app = new Unit5Project();

        // Create a sorted array of student scores
        int[] studentScores = {55, 67, 72, 81, 90, 95};

        // Target score to search for
        int targetScore = 81;

        // Run linear search
        int linearResult = app.linearSearch(studentScores, targetScore);

        // Display linear search results
        if (linearResult != -1) {
            System.out.println("Linear Search:");
            System.out.println("Score " + targetScore
                    + " found at index " + linearResult);
        } else {
            System.out.println("Linear Search:");
            System.out.println("Score not found.");
        }

        System.out.println();

        // Run binary search
        int binaryResult = app.binarySearch(studentScores, targetScore);

        // Display binary search results
        if (binaryResult != -1) {
            System.out.println("Binary Search:");
            System.out.println("Score " + targetScore
                    + " found at index " + binaryResult);
        } else {
            System.out.println("Binary Search:");
            System.out.println("Score not found.");
        }

        System.out.println();

        // Print conceptual analysis
        app.printConceptualAnalysis();
    }
}