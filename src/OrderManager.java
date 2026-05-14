import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderManager {

    private List<Order> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {

        orders.add(order);

        Restaurant.incrementOrders();
    }

    public void showOrders() {

        for(Order order : orders) {
            order.display();
        }
    }

    public void sortFoods(List<Food> foods) {

        Collections.sort(foods);

        System.out.println("Sortowanie Comparable:");

        for(Food food : foods) {
            System.out.println(food);
        }
    }

    public void sortProducts(List<Product> products) {

        products.sort(new ProductNameComparator());

        System.out.println("Sortowanie Comparator:");

        for(Product p : products) {
            System.out.println(p);
        }
    }
}