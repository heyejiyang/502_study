package exam.arrayList;

public class Subject {

    private String name; //과목이름
    private int score; //과목 점수


    public Subject(String name, int score){
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
