package exam.honcoding;

public class Man {
    private int age;
    private String name;
   private boolean married;
   private int children;

   public void setMan(int age, String name, boolean married, int children){
       this.age = age;
       this.name = name;
       this.married = married;
       this.children = children;
   }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isMarried() {
        return married;
    }

    public int getChildren() {
        return children;
    }
}
