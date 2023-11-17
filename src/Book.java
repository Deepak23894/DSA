import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Book {
    String name;
    int isbn;
    int prize;

    public Book(String name, int isbn, int prize) {
        this.name = name;
        this.isbn = isbn;
        this.prize = prize;
    }

    public String toString() {
        return name + "  " + isbn + "  " + prize;
    }

//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Book b = (Book) o;
//        return isbn == b.isbn;
//    }
}

class SetCustomBookDemo {
    public static void main(String[] args) {
        Set<Book> s = new HashSet<>();
        s.add(new Book("C++", 1, 20));
        s.add(new Book("C++", 1, 120));
        s.add(new Book("Java", 1, 210));
        s.add(new Book("Python", 1, 230));
        System.out.println(s);


    }
}
