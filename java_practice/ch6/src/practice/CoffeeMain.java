package practice;
/*
* 고객
* - 가진 돈, 이름, 선택 메뉴
* - 남은 돈 출력
* 카페
* - 카페 메뉴, 음료 가격, 총 수입,
* - 총 수입 출력
* 메인
* - 고객, 선택 메뉴 전달
* */

public class CoffeeMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer("나홍길","라테",8000);
        StarCafe sc = new StarCafe();
        customer1.visitStarcafe(sc);
        customer1.showInfo();
        sc.showInfo();

        Customer customer2 = new Customer("김토익","콩아이스크림",10000);
        CongCafe cc = new CongCafe();
        customer2.visitCongcafe(cc);
        customer2.showInfo();
        cc.showInfo();

    }
}
