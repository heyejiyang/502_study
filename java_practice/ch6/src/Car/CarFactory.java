package Car;

public class CarFactory {
   //차 만드는 공장
    private  CarFactory(){

    }

    private static CarFactory carFactory;

    public static CarFactory getInstance(){
        if(carFactory == null){
            carFactory = new CarFactory();
        }
        return carFactory;
    }
    public Car createCar(){
        return new Car();
    }
}
