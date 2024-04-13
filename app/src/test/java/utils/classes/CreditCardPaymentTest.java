package utils.classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardPaymentTest {
    @Test
    void testCreditCardPaymentSuccess() {
        String cardNumber = "1234567890123456";
        String cardholderName = "John Doe";
        String cvv = "123";
        double amount = 100.0;

        CreditCardPayment creditCardPayment = new CreditCardPayment(cardNumber, cardholderName, cvv);
        creditCardPayment.pay(amount);

        assertTrue(creditCardPayment.getMsg().startsWith("Payment of $100.0 made using credit card ending with 3456"));
        assertEquals(cardNumber, creditCardPayment.getCardNumber());
        assertEquals(cardholderName, creditCardPayment.getCardholderName());
        assertEquals(cvv, creditCardPayment.getCvv());
    }
}
