package exam;

public class Taxi {

    int passengerCount;
    int money;

    public void take(int money){
        this.money = money;
        passengerCount++;
    }

    void showInfo(){
        System.out.println("택시의 승객은 "+ passengerCount+"명이고 수입은 "+ money+"입니다.");
    }


}
