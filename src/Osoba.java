public abstract class Osoba {

    private String name;

    public Osoba(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void showInfo();
}