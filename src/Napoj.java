public class Napoj extends Produkt {

    private boolean zimny;

    public Napoj(String nazwa,
                 double cena,
                 boolean zimny) {

        super(nazwa, cena);
        this.zimny = zimny;
    }

    @Override
    public double obliczCena() {
        return getCena();
    }

    @Override
    public String toString() {
        return "Napoj{nazwa='" + getNazwa() +
                "', cena=" + getCena() + "}";
    }
}