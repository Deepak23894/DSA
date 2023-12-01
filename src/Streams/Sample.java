package Streams;

public class Sample {
    Lamda4 o = () -> System.out.println("Hello world");
    Lamda1 doubleNumberFunction = (a) -> a*2;
    Mylamda2 safeDivideFunction = ( a,b) -> {
        if (b == 0)
            return 0;
        return a / b;
    };
    public void grs(Greeter g)
    {
        g.perform();
    }


    public static void main(String[] args) {
        Sample s = new Sample();
        s.grs(new Greeter());
        s.o.greet();
        System.out.println(s.doubleNumberFunction.doublefun(10));
        Lamda4 g = () -> System.out.println("Good evening");
        g.greet();
        Lamda4 a = new Lamda4() {
            @Override
            public void greet() {
                System.out.println("Good Afternoon");
            }
        };
        a.greet();
        Mylamda2 lab = new Mylamda2() {

            @Override
            public int safeDivideFunction(int a, int b) {
                return a*b;
            }
        };
    }
}


interface Mylamda2 {
    public int safeDivideFunction(int a, int b);
}