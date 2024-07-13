package practice.q6;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("자바",19000));
        bookList.add(new Book("파이썬",34000));
        bookList.add(new Book("스프링",23000));

        int total = bookList.stream().mapToInt(x -> x.getPrice()).sum();
        System.out.println(total);

        bookList.stream().filter(x -> x.getPrice() >= 20000).map(x -> x.getName()).sorted().forEach(System.out::println);
    }
}
