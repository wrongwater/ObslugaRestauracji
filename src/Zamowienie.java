import java.util.ArrayList;
import java.util.List;

public class Zamowienie
        implements Wyswietlane {

    private int tableNumber;

    private List<Produkt> produkty;

    private StatusZamowienia status;

    public Zamowienie(int tableNumber) {

        this.tableNumber = tableNumber;

        produkty = new ArrayList<>();

        status = StatusZamowienia.NEW;
    }

    public void addProduct(Produkt produkt) {
        produkty.add(produkt);
    }

    public double calculateTotal() {

        double total = 0;

        for(Produkt p : produkty) {
            total += p.calculatePrice();
        }

        return total;
    }

    @Override
    public void display() {

        System.out.println(this);

        for(Produkt p : produkty) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "Zamowienie{table=" + tableNumber +
                ", status=" + status +
                ", total=" + calculateTotal() + "}";
    }
}