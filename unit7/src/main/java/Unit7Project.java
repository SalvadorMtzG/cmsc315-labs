import java.util.Arrays;

/**
 * Unit7Project
 *
 * Price sorter tool that demonstrates bubble sort and selection sort.
 *
 * You will practice:
 * - Sorting arrays of product prices
 * - Comparing sorting algorithms
 * - Swapping array values
 * - Testing sorted output with JUnit
 */

public class Unit7Project {

    public void bubbleSort(int[] prices) {

        // TODO 1: Store the length of the prices array

        // TODO 2: Use nested loops to compare neighboring prices

        // TODO 3: Swap prices when the left value is greater than the right value

        // TODO 4: Stop early if no swaps occur during a full pass
    }

    public void selectionSort(int[] prices) {

        // TODO 5: Use selection sort to find the lowest remaining price
        // and move it into the correct position
    }

    public int findLowestPrice(int[] prices) {

        // TODO 6: Return the lowest price in the array
        // If the array is empty, return -1
        return 0;
    }

    public int findHighestPrice(int[] prices) {

        // TODO 7: Return the highest price in the array
        // If the array is empty, return -1
        return 0;
    }

    public static void main(String[] args) {

        Unit7Project app = new Unit7Project();

        int[] prices = {42, 19, 88, 7, 31};
        app.bubbleSort(prices);
        System.out.println("Bubble sorted prices: " + Arrays.toString(prices));

        int[] morePrices = {42, 19, 88, 7, 31};
        app.selectionSort(morePrices);
        System.out.println("Selection sorted prices: " + Arrays.toString(morePrices));
    }
}