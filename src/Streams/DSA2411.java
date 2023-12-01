package Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DSA2411 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList();
        l.add(7);
        l.add(13);
        l.add(9);
        l.add(21);
        l.add(82);
        l.add(11);
        l.add(56);
        l.add(71);
        System.out.println(l.stream().max(Integer::compare).get());
        System.out.println(l.stream().min(Integer::compare).get());
        System.out.println();
        l.forEach((n) -> System.out.print(" " + n));
        System.out.println();
        l.stream().sorted().forEach((n) -> System.out.print(" " + n));
        List<Integer> ls = l.stream().filter((n) -> (n % 3) == 0).collect(Collectors.toList());
        ls.forEach((n) -> System.out.println(n));

    }
}
