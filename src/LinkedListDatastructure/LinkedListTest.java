package LinkedListDatastructure;

public class LinkedListTest {
    public static void main(String[] args) throws Exception {
        LinkedListImplementation l = new LinkedListImplementation();
        l.addFirst(90);
        l.addLast(80);
        l.addFirst(70);
        l.addAt(60,2);
        l.display();
        l.removeAt(2);
    }
}
