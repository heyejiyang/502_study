package exam;

public class StudentArray {
    public static void main(String[] args) {
        Student[] stu = new Student[3];
        stu[0] = new Student(1234,"김우스");
        stu[1] = new Student(1299,"나충전");
        stu[2] = new Student(5252, "박오이");

        for(int i = 0; i< stu.length; i ++){
            stu[i].showStudentInfo();
        }


    }


}
