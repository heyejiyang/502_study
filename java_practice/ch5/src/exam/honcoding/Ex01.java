package exam.honcoding;

public class Ex01 {
    public static void main(String[] args) {
        Man m = new Man();
        m.setMan(40,"James",true,3);
        System.out.println(m.getAge());
        System.out.println(m.getName());
        System.out.println(m.isMarried());
        System.out.println(m.getChildren());
    }
}
