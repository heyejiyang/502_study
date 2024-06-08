package exam;

public class Ex01 {
    public static void main(String[] args) {
        Student st1 = new Student("James",5000);
        Student st2 = new Student("Tomas",10000);
        Student st3 = new Student("Edward",10000);

        Bus bus100 = new Bus(100);
        st1.takeBus(bus100);
        st1.showInfo();
        bus100.showInfo();

        Subway sb1 = new Subway("2호선");
        st2.takeSubway(sb1);
        st2.showInfo();
        sb1.showInfo();

        Taxi t1 = new Taxi();
        st3.takeTaxi(t1);
        st3.showInfo();
        t1.showInfo();
    }
}
