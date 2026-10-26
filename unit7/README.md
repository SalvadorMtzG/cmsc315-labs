Unit 7 Lab: Price Sorter

Create a price sorter tool that models the following:

- Bubble sort behavior for ordering prices

- Selection sort behavior for ordering prices

- Array-based storage for product price data

- Lowest and highest price lookup after working with price arrays



Learning Goals

- Practice implementing bubble sort

- Practice implementing selection sort

- Understand how sorting algorithms organize data

- Work with arrays and indexed values

- Create and execute JUnit test methods

- Explain how sorting algorithms are used in real-world software systems



Lab Setup

TODO: ALOFT directions

In IntelliJ, you can test your code by running the individual JUnit test classes. Once the tests pass, follow the submission instructions below for the lab assignment and reflection essay.



JUnit Tests

In an IDE, test your code by running the individual JUnit test methods:

- `bubbleSortSortsPricesAscending`

- `selectionSortSortsPricesAscending`

- `bubbleSortHandlesAlreadySortedArray`

- `findLowestPriceReturnsSmallestValue`

- `findHighestPriceReturnsLargestValue`

- `selectionSortHandlesEmptyArray` (student-created)



Requirements

Edit the `Unit7Project` class to implement the methods described below.

1. Complete `bubbleSort`.

The method should:

- Compare neighboring prices

- Swap prices when they are out of order

- Continue until the array is sorted in ascending order

- Stop early if the array is already sorted



Check the method by running:

- `bubbleSortSortsPricesAscending`

- `bubbleSortHandlesAlreadySortedArray`



2. Complete `selectionSort`.

The method should:

- Find the lowest remaining price

- Move it into the correct position

- Continue until the array is sorted in ascending order

Check the method by running:

- `selectionSortSortsPricesAscending`



3. Complete `findLowestPrice`.

The method should:

- Return the smallest value in the prices array

- Return `-1` if the array is empty

Check the method by running:

- `findLowestPriceReturnsSmallestValue`

4. Complete `findHighestPrice`.

The method should:

- Return the largest value in the prices array

- Return `-1` if the array is empty

Check the method by running:

- `findHighestPriceReturnsLargestValue`



5. Comment all code.

Use comments to explain:

- How values are compared

- How swaps are performed

- How bubble sort works

- How selection sort works

- How lowest and highest prices are identified



6. Additional JUnit Test

Create one additional JUnit test method named:

selectionSortHandlesEmptyArray()

The test should verify that `selectionSort` safely handles an empty price array.

Your test should:

- Create a new `Unit7Project` object

- Create an empty integer array

- Call `selectionSort`

- Use `assertArrayEquals` to verify that the array is still empty

- Use `assertDoesNotThrow` to verify that no exception occurs



Example scenario:

Create an empty prices array.

Call selectionSort.

The method should not crash.

The array should remain empty.



Reflection Essay Instructions

Address the following:

- Explain the difference between bubble sort and selection sort.

- Explain how values are compared and swapped during sorting.

- Reflect on which sorting method was easier or harder to implement and why.

- Describe how your JUnit tests verified correct sorting behavior.

- Include a copy of your JUnit test method, selectionSortHandlesEmptyArray().

- Include a screenshot showing successful execution of the JUnit test.

1. Submit your reflection essay to the LEO/D2L Unit 7 Lab.

2. Submit Unit7Project.java to the zyBooksUnit 7 Lab.

Real-World Applications

Sorting algorithms are commonly used in software systems that organize data, including:

- Online store price sorting

- Product catalogs

- Search result ranking

- Inventory management systems

- Gradebooks

- Financial applications

- Leaderboards

- Scheduling systems