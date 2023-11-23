package Recurssion;

public class BasicRecurssion {
    public static void fun1(int i)
    {
        if(i == 0)
        {
            return ;
        }
        System.out.println(i);
        fun1(i-1);
        System.out.println(i);
    }
    public static void fun2(int i)
    {
        if(i == 0)
        {
            return ;
        }

        fun2(i-1);
        System.out.print("-"+i);
        fun2(i-1);
        System.out.print("-"+i);
    }

    public static void main(String[] args) {
        //fun1(3);
        fun2(3);
    }
}
