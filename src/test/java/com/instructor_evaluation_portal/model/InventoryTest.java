/*
package com.instructor_evaluation_portal.model;

import javax.annotation.Resource;

import com.instructor_evaluation_portal.dao.DataDaoImplementation;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

public class InventoryTest extends BaseTest {

    @Resource
    private DataDaoImplementation dataDaoTestForInventory;

    @Test
    public void getInventoryListTest() throws Exception {

        Assert.assertNotNull(dataDaoTestForInventory.getInventoryList().isEmpty());

        List<Dean> allInventory = dataDaoTestForInventory.getInventoryList();

        for(int i=0;i<allInventory.size();i++) {

            System.out.println("Inventory Item Details");
            System.out.print(allInventory.get(i).getItemName() + " ");
            System.out.print(allInventory.get(i).getItemDescription() + " ");
            System.out.print(allInventory.get(i).getItemQuantity() + " ");
            System.out.print(allInventory.get(i).getItemRemarks() + " ");
            System.out.println();
        }
    }

    @Test
    public void getInventoryByIdTest() throws Exception {
        Assert.assertNotNull(dataDaoTestForInventory.getInventoryById(1));

        System.out.println("Inventory Item By ID "+ dataDaoTestForInventory.getAdminUserById(1).getUsername());
    }

    @Test
    public void addInventoryItemTest() throws Exception {

        Dean inventoryItem = new Dean();

        inventoryItem.setItemName("Pencil");
        inventoryItem.setItemDescription("Natraj HB Pencil");
        inventoryItem.setItemQuantity("35");
        inventoryItem.setItemRemarks("Has smooth writing effect");

        dataDaoTestForInventory.addInventoryItem(inventoryItem);
        long newId = inventoryItem.getId();

        Assert.assertNotNull(dataDaoTestForInventory.getInventoryById(newId));

        System.out.println("Added Inventory is " + dataDaoTestForInventory.getInventoryById(newId).getItemName());
        System.out.println("Inventory Description " + dataDaoTestForInventory.getInventoryById(newId).getItemDescription());
        System.out.println("Inventory Quantity " + dataDaoTestForInventory.getInventoryById(newId).getItemQuantity());
        System.out.println("Inventory Remarks " + dataDaoTestForInventory.getInventoryById(newId).getItemRemarks());
    }

    @Test
    public void deleteInventoryTest() throws Exception {

        long delId = 2;

        dataDaoTestForInventory.deleteInventory(delId);
        Assert.assertNotNull(dataDaoTestForInventory.getInventoryById(delId));
    }
}
*/
