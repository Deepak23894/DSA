package Recurssion;

public class Test1 {
    static int power(int N, int R) {
        if (R == 0)
            return 1;
        if (R == 1)
            return N;
        int result = power(N, R / 2)  ;
        result = (result*result);
        if (R % 2 != 0) {
            result =(N * result);
        }
        return result;
    }

    public static long rev(long n) {
        long rev_num = 0;
        while (n > 0) {
            rev_num = rev_num * 10 + n % 10;
            n = n / 10;
        }
        return rev_num;
    }

    public static void main(String[] args) {
        int N = 2;
        int R = 12;
        int ans = power(N, R) ;
        System.out.println(ans);
    }

}
