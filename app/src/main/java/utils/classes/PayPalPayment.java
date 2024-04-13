package utils.classes;

public class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;
    private String msg;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
        this.msg = "";
    }

    @Override
    public void pay(double amount) {
        this.msg = "Paid: " + String.format("%.2f", amount);
        // Simulate payment logic
    }

    @Override
    public String getMsg() {
        return msg;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
