package utils.classes;


import java.util.Random;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardholderName;
    private String cvv;
    private String msg;

    public CreditCardPayment(String cardNumber, String cardholderName, String cvv) {
        this.cardNumber = cardNumber;
        this.cardholderName = cardholderName;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        // Simulate the credit card payment logic
        boolean paymentSuccess = processCreditCardPayment(amount);

        if (paymentSuccess) {
            // If payment is successful, set the payment status message
            this.msg = "Payment of $" + amount + " made using credit card ending with " + cardNumber.substring(cardNumber.length() - 4);
        } else {
            // If payment fails, set an error message
            this.msg = "Credit card payment failed. Please check your card details and try again.";
        }
    }

    @Override
    public String getMsg() {
        return msg;
    }

    // Simulate the credit card payment process (for demonstration purposes)
    private boolean processCreditCardPayment(double amount) {
        // Check if the payment is successful (for demonstration purposes, generate a random boolean)
        Random random = new Random();
        return random.nextBoolean();
    }
}
