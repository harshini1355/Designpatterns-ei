public class Car implements ITransport {
    @Override
    public void book() {
        System.out.println("🚗 Car has been booked. Driver will arrive shortly!");
    }
}
