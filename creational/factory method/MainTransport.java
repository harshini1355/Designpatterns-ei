import java.util.Scanner;

public class MainTransport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Transport Booking System ===");
        System.out.println("Available options: Car, Bike, Bus");
        System.out.print("Enter your choice: ");
        
        String choice = scanner.nextLine();
        ITransport transport = TransportFactory.getTransport(choice);

        if (transport != null) {
            transport.book();
        }

        scanner.close();
    }
}
