package Car;

public class CarMain {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();
        System.out.println(mySonata.getCarnum());
        System.out.println(yourSonata.getCarnum());
    }
}
