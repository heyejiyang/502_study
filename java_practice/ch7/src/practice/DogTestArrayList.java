package practice;

import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("냥냥이","불독"));
        dogs.add(new Dog("푸푸","푸들"));
        dogs.add(new Dog("하양이","말티즈"));
        dogs.add(new Dog("금이","골든리트리버"));
        dogs.add(new Dog("삽살이","삽살개"));

        for(int i = 0; i< dogs.size(); i++){
            Dog d = dogs.get(i); //배열의 index 위치에 있는 요소 값을 반환
            System.out.println(d.showDogInfo());
        }

        System.out.println("-------------------");

        for(Dog dog : dogs){
            System.out.println(dog.showDogInfo());
        }

    }
}
