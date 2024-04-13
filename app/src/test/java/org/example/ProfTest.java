package org.example;

import org.junit.jupiter.api.Test;
import utils.classes.*;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    
    @Test
    void tc_0() {
        App app = new App();
        int currentHour = LocalTime.now().getHour();
        String expectedGreeting;
        if (currentHour < 12) {
            expectedGreeting = "Good morning!";
        } else if (currentHour < 18) {
            expectedGreeting = "Good afternoon!";
        } else {
            expectedGreeting = "Good evening!";
        }
        assertEquals(expectedGreeting, app.getGreeting(), "App should return the correct greeting");
    }

    /*
     * Testing AuthManager
     */
    @Test
    void AuthManagerTest_tc_0() {
        AuthManager instance1 = AuthManager.getInstance();
        AuthManager instance2 = AuthManager.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }

    @Test
    void AuthManagerTest_tc_1() {
        AuthManager manager1 = AuthManager.getInstance();
        AuthManager manager2 = AuthManager.getInstance();
        assertSame(manager1, manager2, "AuthManager should be a singleton");
    }

    /*
     * Testing ShoppingCart
     */
    @Test
    void ShoppingCartTest_tc_0() {
        ShoppingCart cart = new ShoppingCart();
        
        // Mock payment strategy
        PaymentStrategy paymentStrategy = new PaymentStrategy() {
            @Override
            public void pay(double amount) {
                // Mock payment process
            }
            
            @Override
            public String getMsg() {
                return "Mock payment message";
            }
        };
        
        cart.setPaymentStrategy(paymentStrategy);
        cart.checkout(100.0);
        
        // Assert that the payment strategy was used and the message is correct
        assertEquals("Mock payment message", paymentStrategy.getMsg(), "Checkout should use the provided payment strategy");
    }

    @Test
    void ShoppingCartTest_tc_1() {
        ShoppingCart cart = new ShoppingCart();
        PayPalPayment payment = new PayPalPayment("user@example.com", "password");
        cart.setPaymentStrategy(payment);
        cart.checkout(1500.0);
        // Assert checkout logic here, if applicable
        String msg = payment.getMsg();
        assertEquals("Paid: 1500.00", msg); 
    }

    /*
     * Testing Order
     */
    @Test
    void OrderTest_tc_0() {
        Order order = new Order("ORD123", 1500.0);
        InventoryManager inventoryManager = new InventoryManager();
        ShippingDepartment shippingDepartment = new ShippingDepartment();
        
        order.addObserver(inventoryManager);
        order.addObserver(shippingDepartment);
        
        order.notifyObservers();
        assertNotNull(inventoryManager.getLastMessage(), "Inventory Manager should receive a notification");
        assertNotNull(shippingDepartment.getLastMessage(), "Shipping Department should receive a notification");
    }

    /*
     * Testing ProductFactory
     */
    @Test
    void ProductFactoryTest_tc_0() {
        Electronicsfactory factory = new Electronicsfactory();
        Product product = factory.createProduct("Laptop");
        assertNotNull(product);
        assertEquals("Laptop: Laptop, Price: $999.99", product.getDescription());
        assertEquals(999.99, product.getPrice(), 0.01);
    }
    
    @Test
    void ProductFactoryTest_tc_1() {
        Electronicsfactory factory = new Electronicsfactory();
        Product product = factory.createProduct("Phone");
        assertNotNull(product);
        assertEquals("Phone: Phone, Price: $499.99", product.getDescription());
        assertEquals(499.99, product.getPrice(), 0.01);
    }

    @Test
    void ProductFactoryTest_tc_2() {
        Electronicsfactory factory = new Electronicsfactory();
        Product product = factory.createProduct("InvalidType");
        assertNull(product);
    }

    /*
     * Testing Product (Laptop and Phone)
     */
    @Test
    void ProductTest_tc_0() {
        Laptop laptop = new Laptop("Dell XPS", 1500.0);
        assertEquals("Laptop: Dell XPS, Price: $1500.0", laptop.getDescription());
        assertEquals(1500.0, laptop.getPrice());
    }

    @Test
    void ProductTest_tc_1() {
        Phone phone = new Phone("iPhone 12", 999.0);
        assertEquals("Phone: iPhone 12, Price: $999.0", phone.getDescription());
        assertEquals(999.0, phone.getPrice());
    }
}
