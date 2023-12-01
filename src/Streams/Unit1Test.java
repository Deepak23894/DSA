package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1Test {
    public static void printConditionally(List<Person> l2, Predicate<Person> c) {
        for (Person k : l2) {
            if (c.test(k))
                System.out.println(k);

        }
    }

    public static void main(String[] args) {
        List<Person> l1 = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );
        Collections.sort(l1);

        for (Person k1 : l1) {
            System.out.println(k1.toString());
        }
        System.out.println();

        Collections.sort(l1, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        for (Person k1 : l1) {
            System.out.println(k1.toString());
        }
        System.out.println();
        Collections.sort(l1, (p1, p2) -> p1.getEmpNum() - p2.getEmpNum());

        for (Person k1 : l1) {
            System.out.println(k1.toString());
        }
        printConditionally(l1,  p ->p.getFirstName().startsWith("L") );

    }
}


