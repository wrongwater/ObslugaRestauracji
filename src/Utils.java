import java.util.List;

public class Utils {

    public static <T> void printList(
            List<T> list) {

        for(T element : list) {
            System.out.println(element);
        }
    }
}