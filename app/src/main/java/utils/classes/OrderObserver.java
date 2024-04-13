package utils.classes;

public interface OrderObserver {
    void update(String orderNumber, double totalAmount);
}