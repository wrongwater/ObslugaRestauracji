import java.util.Scanner;

public class MenuKonsoli {

    public void start() {

        Scanner scanner = new Scanner(System.in);

        MenedzerZamowien manager =
                new MenedzerZamowien();

        boolean konsolaaktywowana = true;

        while(konsolaaktywowana) {

            System.out.println("\n=== MENU ===");
            System.out.println("1. Dodaj zamowienie");
            System.out.println("2. Pokaz zamowienia");
            System.out.println("3. Wyjdz");

            int wybor = scanner.nextInt();
            scanner.nextLine();

            switch(wybor) {

                case 1:

                    try {

                        System.out.println(
                                "Podaj numer stolika:");

                        int stol =
                                scanner.nextInt();

                        scanner.nextLine();

                        if(stol <= 0) {

                            throw new
                                    WyjatekNiewlasciwegoZamowienia(
                                    "Niepoprawny numer stolika."
                            );
                        }

                        Zamowienie zamowienie =
                                new Zamowienie(stol);

                        System.out.println(
                                "Podaj jedzenie:");

                        String jedzenieNazwa =
                                scanner.nextLine();

                        Jedzenie jedzenie =
                                new Jedzenie(
                                        jedzenieNazwa,
                                        30,
                                        500
                                );

                        System.out.println(
                                "Podaj napoj:");

                        String napojNazwa =
                                scanner.nextLine();

                        Napoj napoj =
                                new Napoj(
                                        napojNazwa,
                                        10,
                                        true
                                );

                        zamowienie.dodajProdukt(jedzenie);
                        zamowienie.dodajProdukt(napoj);

                        manager.addOrder(zamowienie);

                        System.out.println(
                                "Dodano zamowienie!");

                    } catch (
                            WyjatekNiewlasciwegoZamowienia e) {

                        System.out.println(
                                e.getMessage());

                    }

                    break;

                case 2:

                    manager.showOrders();

                    break;

                case 3:

                    konsolaaktywowana = false;

                    break;

                default:

                    System.out.println(
                            "Niepoprawna opcja");
            }
        }
    }
}