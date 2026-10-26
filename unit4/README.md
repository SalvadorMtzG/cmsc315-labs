In this lab, you will create a budget category management system that models the following:

- Tree behavior for organizing household budget categories

- Parent-child relationships between budget categories

- Nested child nodes for subcategories such as rent under housing

- Recursive searching through hierarchical data

- Pre-order traversal for displaying the tree



Learning Goals

- Understand parent-child relationships in trees

- Practice creating and connecting tree nodes

- Implement recursive search logic

- Practice pre-order traversal

- Create and execute JUnit test methods

- Explain how trees are used in real-world software systems


Lab Setup

TODO: ALOFT directions

In IntelliJ, you can test your code by running the individual JUnit test classes. Once the tests pass, follow the submission instructions below for the lab assignment and reflection essay.



JUnit Tests

In an IDE, test your code by running the individual JUnit test methods:

- `findRoot`

- `treeContainsOnlyRootNode`

- `addChildNodeToTree`

- `findNestedChild`

- `returnFalseForMissingNode`

- `addMultipleChildrenAndValidateStructure`

- `printPreOrderWithoutException`

- `handlesNullAndRootOnlyEdgeCases` (student-created)


Requirements

Edit the `Unit4Project` class to implement the methods described below.



1. Verify the root node.

The tree should begin with a root node named `Budget`.

Check this by running:

- `findRoot`

- `treeContainsOnlyRootNode`



2. Complete `addChild`.

The method should:

- Create a new child node

- Add the child node to the parent node’s `children` list

- Support adding multiple children to the same parent

Check this by running:

- `addChildNodeToTree`

- `addMultipleChildrenAndValidateStructure`



3. Complete `contains`.

The method should:

- Recursively search the tree

- Return `true` when the target node exists

- Return `true` when the target is a nested child node

- Return `false` when the target node does not exist

Check this by running:

- `addChildNodeToTree`

- `findNestedChild`

- `returnFalseForMissingNode`

- `addMultipleChildrenAndValidateStructure`



4. Complete `printPreOrder`.

The method should:

- Visit and print the current node first

- Recursively visit and print each child node

- Run without throwing an exception

Check this by running:

- `printPreOrderWithoutException`


5. Comment all code.

Use comments to explain:

- How nodes are created

- How child nodes are added

- How recursion searches through the tree

- How pre-order traversal visits each node

6. Add an additional JUnit test method named handlesNullAndRootOnlyEdgeCases

The test should verify the following edge cases:

Search from a 'null' node returns 'false'
Searching a tree that only contains the root node successfully finds "Budget"
Searching a root-only tree for a missing node returns 'false'
The test should do the following:

Create a new Unit4Project object.

Use assertions to validate each edge case.

Print a confirmation message if the test passes.

This test is intended to reinforce recursive base cases and validate tree behavior under minimal or invalid conditions.



Reflection Essay Instructions

Address the following:

- Reflect on which method was easier or harder to implement and why.

- Include a visual or textual representation of your tree structure.

- Show expected pre-order traversal output.

- Include a copy of your handlesNullAndRootOnlyEdgeCases method code.

-- Include a screenshot showing the successful execution of the JUnit test handlesNullAndRootOnlyEdgeCases

1. Submit your reflection essay to the LEO/D2L Unit 4 Lab.

2. Submit Unit4Project.java to the zyBooksUnit 4 Lab.

Real-World Applications

Tree data structures are commonly used in software systems that organize hierarchical information, including:

- Household budget categories

- File and folder systems

- Website navigation menus

- Organizational charts

- Family trees

- Product category systems

- Decision trees

- XML and HTML document structures