public class Napoj extends Produkt {

    private boolean cold;

    public Napoj(String name,
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
        return "Napoj{name='" + getName() +
                "', price=" + getPrice() + "}";
    }
}