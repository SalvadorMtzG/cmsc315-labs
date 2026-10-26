import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Unit4ProjectTest {
    @Test
    void findRoot() {
        Unit4Project app = new Unit4Project();

        assertNotNull(
                app.getRoot(),
                "The root node should be created when the tree is initialized."
        );

        assertEquals(
                "Budget",
                app.getRoot().name,
                "The root node should be named 'Budget'."
        );

        assertTrue(
                app.getRoot().children.isEmpty(),
                "A newly created root node should not have any child categories."
        );

        System.out.println(
                "PASS: Root node was created successfully with the name 'Budget' and no child nodes."
        );
    }
    @Test
    void treeContainsOnlyRootNode() {
        Unit4Project app = new Unit4Project();

        assertEquals(0, app.getRoot().children.size());

        // Positive test
        assertTrue(app.contains(app.getRoot(), "Budget"));

        // Negative test
        assertFalse(app.contains(app.getRoot(), "Food"));
    }
    @Test
    void addChildNodeToTree() {
        Unit4Project app = new Unit4Project();
        Unit4Project.TreeNode root = app.getRoot();

        app.addChild(root, "Food");

        assertTrue(app.contains(root, "Food"));

        System.out.println("Child node 'Food' was added successfully.");
    }
    @Test
    void findNestedChild() {
        Unit4Project app = new Unit4Project();
        Unit4Project.TreeNode root = app.getRoot();

        app.addChild(root, "Housing");

        assertFalse(
                root.children.isEmpty(),
                "Starter code failure: addChild() did not add Housing to the root node."
        );

        Unit4Project.TreeNode housing = root.children.get(0);
        app.addChild(housing, "Rent");

        assertTrue(
                app.contains(root, "Rent"),
                "contains should return true when searching for a nested child node."
        );

        System.out.println(
                "PASS: Recursive search found the nested child node 'Rent'."
        );
    }
    @Test
    void returnFalseForMissingNode() {
        Unit4Project app = new Unit4Project();
        Unit4Project.TreeNode root = app.getRoot();

        app.addChild(root, "Housing");
        app.addChild(root, "Food");

        assertFalse(
                root.children.isEmpty(),
                "Starter code failure: addChild() has not added any child nodes to the root."
        );

        Unit4Project.TreeNode housing = root.children.get(0);

        app.addChild(housing, "Rent");
        app.addChild(housing, "Utilities");

        assertFalse(
                app.contains(root, "Travel"),
                "contains should search the entire tree and return false when the target is not found"
        );

        System.out.println("PASS: Missing nested node correctly returned false.");
    }

    @Test
    void addMultipleChildrenAndValidateStructure() {
        Unit4Project app = new Unit4Project();
        Unit4Project.TreeNode root = app.getRoot();

        app.addChild(root, "Housing");
        app.addChild(root, "Food");
        app.addChild(root, "Transportation");

        assertEquals(3, root.children.size());
        assertTrue(app.contains(root, "Transportation"));

        System.out.println("Multiple children added successfully.");
    }
    @Test
    void printPreOrderWithoutException() {

        Unit4Project app = new Unit4Project();
        Unit4Project.TreeNode root = app.getRoot();

        app.addChild(root, "Housing");
        app.addChild(root, "Food");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        System.setOut(new PrintStream(output));

        app.printPreOrder(root);

        System.setOut(originalOut);

        String result = output.toString();

        assertTrue(result.contains("Budget"));
        assertTrue(result.contains("Housing"));
        assertTrue(result.contains("Food"));
    }
}
