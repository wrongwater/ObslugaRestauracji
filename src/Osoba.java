//klasa abstrakcyjna
public abstract class Osoba {

    private String nazwa;

    public Osoba(String nazwa) {
        this.nazwa = nazwa;
    }
//getter
    public String getNazwa() {
        return nazwa;
    }
//metoda abstrakcyjna
    public abstract void showInfo();
}