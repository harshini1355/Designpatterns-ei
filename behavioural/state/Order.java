import java.time.LocalDate;

public class Order {
    private String orderId;
    private String customerName;
    private OrderState state;

    public Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.state = new PendingState();
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void printStatus() {
        state.printStatus(this);
    }

    // Convenience methods
    public void markPaid() {
        setState(new PaidState());
    }

    public void markShipped() {
        setState(new ShippedState());
    }

    public void markDelivered(LocalDate deliveryDate) {
        setState(new DeliveredState(deliveryDate));
    }
}
