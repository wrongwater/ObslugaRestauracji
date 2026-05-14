import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleUI {

    public void start() {

        Scanner scanner = new Scanner(System.in);

        OrderManager manager =
                new OrderManager();

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
                                    InvalidOrderException(
                                    "Niepoprawny numer stolika!"
                            );
                        }

                        Order order =
                                new Order(table);

                        System.out.println(
                                "Podaj jedzenie:");

                        String foodName =
                                scanner.nextLine();

                        Food food =
                                new Food(
                                        foodName,
                                        30,
                                        500
                                );

                        System.out.println(
                                "Podaj napoj:");

                        String drinkName =
                                scanner.nextLine();

                        Drink drink =
                                new Drink(
                                        drinkName,
                                        10,
                                        true
                                );

                        order.addProduct(food);
                        order.addProduct(drink);

                        manager.addOrder(order);

                        System.out.println(
                                "Dodano zamowienie!");

                    } catch (
                            InvalidOrderException e) {

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