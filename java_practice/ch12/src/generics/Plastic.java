package generics;

public class Plastic extends Material {

    @Override
    public void doPrinting(){
        System.out.println("Plastic재료로 출력합니다.");
    }
    public String toString(){
        return "재료는 Plastic입니다.";
    }

}
