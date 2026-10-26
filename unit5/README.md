Unit 5 Lab: Score Lookup Tool

In this lab, you will create a student score lookup tool that models the following:


- Linear search behavior for checking scores one at a time
- Binary search behavior for efficiently searching sorted score lists
- Array-based storage for student score data
- Search result handling for found and not found values

Learning Goals
- Practice implementing linear search
- Practice implementing binary search
- Understand differences in search efficiency
- Work with arrays and indexed data
- Create and execute JUnit test methods
- Explain how searching algorithms are used in real-world software systems

Lab Setup

TODO: ALOFT directions

In IntelliJ, you can test your code by running the individual JUnit test classes. Once the tests pass, follow the submission instructions below for the lab assignment and reflection essay.

JUnit Tests

In an IDE, test your code by running the individual JUnit test methods:

- `linearSearchFindsExistingScore`

- `linearSearchReturnsNegativeOneWhenScoreNotFound`

- `binarySearchFindsExistingScore`

- `binarySearchReturnsNegativeOneWhenScoreNotFound`

- `binarySearchFindsMiddleScoreInSortedArray`

- `binarySearchHandlesEmptyArray` (student-created)

Requirements

Edit the `Unit5Project`class to implement the methods described below.

1. Complete `linearSearch`.
   Check the method by running the test in:

- `linearSearchFindsExistingScore`

2. Ensure `linearSearch` returns `-1` when the score is not found.
   Check the method by running the test in:

- `linearSearchReturnsNegativeOneWhenScoreNotFound`

3. Complete `binarySearch`.
   Check the method by running the test in:

- `binarySearchFindsExistingScore`

4. Ensure `binarySearch` returns `-1` when the score is not found.
   Check the method by running the test in:

- `binarySearchReturnsNegativeOneWhenScoreNotFound`

5. Ensure `binarySearch` correctly finds the middle score in the array.
   Check the method by running the test in:

- `binarySearchFindsMiddleScoreInSortedArray`



6. Additional JUnit Test

Create one additional JUnit test method named:

binarySearchHandlesEmptyArray()

The test should verify that `binarySearch` correctly handles an empty array.

Your test should:

- Create a new `Unit5Project` object

- Create an empty integer array

- Attempt to search for any score value

- Use `assertEquals` to verify that the method returns `-1`



Example scenario:

Create an empty scores array.

Search for the score 81.

The method should return -1 because the array contains no data.


This test is intended to reinforce understanding of edge cases and validate that binary search handles empty datasets safely.

7. Comment all code.


Reflection Essay Instructions 

- Explain the difference between linear search and binary search.

- Describe why binary search is more efficient for large sorted datasets.

- Reflect on which search method was easier or harder to implement and why.

- Include a copy of JUnit test method, binarySearchHandlesEmptyArray().

- Include a screenshot showing successful execution of the unit test method.


1. Submit your reflection essay to the LEO/D2L Unit 5 Lab.

2. Submit Unit5Project.java to the zyBooksUnit 5 Lab.


Real-World Applications

Searching algorithms are commonly used in software systems that require efficient data retrieval, including:

- Student information systems

- Online shopping search tools

- Banking and financial systems

- Contact lookup applications

- Database indexing systems

- Search engines

- Inventory and warehouse management systems