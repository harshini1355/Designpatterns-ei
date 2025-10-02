public class StatementService {
    public void printStatement(BankAccount account) {
        System.out.println("Statement for " + account.getCustomerName() +
                " (Account: " + account.getAccountNumber() + ")");
        System.out.println("Current Balance: $" + account.getBalance());
        System.out.println("----------------------------------");
    }
}
