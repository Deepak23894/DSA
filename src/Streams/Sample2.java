package Streams;

public class Sample2
{
    int add(int  a, int b, Mylamda2 m)
    {
       return m.safeDivideFunction(a,b);
    }
    public static void main(String[] args) {
      Sample2 s = new Sample2();
      Mylamda2 m = (a,b) -> a+b;
      Mylamda2 m1 = (a,b) -> a-b;

        System.out.println(s.add(10,20, (a,b) -> a+b));
        System.out.println(s.add(10,20, (a,b) -> a-b));

    }
}
