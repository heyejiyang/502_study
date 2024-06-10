package practice;

public class Q4 {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];

        dogs[0] = new Dog("누렁이","푸들");
        dogs[1] = new Dog("해피","시츄");
        dogs[2] = new Dog("코코","말티즈");
        dogs[3] = new Dog("퍼피","포메라니안");
        dogs[4] = new Dog("루루","진돗개");

        for(int i= 0; i< dogs.length; i++){
            System.out.println( dogs[i].showDogInfo());
        }

        System.out.println("----------------------");

        for(Dog d : dogs){
            System.out.println(d.showDogInfo());

        }

    }
}
