package utils.classes;

public class ShippingDepartment implements OrderObserver {
    private String msg;

    // To Complete
  
    @Override
    public void update(String orderNumber, double totalAmount) {
        // Process shipping details for the order
        msg = "Shipping processed for Order " + orderNumber + " with total amount $" + totalAmount;
        // Additional logic to schedule or manage shipments could be placed here
    }

    public String getLastMessage() {
        return msg;
    }  
}