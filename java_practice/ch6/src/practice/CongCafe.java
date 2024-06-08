package practice;

public class CongCafe {
    private static String MENU;
    private int money=0;

    private int totalPrice = 0;
    private int visitCustomer= 0;
    public void visit(String menu){
        MENU = menu;
        if(MENU.equals("아메리카노")){
            this.money += 3000;
        }
        else if(MENU.equals("라테")){
            this.money += 3800;
        }else if(MENU.equals("콩아이스크림")){
            this.money += 2500;
        }else {
            System.out.println("없는 음료입니다.");
            return;
        }
        totalPrice += money;
        visitCustomer++;
    }
    void showInfo(){
        if(money != 0){
            System.out.println("콩다방의 "+ MENU+"는 "+money+"원 입니다." );
            System.out.println("수입은 "+totalPrice+"이고 방문 고객은 "+visitCustomer+"명 입니다.");
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
