public class PayPalAdapter implements IPayment {
    private PayPal paypal;

    public PayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }

    @Override
    public boolean pay(double amount) {
        boolean success = paypal.makePayment(amount);
        if (success) {
            System.out.println("Paid $" + amount + " via PayPal.");
        } else {
            System.out.println("Insufficient balance. Payment of $" + amount + " failed.");
        }
        return success;
    }

    @Override
    public double getBalance() {
        return paypal.getBalance();
    }
}
