public class Restaurant {

    public static final String NAME =
            "Restauracja";

    private static int orderCounter = 0;

    public static void incrementOrders() {
        orderCounter++;
    }

    public static int getOrderCounter() {
        return orderCounter;
    }
}