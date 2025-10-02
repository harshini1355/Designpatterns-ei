import java.util.Scanner;

public class MainStock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create some stocks
        Stock apple = new Stock("Apple", 150.0);
        Stock tesla = new Stock("Tesla", 700.0);

        // Login / Register user
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        Investor investor = new Investor(userName);

        // Let user choose stocks to follow
        System.out.println("Which stock do you want to follow?");
        System.out.println("1. Apple");
        System.out.println("2. Tesla");
        System.out.println("3. Both");
        System.out.print("Enter choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                apple.attach(investor);
                break;
            case 2:
                tesla.attach(investor);
                break;
            case 3:
                apple.attach(investor);
                tesla.attach(investor);
                break;
            default:
                System.out.println("Invalid choice. Following no stocks.");
        }

        // Simulate stock price changes
        System.out.println("\n--- Stock price updates ---");
        apple.setPrice(155.0);
        tesla.setPrice(710.0);
        apple.setPrice(160.0);

        scanner.close();
    }
}
