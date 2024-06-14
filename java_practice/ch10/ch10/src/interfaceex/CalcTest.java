package interfaceex;

public class CalcTest {
    public static void main(String[] args) {
        CompleteCalc c = new CompleteCalc();
        c.showInfo();
        System.out.println(c.add(1,2));
        System.out.println(c.div(2,0));
        System.out.println(c.sub(10,2));
        System.out.println( c.times(4,5));
        System.out.println( c.square(5));

    }
}
