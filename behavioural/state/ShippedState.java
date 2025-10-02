public class ShippedState implements OrderState {
    @Override
    public void printStatus(Order order) {
        System.out.println("Order ID: " + order.getOrderId() + " has been Shipped.");
    }
}
