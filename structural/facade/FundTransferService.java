public class FundTransferService {
    public void transfer(BankAccount from, BankAccount to, double amount) {
        if (from.withdraw(amount)) {
            to.deposit(amount);
            System.out.println("Transferred $" + amount + " from " + from.getCustomerName() +
                    " to " + to.getCustomerName());
        } else {
            System.out.println("Insufficient balance in " + from.getCustomerName() + "'s account.");
        }
    }
}
