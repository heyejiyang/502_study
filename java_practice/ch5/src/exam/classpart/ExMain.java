package exam.classpart;

public class ExMain {
    public static void main(String[] args) {
        Student studentAhn = new Student();
        studentAhn.studentName="냥이름";
        System.out.println(studentAhn.studentName);
        studentAhn.setStudentName("장이름");
        System.out.println(studentAhn.getStudentName());
    }
}
