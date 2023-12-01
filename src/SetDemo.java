import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo
{
    public void HashsetDemo()
    {
        Set<Integer> hs = new HashSet<>();
        hs.add(18);
        hs.add(140);
        hs.add(89);
        hs.add(23);
        hs.add(25);
        hs.add(19);
        hs.add(19);
        System.out.println(hs);
        hs.remove(140);
        System.out.println(hs);
    }
    public void LinkedHashsetDemo()
    {
        Set<Integer> hs = new TreeSet<>();
        hs.add(18);
        hs.add(140);
        hs.add(89);
        hs.add(23);
        hs.add(25);
        hs.add(19);
        hs.add(19);
        System.out.println(hs);
        hs.remove(140);
        System.out.println(hs);
    }
    public void TreeSetDemo()
    {
        Set<Integer> hs = new LinkedHashSet<>();
        hs.add(18);
        hs.add(140);
        hs.add(89);
        hs.add(23);
        hs.add(25);
        hs.add(19);
        hs.add(19);
        System.out.println(hs);
        hs.remove(140);
        System.out.println(hs);
    }

    public static void main(String[] args) {
        SetDemo s= new SetDemo();
        System.out.println("Hash set");
        s.HashsetDemo();
        System.out.println("Tree set");
        s.LinkedHashsetDemo();
        System.out.println("LinkedHasSet set");
        s.TreeSetDemo();
    }
}
