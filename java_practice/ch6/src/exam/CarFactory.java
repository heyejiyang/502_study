package exam;

public class CarFactory {
    //싱글톤패턴 구현
    private CarFactory() {}

    public static CarFactory instance;

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar(){
        Car c1 = new Car();
        return c1;
    }


}
