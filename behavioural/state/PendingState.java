public class PendingState implements OrderState {
    @Override
    public void printStatus(Order order) {
        System.out.println("Order ID: " + order.getOrderId() + " is Pending payment.");
    }
}
