
import java.util.HashMap;
import java.util.Map;

/**
 * Unit6Project
 *
 * Inventory lookup tool using a HashMap.
 *
 * Students will practice:
 * - Storing inventory items by SKU
 * - Updating item quantities
 * - Looking up quantities
 * - Checking whether an SKU exists
 * - Removing inventory items
 */

public class Unit6Project {

    private Map<String, Integer> inventory = new HashMap<>();

    public void addOrUpdateItem(String sku, int quantity) {

        // TODO 1: Add the SKU and quantity to the inventory map.
        // If the SKU already exists, update its quantity.
    }

    public Integer getQuantity(String sku) {

        // TODO 2: Return the quantity stored for the SKU.
        // If the SKU does not exist, this should return null.
        return null;
    }

    public boolean containsSku(String sku) {

        // TODO 3: Return true if the SKU exists in the inventory.
        return false;
    }

    public boolean removeItem(String sku) {

        // TODO 4: Remove the item if the SKU exists.
        // Return true if removed; return false if the SKU was not found.
        return false;
    }

    public int size() {

        // TODO 5: Return the number of items in the inventory.
        return 0;
    }

    public static void main(String[] args) {

        Unit6Project app = new Unit6Project();

        app.addOrUpdateItem("P100", 15);
        app.addOrUpdateItem("P200", 9);
        app.addOrUpdateItem("P100", 20);

        System.out.println("Inventory size: " + app.size());
        System.out.println("P100 quantity: " + app.getQuantity("P100"));
        System.out.println("P200 quantity: " + app.getQuantity("P200"));
        System.out.println("Contains P300? " + app.containsSku("P300"));
        System.out.println("Contains P100? " + app.containsSku("P100"));
        System.out.println("Removing P200: " + app.removeItem("P200"));
        System.out.println("Inventory size after removal: " + app.size());
    }
}