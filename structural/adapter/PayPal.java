public class PayPal {
    private double balance;

    public PayPal(double initialBalance) {
        this.balance = initialBalance;
    }

    public boolean makePayment(double amountInUSD) {
        if (amountInUSD > balance) {
            return false; // insufficient balance
        }
        balance -= amountInUSD;
        return true; // payment successful
    }

    public double getBalance() {
        return balance;
    }
}
