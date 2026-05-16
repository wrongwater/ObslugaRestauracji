public class Pracownik extends Osoba {

    private String pozycja;

    public Pracownik(String nazwa, String pozycja) {
        super(nazwa);
        this.pozycja = pozycja;
    }

    @Override
    public void showInfo() {
        System.out.println("Pracownik: " + getNazwa()
                + " | Stanowisko: " + pozycja);
    }

    @Override
    public String toString() {
        return "Pracownik{nazwa='" + getNazwa() +
                "', pozycja='" + pozycja + "'}";
    }
}