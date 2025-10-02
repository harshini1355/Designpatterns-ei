public class Bike implements ITransport {
    @Override
    public void book() {
        System.out.println("🏍️ Bike has been booked. Rider will arrive shortly!");
    }
}
