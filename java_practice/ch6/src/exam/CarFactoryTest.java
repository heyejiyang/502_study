package exam;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar(); //시리얼 넘버 ++
        Car yourSonata = factory.createCar(); //시리얼 넘버 ++

        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());
    }
}
