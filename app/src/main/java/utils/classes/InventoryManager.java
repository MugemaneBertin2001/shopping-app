package utils.classes;

public class InventoryManager implements OrderObserver {
    // To Do
    private String msg;

    @Override
    public void update(String orderNumber, double totalAmount) {
        // Update inventory system based on order details
        msg = "Updated Inventory for Order " + orderNumber + " with amount $" + totalAmount;
        // Additional logic to handle the inventory update could be placed here
    }

    public String getLastMessage() {
        return msg;
    }

}
