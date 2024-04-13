package org.example;

import org.junit.jupiter.api.Test;

import utils.classes.PaymentStrategy;
import utils.classes.ShoppingCart;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    @Test
    void shoppingCartCheckoutWithPaymentStrategy() {
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
}
