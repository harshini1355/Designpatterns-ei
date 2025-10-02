import java.time.LocalDate;

public class DeliveredState implements OrderState {
    private LocalDate deliveryDate;

    public DeliveredState(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void printStatus(Order order) {
        System.out.println("Order ID: " + order.getOrderId() + " was Delivered on " + deliveryDate + ".");
    }
}
