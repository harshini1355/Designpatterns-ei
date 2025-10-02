import java.util.Scanner;

public class MainPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize PayPal account with $200 balance
        IPayment payment = new PayPalAdapter(new PayPal(200.0));

        System.out.println("=== Payment Gateway ===");
        System.out.println("Current balance: $" + payment.getBalance());

        System.out.print("Enter payment amount: $");
        double amount = Double.parseDouble(scanner.nextLine());

        // Attempt payment
        payment.pay(amount);

        System.out.println("Remaining balance: $" + payment.getBalance());

        scanner.close();
    }
}

