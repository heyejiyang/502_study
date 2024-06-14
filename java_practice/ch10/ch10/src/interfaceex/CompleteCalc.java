package interfaceex;

public class CompleteCalc extends Calculator{

    @Override
    public int times(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        if(b==0){
            return ERROR;
        }
        return a / b;
    }

    @Override
    public int square(int a) {
        return a * a;
    }

    public void showInfo(){
        System.out.println("Calc구현 완료");
    }
}
