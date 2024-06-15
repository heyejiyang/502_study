package Car;

public class Car {
    // 차 번호부여
    private static int CARNUM = 1000;
    int carN = 0;
    public Car(){
        carN = CARNUM++;
    }
    public int getCarnum() {
        return carN;
    }
}
