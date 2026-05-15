public class Klient extends Osoba {

    private int tableNumber;

    public Klient(String name, int tableNumber) {
        super(name);
        this.tableNumber = tableNumber;
    }

    @Override
    public void showInfo() {
        System.out.println("Klient: " + getName()
                + " | Stolik: " + tableNumber);
    }

    @Override
    public String toString() {
        return "Klient{name='" + getName()
                + "', table=" + tableNumber + "}";
    }
}