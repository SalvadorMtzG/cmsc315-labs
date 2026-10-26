
import java.util.ArrayList;
import java.util.List;

/**
 * Unit4Project
 *
 * This project creates a simple household budget category tree.
 *
 * Each category is represented as a tree node. The root node is "Budget",
 * and child nodes can be added to organize categories such as Housing,
 * Food, Transportation, Rent, and Utilities.
 *
 * Students will practice:
 * - Creating child nodes
 * - Building parent-child relationships
 * - Searching a tree recursively
 * - Printing a tree using preorder traversal
 *
 * @author FIRST LAST
 * @version 1.0
 */

public class Unit4Project {

    /**
     * TreeNode represents one category in the budget tree.
     * Each node has a name and a list of child nodes.
     */
    static class TreeNode {

        // Stores the name of the budget category
        String name;

        // Stores the child categories connected to this node
        List<TreeNode> children = new ArrayList<>();

        /**
         * Creates a new tree node with a category name.
         *
         * @param name the name of the budget category
         */
        TreeNode(String name) {
            this.name = name;
        }
    }

    // The root node is the starting point of the tree
    private TreeNode root = new TreeNode("Budget");

    /**
     * Returns the root node of the budget tree.
     *
     * @return the root node
     */
    public TreeNode getRoot() {
        return root;
    }

    /**
     * Adds a child category to a parent category.
     *
     * @param parent the node that will receive the child
     * @param childName the name of the child category to add
     */
    public void addChild(TreeNode parent, String childName) {

        // TODO 1: Create a new TreeNode object using childName


        // TODO 2: Add the new child node to the parent's children list

    }

    /**
     * Recursively searches the tree for a target category.
     *
     * @param node the current node being searched
     * @param target the category name being searched for
     * @return true if the target is found; otherwise false
     */
    public boolean contains(TreeNode node, String target) {

        // TODO 3: If node is null, return false


        // TODO 4: If the current node's name matches target, return true


        // TODO 5: Use a loop to recursively search each child node


        // Return false if the target was not found
        return false;
    }

    /**
     * Prints the tree using preorder traversal.
     * Preorder means the current node is printed before its children.
     *
     * @param node the current node being printed
     */
    public void printPreOrder(TreeNode node) {

        // TODO 6: If node is null, stop the method


        // TODO 7: Print the current node's name


        // TODO 8: Use a loop to recursively print each child node

    }

    /**
     * Main method used to demonstrate the budget category tree.
     *
     * Students may use this method to manually test the program.
     */
    public static void main(String[] args) {

        // Create the project object
        Unit4Project app = new Unit4Project();

        // Get the root node of the tree
        TreeNode root = app.getRoot();

        // Add top-level budget categories
        app.addChild(root, "Housing");
        app.addChild(root, "Food");

        /*
         * Add nested categories under Housing.
         * This demonstrates that child nodes can also have children.
         */
        for (TreeNode child : root.children) {
            if (child.name.equals("Housing")) {
                app.addChild(child, "Rent");
                app.addChild(child, "Utilities");
            }
        }

        // Search for categories in the tree
        System.out.println("Contains Food? " + app.contains(root, "Food"));
        System.out.println("Contains Rent? " + app.contains(root, "Rent"));
        System.out.println("Contains Travel? " + app.contains(root, "Travel"));

        // Print the tree using preorder traversal
        System.out.println("\nPreOrder Traversal:");
        app.printPreOrder(root);
    }
}
