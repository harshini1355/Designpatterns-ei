import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<BankAccount> accounts = new ArrayList<>();
        BankFacade bank = new BankFacade();

        // Preload some existing users
        accounts.add(new BankAccount("ACC1", "Alice", 500));
        accounts.add(new BankAccount("ACC2", "Bob", 300));

        System.out.println("=== Welcome to Simple Banking System ===");
        System.out.print("Enter your name: ");
        String username = scanner.nextLine();

        // Check if user exists
        BankAccount currentUser = null;
        for (BankAccount acc : accounts) {
            if (acc.getCustomerName().equalsIgnoreCase(username)) {
                currentUser = acc;
                break;
            }
        }

        // If user does not exist, register
        if (currentUser == null) {
            System.out.println("User not found. Registering new user...");
            System.out.print("Enter initial deposit amount: $");
            double initialBalance = Double.parseDouble(scanner.nextLine());
            String accountNumber = "ACC" + (accounts.size() + 1); // unique ID
            currentUser = new BankAccount(accountNumber, username, initialBalance);
            accounts.add(currentUser);
            System.out.println("Registration successful! Account ID: " + accountNumber);
        }

        boolean running = true;
        while (running) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Show Balance");
            System.out.println("2. Transfer Funds");
            System.out.println("3. Print Statement");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    bank.showBalance(currentUser);
                    break;
                case 2:
                    System.out.print("Enter recipient name: ");
                    String recipientName = scanner.nextLine();
                    BankAccount recipient = null;
                    for (BankAccount acc : accounts) {
                        if (acc.getCustomerName().equalsIgnoreCase(recipientName)) {
                            recipient = acc;
                            break;
                        }
                    }

                    if (recipient == null) {
                        System.out.println("Recipient not found.");
                        break;
                    }

                    if (recipient == currentUser) {
                        System.out.println("You cannot transfer money to yourself.");
                        break;
                    }

                    System.out.print("Enter amount to transfer: $");
                    double amount = Double.parseDouble(scanner.nextLine());
                    bank.transferFunds(currentUser, recipient, amount);
                    break;
                case 3:
                    bank.printStatement(currentUser);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        System.out.println("Thank you for using Simple Banking System.");
        scanner.close();
    }
}
