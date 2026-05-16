public class Restauracja {

    public static final String NAZWA =
            "Restauracja";

    private static int orderCounter = 0;

    public static void incrementOrders() {
        orderCounter++;
    }

    public static int getOrderCounter() {
        return orderCounter;
    }
}