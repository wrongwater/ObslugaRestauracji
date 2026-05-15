import java.util.Objects;

public abstract class Produkt {

    private String name;
    private double price;

    public Produkt(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double calculatePrice();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + price + " zl";
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Produkt)) return false;

        Produkt produkt = (Produkt) o;

        return Objects.equals(name, produkt.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}