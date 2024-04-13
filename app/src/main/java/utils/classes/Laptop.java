package utils.classes;

public class Laptop implements Product {
    private String name;
    private double price;

    public Laptop(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return "Laptop: " + name + ", Price: $" + price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
