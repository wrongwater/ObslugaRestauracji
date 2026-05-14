import java.util.ArrayList;
import java.util.List;

public class Order
        implements Displayable {

    private int tableNumber;

    private List<Product> products;

    private OrderStatus status;

    public Order(int tableNumber) {

        this.tableNumber = tableNumber;

        products = new ArrayList<>();

        status = OrderStatus.NEW;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {

        double total = 0;

        for(Product p : products) {
            total += p.calculatePrice();
        }

        return total;
    }

    @Override
    public void display() {

        System.out.println(this);

        for(Product p : products) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "Order{table=" + tableNumber +
                ", status=" + status +
                ", total=" + calculateTotal() + "}";
    }
}