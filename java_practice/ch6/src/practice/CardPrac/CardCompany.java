package practice.CardPrac;

public class CardCompany {
    private CardCompany(){}
    public static CardCompany instance;

    public static CardCompany getInstance(){
        if(instance == null){
            instance = new CardCompany();
        }
        return instance;
    }

    public Card makeCard(String name){
        Card card = new Card();
        card.setName(name);
        return card;
    }
}
