import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample orders for multiple users
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("ORD001", "Alice"));
        orders.add(new Order("ORD002", "Bob"));
        orders.add(new Order("ORD003", "Alice"));
        orders.add(new Order("ORD004", "Charlie"));

        // Update some orders to simulate progress
        orders.get(0).markPaid();
        orders.get(0).markDelivered(LocalDate.of(2025, 10, 5));
        orders.get(1).markPaid();
        orders.get(1).markShipped();
        orders.get(1).markDelivered(LocalDate.of(2025, 10, 7));
        orders.get(2).markPaid();
        orders.get(3).markPaid();

        // Login
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.println("\n--- Orders for " + username + " ---\n");

        boolean hasOrders = false;
        for (Order order : orders) {
            if (order.getCustomerName().equalsIgnoreCase(username)) {
                order.printStatus();
                hasOrders = true;
            }
        }

        if (!hasOrders) {
            System.out.println("No orders found for user: " + username);
        }

        scanner.close();
    }
}
