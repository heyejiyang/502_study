package exam.arrayList;

import java.util.ArrayList;

public class Student {

    private String studentName;
    private int studentId;
    ArrayList<Subject> subjects = new ArrayList<>();

    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
        subjects = new ArrayList<>(); //ArrayList 생성하기
    }

    public void addSubject(String name, int score){
        subjects.add(new Subject(name,score));
    }
    public void showStudentInfo(){
        int total = 0;
        for(Subject subject : subjects){
            System.out.println("학생 "+studentName+"의 "+subject.getName()+"과목 성적은 "+subject.getScore()+"입니다.");
            total += subject.getScore();
        }
        System.out.println("학생 "+studentName+"의 총점은 "+total+"입니다.");
    }
}
