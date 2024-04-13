package org.example;

import org.junit.jupiter.api.Test;

import utils.classes.InventoryManager;
import utils.classes.Order;
import utils.classes.ShippingDepartment;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    void orderNotifiesObservers() {
        Order order = new Order("ORD123", 1500.0);
        
        // Mock observers
        InventoryManager inventoryManager = new InventoryManager();
        ShippingDepartment shippingDepartment = new ShippingDepartment();
        
        order.addObserver(inventoryManager);
        order.addObserver(shippingDepartment);
        
        order.notifyObservers();
        
        // Assert that both observers received the notification
        assertNotNull(inventoryManager.getLastMessage(), "Inventory Manager should receive a notification");
        assertNotNull(shippingDepartment.getLastMessage(), "Shipping Department should receive a notification");
    }
}
