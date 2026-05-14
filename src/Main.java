import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ConsoleUI ui =
                new ConsoleUI();

        ui.start();

        // ===== TABLICE =====

        String[] foods = {
                "Pizza",
                "Burger",
                "Pasta"
        };

        int[] tables = {1,2,3};

        Drink[] drinks =
                new Drink[2];

        // ===== OBIEKTY =====

        Food f1 =
                new Food("Pizza",35,800);

        Food f2 =
                new Food("Burger",25,600);

        Drink d1 =
                new Drink("Cola",10,true);

        Drink d2 =
                new Drink("Tea",8,false);

        Employee e1 =
                new Employee("Jan","Kelner");

        Employee e2 =
                new Employee("Adam","Kucharz");

        Customer c1 =
                new Customer("Kamil",1);

        Customer c2 =
                new Customer("Ola",2);

        Table t1 = new Table(1);
        Table t2 = new Table(2);

        // ===== UPCASTING =====

        Product product =
                new Food("Steak",50,900);

        // ===== DOWNCASTING =====

        if(product instanceof Food) {

            Food food =
                    (Food) product;

            System.out.println(
                    food.getName());
        }

        // ===== SORTOWANIE =====

        List<Food> foodList =
                new ArrayList<>();

        foodList.add(f1);
        foodList.add(f2);

        OrderManager manager =
                new OrderManager();

        manager.sortFoods(foodList);

        List<Product> products =
                new ArrayList<>();

        products.add(f1);
        products.add(d1);

        manager.sortProducts(products);

        // ===== METODA GENERYCZNA =====

        Utils.printList(products);

        // ===== WYWOŁANIA =====

        e1.showInfo();
        c1.showInfo();

        System.out.println(
                Restaurant.NAME);

        System.out.println(
                Restaurant.getOrderCounter());
    }
}