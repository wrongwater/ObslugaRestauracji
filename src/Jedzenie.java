//implementacja hierarchii dziedziczenia
public class Jedzenie extends Produkt
        implements Comparable<Jedzenie> {

    private int kalorie;

    public Jedzenie(String nazwa,
                    double cena,
                    int kalorie) {

        super(nazwa, cena);
        this.kalorie = kalorie;
    }

    @Override
    public double obliczCena() {
        return getCena();
    }

    @Override
    public int compareTo(Jedzenie other) {
        return Double.compare(
                this.getCena(),
                other.getCena()
        );
    }
//nadpisanie metody toString
    @Override
    public String toString() {
        return "Jedzenie{nazwa='" + getNazwa() +
                "', cena=" + getCena() + "}";
    }
}