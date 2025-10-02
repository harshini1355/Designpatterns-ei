public class TransportFactory {
    public static ITransport getTransport(String type) {
        if (type == null) return null;
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "bus":
                return new Bus();
            default:
                System.out.println("❌ Invalid transport type.");
                return null;
        }
    }
}
