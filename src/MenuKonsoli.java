import java.util.Scanner;

public class MenuKonsoli {

    public void start() {

        Scanner scanner = new Scanner(System.in);

        MenedzerZamowien manager =
                new MenedzerZamowien();

        boolean running = true;

        while(running) {

            System.out.println("\n=== MENU ===");
            System.out.println("1. Dodaj zamowienie");
            System.out.println("2. Pokaz zamowienia");
            System.out.println("3. Wyjdz");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {

                case 1:

                    try {

                        System.out.println(
                                "Podaj numer stolika:");

                        int table =
                                scanner.nextInt();

                        scanner.nextLine();

                        if(table <= 0) {

                            throw new
                                    WyjatekNiewlasciwegoZamowienia(
                                    "Niepoprawny numer stolika!"
                            );
                        }

                        Zamowienie zamowienie =
                                new Zamowienie(table);

                        System.out.println(
                                "Podaj jedzenie:");

                        String foodName =
                                scanner.nextLine();

                        Jedzenie jedzenie =
                                new Jedzenie(
                                        foodName,
                                        30,
                                        500
                                );

                        System.out.println(
                                "Podaj napoj:");

                        String drinkName =
                                scanner.nextLine();

                        Napoj napoj =
                                new Napoj(
                                        drinkName,
                                        10,
                                        true
                                );

                        zamowienie.addProduct(jedzenie);
                        zamowienie.addProduct(napoj);

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

                    running = false;

                    break;

                default:

                    System.out.println(
                            "Niepoprawna opcja");
            }
        }
    }
}