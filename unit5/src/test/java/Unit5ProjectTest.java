import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class Unit5ProjectTest {
    @Test
    void binarySearchFindsExistingScore() {

        Unit5Project app = new Unit5Project();

        int[] scores = {55, 67, 72, 81, 90, 95};

        int result = app.binarySearch(scores, 90);

        assertEquals(4, result,
                "binarySearch should return index 4 when searching for score 90.");

        System.out.println(
                "PASS: Binary search located score 90 at index 4. " +
                        "This test fails in the starter code because binarySearch() has not yet been implemented."
        );
    }
    @Test
    void binarySearchFindsMiddleScoreInSortedArray() {

        Unit5Project app = new Unit5Project();

        int[] scores = {55, 67, 72, 81, 90, 95};

        int result = app.binarySearch(scores, 81);

        assertEquals(3, result,
                "binarySearch should return index 3 when searching for score 81.");

        System.out.println(
                "PASS: Binary search correctly found the middle score (81) at index 3. " +
                        "This verifies that the algorithm can locate values near the center of a sorted array."
        );
    }
    @Test
    void binarySearchReturnsNegativeOneWhenScoreNotFound() {

        Unit5Project app = new Unit5Project();

        int[] scores = {55, 67, 72, 81, 90, 95};

        int result = app.binarySearch(scores, 70);

        assertEquals(-1, result,
                "binarySearch should return -1 when the score is not present.");

        System.out.println(
                "PASS: Binary search correctly returned -1 for score 70 because the score does not exist in the array."
        );
    }
    @Test
    void linearSearchFindsExistingScore() {

        Unit5Project app = new Unit5Project();

        int[] scores = {55, 67, 72, 81, 90, 95};

        int result = app.linearSearch(scores, 81);

        assertEquals(3, result,
                "linearSearch should return index 3 when searching for score 81.");

        System.out.println(
                "PASS: Linear search successfully found score 81 at index 3 by examining the array sequentially."
        );
    }
    @Test
    void linearSearchReturnsNegativeOneWhenScoreNotFound() {

        Unit5Project app = new Unit5Project();

        int[] scores = {55, 67, 72, 81, 90, 95};

        int result = app.linearSearch(scores, 100);

        assertEquals(-1, result,
                "linearSearch should return -1 when the score is not found.");

        System.out.println(
                "PASS: Linear search correctly returned -1 because score 100 is not present in the array."
        );
    }

}