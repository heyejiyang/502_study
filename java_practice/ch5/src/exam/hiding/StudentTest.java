package exam.hiding;

import exam.classpart.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student studentNm = new Student();
        studentNm.setStudentName("냥냥이");
        System.out.println(studentNm.getStudentName());
    }
}
