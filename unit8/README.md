Unit 8 Lab: Campus Navigation System

Create a campus navigation tool that models the following:

- Graph behavior for representing campus buildings

- Paths between buildings using adjacency lists

- Undirected connections between locations

- Breadth-first search for checking whether a route exists

Learning Goals

- Practice working with Java `HashMap`, `ArrayList`, `HashSet`, and `Queue`

- Represent graph data using an adjacency list

- Understand how buildings can be modeled as vertices

- Understand how walking paths can be modeled as edges

- Implement breadth-first search

- Create and execute JUnit test methods

- Explain how graphs are used in real-world navigation systems



Lab Setup

TODO: ALOFT directions

In IntelliJ, you can test your code by running the individual JUnit test classes. Once the tests pass, follow the submission instructions below for the lab assignment and reflection essay.



JUnit Tests

In an IDE, test your code by running the individual JUnit test methods:

- `addBuildingIncreasesGraphSize`

- `addDuplicateBuildingDoesNotIncreaseSize`

- `addPathCreatesNeighborsInBothDirections`

- `hasPathReturnsTrueForConnectedBuildings`

- `hasPathReturnsFalseForUnknownBuilding`
- 
- `hasPathReturnsTrueWhenStartEqualsGoal` (student-created)


Requirements

Edit the `Unit8Project` class to implement the methods described below.

1. Complete `addBuilding`.

The method should:

- Add a building to the graph

- Avoid adding duplicate buildings

- Store each building with an empty neighbor list

Check the method by running:

- `addBuildingIncreasesGraphSize`

- `addDuplicateBuildingDoesNotIncreaseSize`

2. Complete `addPath`.

The method should:

- Ensure both buildings exist in the graph

- Add a path from the first building to the second building

- Add a path from the second building back to the first building

Because this is an undirected graph, paths must work in both directions.

Check the method by running:

- `addPathCreatesNeighborsInBothDirections`

3. Complete `getNeighbors`.

The method should:

- Return the list of neighboring buildings for a given building

- Return an empty list if the building does not exist

This method is used by several tests to verify graph structure.

4. Complete `hasPath`.

The method should:

- Use breadth-first search to determine whether a route exists

- Return `true` if the start building can reach the goal building

- Return `false` if no route exists

- Return `false` if either building does not exist

Check the method by running:

- `hasPathReturnsTrueForConnectedBuildings`

- `hasPathReturnsFalseForUnknownBuilding`

5. Complete `size`.

The method should:

- Return the number of buildings currently stored in the graph

This method is validated by the building tests.

6. Comment all code.

Use comments to explain:

- How buildings are stored in the graph

- How paths connect buildings

- Why paths are added in both directions

- How breadth-first search visits buildings

- How the queue and visited set work together

Additional JUnit Test

Create one additional JUnit test method named:

hasPathReturnsTrueWhenStartEqualsGoal()

The test should verify that a building has a path to itself.

Your test should:

- Create a new `Unit8Project` object

- Add one building named `"Library"`

- Call `hasPath("Library", "Library")`

- Use `assertTrue` to verify that the method returns `true`

Example scenario:

Add Library to the graph.

Search for a path from Library to Library.

The method should return true because the start and goal are the same building.

This test reinforces an important graph edge case: a valid node is reachable from itself.

Reflection Essay Instructions

Address the following:

- Explain how graphs represent relationships between locations.

- Describe how buildings and paths were represented in this project.

- Explain why an adjacency list was appropriate for this campus navigation tool.

- Describe how breadth-first search checks for a path.

- Explain the purpose of the queue and visited set in BFS.

- Reflect on which method was easier or harder to implement and why.

- Include a copy of your JUnit test method, hasPathReturnsTrueWhenStartEqualsGoal().

- Include a screenshot showing successful execution of the JUnit test.
- 
1. Submit your reflection essay to the LEO/D2L Unit 8 Lab.

2. Submit Unit8Project.java to the zyBooksUnit 8 Lab.

Real-World Applications

Graphs are commonly used in software systems that represent connected data, including:

- Campus navigation systems

- GPS route planning

- Social networks

- Website link structures

- Computer networks

- Airline route maps

- Recommendation systems

- Game maps and pathfinding