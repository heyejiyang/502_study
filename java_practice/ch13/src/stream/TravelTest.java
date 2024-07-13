package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer travelCustomer = new TravelCustomer("이순신",40,100);
        TravelCustomer travelCustomer1 = new TravelCustomer("홍길동",13,50);
        TravelCustomer travelCustomer2 = new TravelCustomer("김유신",20,100);

        List<TravelCustomer> list = new ArrayList<TravelCustomer>();
        list.add(travelCustomer);
        list.add(travelCustomer1);
        list.add(travelCustomer2);

        list.stream().map(x -> x.getName()).forEach(System.out::println);

        int total = list.stream().mapToInt(x -> x.getPrice()).sum();
        System.out.println(total);

        list.stream().filter(x -> x.getAge() >= 20).map(x -> x.getName()).sorted().forEach(System.out::println);
    }
}
