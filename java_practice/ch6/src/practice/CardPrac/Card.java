package practice.CardPrac;

public class Card {
    public static int SERIALNUM = 1234;
    public int CardID;
    private String name;
    public Card(){
        SERIALNUM++;
        CardID = SERIALNUM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showInfo(){
        System.out.println(getName()+"님의 카드번호는 "+ Card.SERIALNUM+"입니다.");
    }

}
