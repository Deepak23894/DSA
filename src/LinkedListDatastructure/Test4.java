package LinkedListDatastructure;

public class Test4 {
    public int romanToInt(String s) {
        int t = 0;
        for (int a = 0; a < s.length(); a++) {

            if (s.charAt(a) == 'I') {
                t = t + 1;
            } else if (s.charAt(a) == 'V') {
                t = t + 5;
            } else if (s.charAt(a) == 'X') {
                t = t + 10;

            } else if (s.charAt(a) == 'L') {
                t = t + 50;

            } else if (s.charAt(a) == 'C') {
                t = t + 100;

            } else if (s.charAt(a) == 'D') {
                t = t + 500;

            } else if (s.charAt(a) == 'M') {
                t = t + 1000;

            } else {
                return 0;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        System.out.println(t.romanToInt("MCMXCIV"));
    }
}
