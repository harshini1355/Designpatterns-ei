import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String name;
    private double price;
    private List<IInvestor> investors = new ArrayList<>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void attach(IInvestor investor) {
        investors.add(investor);
    }

    public void detach(IInvestor investor) {
        investors.remove(investor);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyInvestors();
    }

    private void notifyInvestors() {
        for (IInvestor investor : investors) {
            investor.update(name, price);
        }
    }
}
