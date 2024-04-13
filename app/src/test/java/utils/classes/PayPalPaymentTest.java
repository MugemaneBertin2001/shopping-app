package utils.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PayPalPaymentTest {
    @Test
    void testPayPalPayment() {
        String email = "user@example.com";
        String password = "password";
        double amount = 100.0;

        PayPalPayment payPalPayment = new PayPalPayment(email, password);
        payPalPayment.pay(amount);

        assertEquals("Paid: 100.00", payPalPayment.getMsg());
        assertEquals(email, payPalPayment.getEmail());
        assertEquals(password, payPalPayment.getPassword());
    }
}
