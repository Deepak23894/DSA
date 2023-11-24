package LinkedListDatastructure;

public class Test1
{
    public void eat()
    {
        System.out.println("a");
    }
}
class Test2 extends Test1
{
    public void l4()
    {
    }
}
class Test3 extends Test2
{
    public void l2()
    {
        eat();
    }

    public static void main(String[] args) {
        Test3 r=new Test3();
        r.l2();
    }
}
