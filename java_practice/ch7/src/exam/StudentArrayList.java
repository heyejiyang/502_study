package exam;

import java.util.ArrayList;

public class StudentArrayList {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1001,"James"));
        students.add(new Student(1002,"Tomas"));
        students.add(new Student(1003,"Edward"));

        for(Student student: students){
            student.showStudentInfo();
        }
    }


}
