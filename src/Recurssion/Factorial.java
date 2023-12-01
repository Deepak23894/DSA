package Recurssion;

import java.util.Arrays;

public class Factorial {

    public static int digitsInFactorial(int N) {
        double sum = 0.0;
        for (int j = 1; j <= N; j++) {
            sum = sum + Math.log10(j);
        }
        return (int) (1 + Math.floor(sum));

    }

    public static void rotateArrayByOne(int array[], int n) {
        for (int j = 0; j < 3; j++) {
            int i, temp;
            temp = array[0];
            for (i = 0; i < n - 1; i++)
                array[i] = array[i + 1];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
//        System.out.println(digitsInFactorial(200));
        int array[] = { 11, 22, 33, 44, 55, 66, 77 };
        rotateArrayByOne(array,array.length);

    }
}
