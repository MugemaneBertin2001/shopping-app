package utils.classes;

public class Electronicsfactory implements ProductFactory {
    // To Do
    @Override
    public Product createProduct(String type) {
        switch (type) {
            case "Laptop":
                return new Laptop("Laptop", 999.99);
            case "Phone":
                return new Phone("Phone", 499.99);
            default:
                return null;
        }
}
}