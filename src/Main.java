import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MenuKonsoli ui =
                new MenuKonsoli();

        ui.start();

        // ===== TABLICE =====

        String[] foods = {
                "Pizza",
                "Burger",
                "Pasta"
        };

        int[] tables = {1,2,3};

        Napoj[] napoje =
                new Napoj[2];

        // ===== OBIEKTY =====

        Jedzenie f1 =
                new Jedzenie("Pizza",35,800);

        Jedzenie f2 =
                new Jedzenie("Burger",25,600);

        Napoj d1 =
                new Napoj("Cola",10,true);

        Napoj d2 =
                new Napoj("Tea",8,false);

        Pracownik e1 =
                new Pracownik("Jan","Kelner");

        Pracownik e2 =
                new Pracownik("Adam","Kucharz");

        Klient c1 =
                new Klient("Kamil",1);

        Klient c2 =
                new Klient("Ola",2);

        Stol t1 = new Stol(1);
        Stol t2 = new Stol(2);

        // ===== UPCASTING =====

        Produkt produkt =
                new Jedzenie("Steak",50,900);

        // ===== DOWNCASTING =====

        if(produkt instanceof Jedzenie) {

            Jedzenie jedzenie =
                    (Jedzenie) produkt;

            System.out.println(
                    jedzenie.getName());
        }

        // ===== SORTOWANIE =====

        List<Jedzenie> jedzenieList =
                new ArrayList<>();

        jedzenieList.add(f1);
        jedzenieList.add(f2);

        MenedzerZamowien manager =
                new MenedzerZamowien();

        manager.sortFoods(jedzenieList);

        List<Produkt> produkty =
                new ArrayList<>();

        produkty.add(f1);
        produkty.add(d1);

        manager.sortProducts(produkty);

        // ===== METODA GENERYCZNA =====

        Zastosowania.printList(produkty);

        // ===== WYWOŁANIA =====

        e1.showInfo();
        c1.showInfo();

        System.out.println(
                Restauracja.NAME);

        System.out.println(
                Restauracja.getOrderCounter());
    }
}