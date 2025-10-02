public interface IPayment {
    boolean pay(double amount);
    double getBalance();
}
