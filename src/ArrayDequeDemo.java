import java.util.ArrayDeque;

public class ArrayDequeDemo
{
    public static void main(String[] args) {
        ArrayDeque<String> a1 = new ArrayDeque<>();
        a1.offer("e");
        a1.offerFirst("e");
        a1.offerLast("p");
        a1.offerFirst("D");
        a1.offerLast("u");
        System.out.println(a1);

    }

}
