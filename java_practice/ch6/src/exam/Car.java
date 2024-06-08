package exam;

public class Car {

    static int SERIALNUM = 10000;
    int carNum;

    public Car(){
        SERIALNUM++;
        this.carNum = SERIALNUM;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

}
