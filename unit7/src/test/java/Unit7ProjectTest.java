import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Unit7ProjectTest {

    @Test
    void bubbleSortHandlesAlreadySortedArray() {

        Unit7Project app = new Unit7Project();

        int[] prices = {5, 3, 1};

        app.bubbleSort(prices);

        assertArrayEquals(
                new int[]{1, 3, 5},
                prices,
                "bubbleSort should sort the prices from lowest to highest."
        );

        System.out.println(
                "PASS: bubbleSort correctly sorted the price array from lowest to highest."
        );
    }

    @Test
    void bubbleSortSortsPricesAscending() {

        Unit7Project app = new Unit7Project();

        int[] prices = {42, 19, 88, 7, 31};

        app.bubbleSort(prices);

        assertArrayEquals(
                new int[]{7, 19, 31, 42, 88},
                prices,
                "bubbleSort should arrange prices in ascending order."
        );

        System.out.println(
                "PASS: bubbleSort sorted the unsorted price array in ascending order."
        );
    }

    @Test
    void findHighestPriceReturnsLargestValue() {

        Unit7Project app = new Unit7Project();

        int[] prices = {42, 19, 88, 7, 31};

        assertEquals(
                88,
                app.findHighestPrice(prices),
                "findHighestPrice should return the largest value in the array."
        );

        System.out.println(
                "PASS: findHighestPrice correctly returned 88 as the highest price."
        );
    }

    @Test
    void findLowestPriceReturnsSmallestValue() {

        Unit7Project app = new Unit7Project();

        int[] prices = {42, 19, 88, 7, 31};

        assertEquals(
                7,
                app.findLowestPrice(prices),
                "findLowestPrice should return the smallest value in the array."
        );

        System.out.println(
                "PASS: findLowestPrice correctly returned 7 as the lowest price."
        );
    }

    @Test
    void selectionSortSortsPricesAscending() {

        Unit7Project app = new Unit7Project();

        int[] prices = {42, 19, 88, 7, 31};

        app.selectionSort(prices);

        assertArrayEquals(
                new int[]{7, 19, 31, 42, 88},
                prices,
                "selectionSort should arrange prices in ascending order."
        );

        System.out.println(
                "PASS: selectionSort sorted the price array in ascending order."
        );
    }
}