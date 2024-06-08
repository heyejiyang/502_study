package practice.CardPrac;

public class Ex01 {
    public static void main(String[] args) {
        CardCompany card = CardCompany.getInstance();
        card.makeCard("홍길동").showInfo();

        card.makeCard("나이름").showInfo();

    }
}
