import java.util.Comparator;

public class KomparatorNazwProduktow
        implements Comparator<Produkt> {

    @Override
    public int compare(Produkt p1,
                       Produkt p2) {

        return p1.getNazwa()
                .compareTo(p2.getNazwa());
    }
}