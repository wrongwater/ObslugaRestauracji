import java.util.Objects;
//implementacja hierarchii dziedziczenia
public abstract class Produkt {

    private String nazwa;
    private double cena;

    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public abstract double obliczCena();

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return nazwa + " - " + cena + " zl";
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Produkt)) return false;

        Produkt produkt = (Produkt) o;

        return Objects.equals(nazwa, produkt.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa);
    }
}