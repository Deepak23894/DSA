package Recurssion;

import java.util.ArrayList;

public class CountDigits {
    public static void main(String[] args) {
//        int n = 23456789;
//        int count =0;
//        while(n>0)
//        {
//            int rem = n%10;
//            count++;
//            n= n/10;
//        }
//        System.out.println(count);
//        System.out.println(cToF(32));
//        System.out.println(reverseNum(28479));
        System.out.println(quadraticRoots(-264, -750, 504));
    }


    public static double cToF(int C) {
        double f = ((C * 9) / 5) + 32;
        return f;
    }

    public static int reverseNum(int C) {
        int num = 0;
        while (C > 0) {
            int rem = C % 10;
            C /= 10;
            num = num * 10 + rem;
        }
        return num;
    }

    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        int b2 = (b * b) - (4 * a * c);
        int x, y;
        ArrayList<Integer> a1 = new ArrayList<>();
        if (b2 > 0) {
            x = (int) Math.floor((-b - (Math.sqrt(b2))) / (2 * a));
            y = (int) Math.floor((-b + (Math.sqrt(b2))) / (2 * a));
            if (x > y) {
                a1.add(x);
                a1.add(y);
            }
            else{
            a1.add(y);
            a1.add(x);
            }
        }
        else if (b2==0)
        {
            x=y= -b/(2*a);
            a1.add(x);
            a1.add(y);
        }
        else {
            a1.add(-1);
        }

        return a1;

    }
}


