public abstract class Osoba {

    private String nazwa;

    public Osoba(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public abstract void showInfo();
}