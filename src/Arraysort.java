import java.util.Arrays;
import java.util.Collections;

public class Arraysort {
    public static void f1() {
        int[] i = {4, 9, 1, 3, 2, 8, 7, 8, 6, 5};
        System.out.println("before sort" + Arrays.toString(i));
        Arrays.sort(i);
        System.out.println("before sort" + Arrays.toString(i));
        String[] fruits = {"orange", "grape","apple","lemon", "banana"};
        Arrays.sort(fruits, Collections.reverseOrder());
        System.out.println(fruits);

    }

    public static void main(String[] args) {
        f1();
    }
}
