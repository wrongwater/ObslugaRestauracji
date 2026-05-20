//implementacja hierarchii dziedziczenia
public class Klient extends Osoba {

    private int stolNumer;

    public Klient(String nazwa, int stolNumer) {
        super(nazwa);
        this.stolNumer = stolNumer;
    }

    @Override
    public void showInfo() {
        System.out.println("Klient: " + getNazwa()
                + " | Stolik: " + stolNumer);
    }

    @Override
    public String toString() {
        return "Klient{nazwa='" + getNazwa()
                + "', stol=" + stolNumer + "}";
    }
}