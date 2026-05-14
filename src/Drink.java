public class Drink extends Product {

    private boolean cold;

    public Drink(String name,
                 double price,
                 boolean cold) {

        super(name, price);
        this.cold = cold;
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }

    @Override
    public String toString() {
        return "Drink{name='" + getName() +
                "', price=" + getPrice() + "}";
    }
}