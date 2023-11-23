package Recurssion;

public class Fibonachi {
    public static void main(String[] args) {
//        int n = 6;
//        for (int i = 0; i < n; i++) {
//            System.out.println(fibo(i));
//        }
        fibonacci(50);
    }

    static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    static void fibonacci (int N)
    {
        int n1=0;
        int n2=1;
        int counter = 0;
        while (counter<N)
        {
            System.out.println(n1);
            int n3= n1+n2;
            n1=n2;
            n2=n3;
            counter++;

        }
    }

}
class Test4
{
    private Test4 test = null;
    public Test4 getInstance()
    {
        if(test == null)
        {
            test = new Test4();
        }
        return test;
    }
}
