package exam.classpart;

public class Student {
    int studentID; //학번
    String studentName; //이름
    int grade; //학년
    String address;//주소

    public void showStudentInfo(){
        System.out.println(studentName + ", "+ address);
    }
}
