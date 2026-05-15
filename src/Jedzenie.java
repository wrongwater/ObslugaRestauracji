public class Jedzenie extends Produkt
        implements Comparable<Jedzenie> {

    private int calories;

    public Jedzenie(String name,
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
    public int compareTo(Jedzenie other) {
        return Double.compare(
                this.getPrice(),
                other.getPrice()
        );
    }

    @Override
    public String toString() {
        return "Jedzenie{name='" + getName() +
                "', price=" + getPrice() + "}";
    }
}