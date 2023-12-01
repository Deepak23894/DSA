import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo
{
    public static void main(String[] args) {
        Queue<String> queue= new LinkedList<>();
        queue.offer("Java");
        queue.offer("selenium");
        queue.offer("Sql");
        queue.offer("DOcker");
        System.out.println(queue.peek());
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.poll();
            System.out.println("After  "+queue.peek());
        }
    }
}
