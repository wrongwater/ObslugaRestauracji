public class Customer extends Person {

    private int tableNumber;

    public Customer(String name, int tableNumber) {
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
        return "Customer{name='" + getName()
                + "', table=" + tableNumber + "}";
    }
}