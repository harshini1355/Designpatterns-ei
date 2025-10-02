public class BalanceService {
    public void showBalance(BankAccount account) {
        System.out.println("Account Balance for " + account.getCustomerName() + ": $" + account.getBalance());
    }
}
