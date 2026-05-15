import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MenedzerZamowien {

    private List<Zamowienie> zamowienia;

    public MenedzerZamowien() {
        zamowienia = new ArrayList<>();
    }

    public void addOrder(Zamowienie zamowienie) {

        zamowienia.add(zamowienie);

        Restauracja.incrementOrders();
    }

    public void showOrders() {

        for(Zamowienie zamowienie : zamowienia) {
            zamowienie.display();
        }
    }

    public void sortFoods(List<Jedzenie> jedzenia) {

        Collections.sort(jedzenia);

        System.out.println("Sortowanie Comparable:");

        for(Jedzenie jedzenie : jedzenia) {
            System.out.println(jedzenie);
        }
    }

    public void sortProducts(List<Produkt> produkty) {

        produkty.sort(new KomparatorNazwProduktow());

        System.out.println("Sortowanie Comparator:");

        for(Produkt p : produkty) {
            System.out.println(p);
        }
    }
}