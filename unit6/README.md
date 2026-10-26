Unit 6 Lab: Inventory Lookup


Create an inventory lookup tool that models the following:

- Hash table behavior using a `HashMap`
- SKU-based inventory storage and retrieval
- Dynamic insertion and updating of inventory records
- Fast lookup operations using key-value pairs


Learning Goals

- Practice working with Java `HashMap`
- Implement key-value storage operations
- Understand hash table lookup efficiency
- Practice updating and removing inventory records
- Create and execute JUnit test methods
- Explain how hash tables are used in real-world software systems

Lab Setup

TODO: ALOFT directions

In IntelliJ, you can test your code by running the individual JUnit test classes. Once the tests pass, follow the submission instructions below for the lab assignment and reflection essay.

JUnit Tests
In an IDE, test your code by running the individual JUnit test methods:

addNewItemIncreasesInventorySize

containsSkuReturnsTrueForExistingSku

getQuantityReturnsNullForMissingSku

removeItemDeletesExistingSku

updateExistingItemDoesNotIncreaseSize

removeMissingItemReturnsFalse (student-created)





Requirements

Edit the `Unit6Project` class to implement the methods described below.

1. Complete `addOrUpdateItem`.

The method should:

- Add a new SKU and quantity to the inventory

- Update the quantity if the SKU already exists

Check the method by running the tests in:

- `addNewItemIncreasesInventorySize`

- `updateExistingItemDoesNotIncreaseSize`



2. Complete `getQuantity`.

The method should:

- Return the quantity associated with the SKU

- Return `null` if the SKU does not exist



Check the method by running the test in:

- `getQuantityReturnsNullForMissingSku`



3. Complete `containsSku`.

The method should:

- Return `true` if the SKU exists in the inventory

- Return `false` if the SKU does not exist


Check the method by running the tests in:

- `containsSkuReturnsTrueForExistingSku`

- `getQuantityReturnsNullForMissingSku`

4. Complete `removeItem`.

The method should:

- Remove an item from the inventory if the SKU exists

- Return `true` if the item was removed

- Return `false` if the SKU was not found



Check the method by running the test in:

- `removeItemDeletesExistingSku`



5. Complete `size`.

The method should:

- Return the total number of inventory items currently stored


This method is validated throughout the JUnit tests.

6. Additional JUnit Test

In the IDE, create one additional JUnit test method named:

removeMissingItemReturnsFalse()



The test should verify that `removeItem` behaves correctly when the SKU does not exist in the inventory.

Your test should:

- Create a new `Unit6Project` object

- Add at least one inventory item

- Attempt to remove a SKU that was never added

- Use `assertFalse` to verify that `removeItem` returns `false`

- Use `assertEquals` to verify that the inventory size did not change



Example scenario:

Add SKU P100 with quantity 15.

Try to remove SKU P999.

The method should return false.

The inventory size should still be 1.



7. Comment all code.

Use comments to explain the following:

- How the `HashMap` stores inventory data

- How SKU lookups work

- How items are updated or removed

- Why hash tables are efficient for inventory systems



Reflection Essay Instructions

Address the following:

- Explain how a `HashMap` stores inventory data using key-value pairs.

- Describe why SKU values are good candidates for hash table keys.

- Reflect on which method was easier or harder to implement and why.

- Explain why hash tables are efficient for lookup operations.

- Include a copy of your JUnit test method, removeMissingItemsReturnsFalse.

- Include a screenshot showing the successful execution of the JUnit test method.

1. Submit your reflection essay to the LEO/D2L Unit 6 Lab.

2. Submit Unit6Project.java to the zyBooksUnit 6 Lab.

Real-World Applications

Hash tables are commonly used in software systems that require fast lookup operations, including:

- Inventory management systems

- Product catalogs

- Online shopping carts

- Database indexing systems

- User account management

- Caching systems

- Search engines

- Warehouse tracking applications