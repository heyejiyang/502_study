package practice;

public class Customer {
    private String name;
    private int money;
    private String ChoiceMenu;

    public Customer(String name, String choiceMenu,int money){
        this.name = name;
        this.ChoiceMenu = choiceMenu;
        this.money = money;
    }
    public void visitStarcafe(StarCafe starCafe){
        starCafe.visit(ChoiceMenu);
        this.money -= starCafe.getMoney();
    }
    public void visitCongcafe(CongCafe congCafe){
        congCafe.visit(ChoiceMenu);
        this.money -=congCafe.getMoney();
    }

    void showInfo(){
        System.out.println(name+"이 "+ChoiceMenu+"를 골랐고 남은 금액은 "+ money+"입니다.");
    }

}
