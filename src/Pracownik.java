public class Pracownik extends Osoba {

    private String position;

    public Pracownik(String name, String position) {
        super(name);
        this.position = position;
    }

    @Override
    public void showInfo() {
        System.out.println("Pracownik: " + getName()
                + " | Stanowisko: " + position);
    }

    @Override
    public String toString() {
        return "Pracownik{name='" + getName() +
                "', position='" + position + "'}";
    }
}