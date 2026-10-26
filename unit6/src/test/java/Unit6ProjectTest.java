import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Unit6ProjectTest {

    @Test
    void addNewItemIncreasesInventorySize() {

        Unit6Project app = new Unit6Project();

        app.addOrUpdateItem("P100", 15);

        assertEquals(1, app.size(),
                "addOrUpdateItem should add one new SKU to the inventory.");

        assertEquals(15, app.getQuantity("P100"),
                "getQuantity should return 15 for SKU P100.");

        System.out.println(
                "PASS: addOrUpdateItem added SKU P100 with quantity 15. " +
                        "This test fails in the starter code because addOrUpdateItem(), getQuantity(), and size() are not fully implemented."
        );
    }

    @Test
    void containsSkuReturnsTrueForExistingSku() {

        Unit6Project app = new Unit6Project();

        app.addOrUpdateItem("P200", 9);

        assertTrue(app.containsSku("P200"),
                "containsSku should return true when SKU P200 exists in the inventory.");

        System.out.println(
                "PASS: containsSku correctly returned true for existing SKU P200."
        );
    }

    @Test
    void getQuantityReturnsNullForMissingSku() {

        Unit6Project app = new Unit6Project();

        app.addOrUpdateItem("P100", 15);

        assertEquals(
                15,
                app.getQuantity("P100"),
                "After adding P100, getQuantity should return 15."
        );

        assertNull(
                app.getQuantity("P999"),
                "getQuantity should return null for a missing SKU."
        );

        assertFalse(
                app.containsSku("P999"),
                "containsSku should return false for a missing SKU."
        );

        System.out.println(
                "PASS: Existing SKU P100 was retrieved successfully and missing SKU P999 correctly returned null."
        );
    }

    @Test
    void removeItemDeletesExistingSku() {

        Unit6Project app = new Unit6Project();

        app.addOrUpdateItem("P300", 12);

        boolean removed = app.removeItem("P300");

        assertTrue(removed,
                "removeItem should return true when an existing SKU is removed.");

        assertFalse(app.containsSku("P300"),
                "containsSku should return false after SKU P300 has been removed.");

        assertEquals(0, app.size(),
                "Inventory size should be 0 after removing the only item.");

        System.out.println(
                "PASS: removeItem deleted SKU P300, returned true, and reduced the inventory size to 0."
        );
    }

    @Test
    void updateExistingItemDoesNotIncreaseSize() {

        Unit6Project app = new Unit6Project();

        app.addOrUpdateItem("P100", 15);
        app.addOrUpdateItem("P100", 20);

        assertEquals(1, app.size(),
                "Updating an existing SKU should not increase the inventory size.");

        assertEquals(20, app.getQuantity("P100"),
                "Updating SKU P100 should replace the quantity with 20.");

        System.out.println(
                "PASS: Updating existing SKU P100 changed the quantity to 20 without increasing inventory size."
        );
    }
}