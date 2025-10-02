public class BankFacade {
    private BalanceService balanceService;
    private FundTransferService transferService;
    private StatementService statementService;

    public BankFacade() {
        balanceService = new BalanceService();
        transferService = new FundTransferService();
        statementService = new StatementService();
    }

    public void showBalance(BankAccount account) {
        balanceService.showBalance(account);
    }

    public void transferFunds(BankAccount from, BankAccount to, double amount) {
        transferService.transfer(from, to, amount);
    }

    public void printStatement(BankAccount account) {
        statementService.printStatement(account);
    }
}
