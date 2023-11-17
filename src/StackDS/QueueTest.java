package StackDS;

public class QueueTest
{
    public static void main(String[] args) throws Exception {
        QueueDS q= new QueueDS();
        q.enqueue(50);
        q.enqueue(40);
        q.enqueue(30);
        q.enqueue(20);
        q.enqueue(10);
        q.display();
        q.dequeue();
        q.enqueue(10);
        q.display();



    }
}
