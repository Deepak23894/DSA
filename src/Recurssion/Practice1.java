package Recurssion;

public class Practice1
{
    public static int fun1(int n)
    {
        if(n==1)
            return 0;
        else
            return 1+fun1(n/2);
    }
    public static void fun2(int n)
    {
        if(n==0)
            return ;
       fun2(n/2);
        System.out.println(n%2);
    }
    public static void printNtoOne(int n)
    {
        if(n == 0)
            return;
        System.out.println(n);
        printNtoOne(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        //fun2(7);
        printNtoOne(5);
    }
}
