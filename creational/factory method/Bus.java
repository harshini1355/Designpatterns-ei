public class Bus implements ITransport {
    @Override
    public void book() {
        System.out.println("🚌 Bus has been booked. Seat confirmed!");
    }
}
