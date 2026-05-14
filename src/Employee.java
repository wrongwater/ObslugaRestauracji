public class Employee extends Person {

    private String position;

    public Employee(String name, String position) {
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
        return "Employee{name='" + getName() +
                "', position='" + position + "'}";
    }
}