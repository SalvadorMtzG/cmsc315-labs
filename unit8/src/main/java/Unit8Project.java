/**
 * ============================================================
 * UNIT 8 PROJECT: CAMPUS NAVIGATION SYSTEM
 * ============================================================
 *
 * This project introduces graph data structures by modeling a
 * campus navigation system. Buildings are represented as vertices
 * (nodes) and walking paths between buildings are represented as
 * edges (connections). Students will create an undirected graph
 * using adjacency lists and explore how graph traversal can be
 * used to determine whether routes exist between locations.
 *
 * Learning Objectives:
 * - Understand how graphs model real-world navigation systems
 * - Represent graph data using a HashMap and adjacency lists
 * - Add and manage vertices (buildings) in a graph
 * - Create undirected connections between locations
 * - Implement Breadth-First Search (BFS) for pathfinding
 * - Use HashSet and Queue collections during graph traversal
 * - Practice problem solving with graph algorithms
 * - Create and run JUnit tests to validate graph behavior
 *
 * Real-World Applications:
 * - GPS and route planning systems
 * - Campus and building navigation tools
 * - Social network analysis
 * - Computer and communication networks
 * - Transportation and logistics systems
 *
 * Author: ______________________
 * Date: ________________________
 * ============================================================
 */

import java.util.*;

public class Unit8Project {

    public String getUnitName() {
        return "Unit 8 Project";
    }

    // Graph stores each building as a key and its neighbors as a list of connected buildings.
    private Map<String, List<String>> graph = new HashMap<>();

    public void addBuilding(String building) {
        // TODO (Student): Add the building to the graph.

        // TODO (Student): Make sure duplicate buildings are not added.

        // TODO (Student): Store the building with an empty neighbor list.

    }

    public void addPath(String from, String to) {
        // TODO (Student): Ensure the starting building exists in the graph.

        // TODO (Student): Ensure the destination building exists in the graph.

        // TODO (Student): Add a path from the starting building to the destination building.

        // TODO (Student): Add a path from the destination building back to the starting building.
        // This graph is undirected, so paths must work in both directions.

    }

    public List<String> getNeighbors(String building) {
        // TODO (Student): Return the list of neighboring buildings for the given building.

        // TODO (Student): Return an empty list if the building does not exist.

        return new ArrayList<>();
    }

    public boolean hasPath(String start, String goal) {
        // TODO (Student): Return false if either building does not exist.

        // TODO (Student): Use Breadth-First Search (BFS) to determine whether a route exists.

        // TODO (Student): Create a set to track visited buildings.

        // TODO (Student): Create a queue to process buildings in BFS order.

        // TODO (Student): Add the starting building to the queue and mark it as visited.

        // TODO (Student): Continue searching while the queue is not empty.

        // TODO (Student): Remove the next building from the queue.

        // TODO (Student): Return true if the current building is the goal.

        // TODO (Student): Visit each unvisited neighbor and add it to the queue.

        // TODO (Student): Return false if no route is found.

        return false;
    }

    public int size() {
        // TODO (Student): Return the number of buildings currently stored in the graph.

        return 0;
    }

    public static void main(String[] args) {
        Unit8Project app = new Unit8Project();

        // TODO (Student): Add the campus buildings.
        app.addBuilding("Library");
        app.addBuilding("Science Hall");
        app.addBuilding("Gym");
        app.addBuilding("Cafeteria");

        // TODO (Student): Create walking paths between buildings.
        app.addPath("Library", "Science Hall");
        app.addPath("Science Hall", "Gym");
        app.addPath("Gym", "Cafeteria");

        // TODO (Student): Verify the graph size.
        System.out.println("Number of buildings: " + app.size());

        // TODO (Student): Display the neighbors of each building.
        System.out.println("Neighbors of Library: "
                + app.getNeighbors("Library"));

        System.out.println("Neighbors of Science Hall: "
                + app.getNeighbors("Science Hall"));

        // TODO (Student): Test whether routes exist between buildings.
        System.out.println("Path from Library to Gym: "
                + app.hasPath("Library", "Gym"));

        System.out.println("Path from Library to Cafeteria: "
                + app.hasPath("Library", "Cafeteria"));

        // TODO (Student): Test a building that does not exist.
        System.out.println("Path from Library to Unknown: "
                + app.hasPath("Library", "Unknown"));
    }
}