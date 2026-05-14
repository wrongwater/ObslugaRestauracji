public class Table {

    private int number;

    public Table(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Table{number=" + number + "}";
    }
}