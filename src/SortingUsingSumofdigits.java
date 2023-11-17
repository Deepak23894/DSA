import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingUsingSumofdigits
{
    public static int  getSum(int i)
    {
        if(i < 10)
            return i;
        int temp = 0;
        while(i>0)
        {
            temp = temp + i%10;
            i = i / 10;
        }
        return temp;
    }

    public static void main(String[] args) {
        SortingUsingSumofdigits d= new SortingUsingSumofdigits();
        System.out.println(d.getSum(1));
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(43);
        l1.add(33);
        l1.add(63);
        l1.add(83);
        l1.add(493);
        l1.add(3);
        Collections.sort(l1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o2-o1);
            }
        });
        System.out.println(l1);
        Collections.sort(l1, ((o1, o2) ->(getSum(o1)-getSum(o2))));
        System.out.println(l1);
    }
}
