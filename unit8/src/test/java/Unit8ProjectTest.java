import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Unit8ProjectTest {

    @Test
    void addBuildingIncreasesGraphSize() {
        Unit8Project project = new Unit8Project();

        project.addBuilding("Library");

        assertEquals(
                1,
                project.size(),
                "addBuilding should add Library and increase the graph size to 1."
        );

        System.out.println("PASS: Library was added to the graph.");
    }

    @Test
    void addDuplicateBuildingDoesNotIncreaseSize() {
        Unit8Project app = new Unit8Project();

        app.addBuilding("Library");
        app.addBuilding("Library");

        assertEquals(
                1,
                app.size(),
                "Duplicate buildings should not increase the graph size."
        );

        System.out.println("PASS: Duplicate Library entry was not added.");
    }

    @Test
    void addPathCreatesNeighborsInBothDirections() {
        Unit8Project project = new Unit8Project();

        project.addPath("Library", "Science Hall");

        assertTrue(
                project.getNeighbors("Library").contains("Science Hall"),
                "Library should include Science Hall as a neighbor."
        );

        assertTrue(
                project.getNeighbors("Science Hall").contains("Library"),
                "Science Hall should include Library as a neighbor because the graph is undirected."
        );

        System.out.println("PASS: Path was created in both directions.");
    }

    @Test
    void hasPathReturnsTrueForConnectedBuildings() {
        Unit8Project app = new Unit8Project();

        app.addPath("Library", "Science Hall");
        app.addPath("Science Hall", "Gym");
        app.addPath("Gym", "Cafeteria");

        assertTrue(
                app.hasPath("Library", "Cafeteria"),
                "hasPath should return true when a route exists through connected buildings."
        );

        System.out.println("PASS: BFS found a route from Library to Cafeteria.");
    }

    @Test
    void hasPathReturnsFalseForUnknownBuilding() {
        Unit8Project app = new Unit8Project();

        app.addPath("Library", "Science Hall");

        assertFalse(
                app.hasPath("Library", "Unknown"),
                "hasPath should return false when either building does not exist in the graph."
        );

        System.out.println("PASS: hasPath returned false because Unknown is not in the graph.");
    }

}