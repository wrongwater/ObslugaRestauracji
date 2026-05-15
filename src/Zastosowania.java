import java.util.List;

public class Zastosowania {

    public static <T> void printList(
            List<T> list) {

        for(T element : list) {
            System.out.println(element);
        }
    }
}