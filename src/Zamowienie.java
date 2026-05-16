import java.util.ArrayList;
import java.util.List;

public class Zamowienie
        implements Wyswietlane {

    private int stolNumer;

    private List<Produkt> produkty;

    private StatusZamowienia status;

    public Zamowienie(int stolNumer) {

        this.stolNumer = stolNumer;

        produkty = new ArrayList<>();

        status = StatusZamowienia.NOWE;
    }

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }

    public double obliczCalosc() {

        double total = 0;

        for(Produkt p : produkty) {
            total += p.obliczCena();
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
        return "Zamowienie{stol=" + stolNumer +
                ", status=" + status +
                ", total=" + obliczCalosc() + "}";
    }
}