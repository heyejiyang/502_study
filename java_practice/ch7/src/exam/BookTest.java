package exam;

import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
       // Book[] library = new Book[5];

//        library[0] = new Book("태백산맥","조정래");
//        library[1] = new Book("데미안","헤르만 헤세");
//        library[2] = new Book("어떻게 살 것인가","유시민");
//        library[3] = new Book("토지","박경리");
//        library[4] = new Book("백야행","히가시노 게이고");

        library.add(new Book("태백산맥", "조정래"));
        library.add(new Book("데미안","헤르만 헤세"));
        library.add(new Book("어떻게 살 것인가","유시민"));
        library.add(new Book("토지","박경리"));
        library.add(new Book("백야행", "히가시노 게이고"));

        for(int i = 0; i< library.size(); i++){
//            library[i].showInfo();
            Book book = library.get(i);
            book.showInfo();
        }
        System.out.println("__향상된 for문__");
//        for(int i = 0; i< library.size(); i++){
//            System.out.println(library[i]);
//        }
        for(Book book:library){
            book.showInfo();
        }
    }
}
