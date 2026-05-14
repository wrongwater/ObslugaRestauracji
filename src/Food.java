public class Food extends Product
        implements Comparable<Food> {

    private int calories;

    public Food(String name,
                double price,
                int calories) {

        super(name, price);
        this.calories = calories;
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }

    @Override
    public int compareTo(Food other) {
        return Double.compare(
                this.getPrice(),
                other.getPrice()
        );
    }

    @Override
    public String toString() {
        return "Food{name='" + getName() +
                "', price=" + getPrice() + "}";
    }
}