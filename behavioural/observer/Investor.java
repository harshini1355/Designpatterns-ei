public class Investor implements IInvestor {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println(name + " notified: " + stockName + " price is now $" + stockPrice);
    }
}
