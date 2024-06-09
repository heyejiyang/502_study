package practice;

public class Q2 {
    public static void main(String[] args) {
        char[] alpahabets = new char[26];
        char ch = 'a'; //97

        for(int i = 0; i< alpahabets.length; i++, ch++){ //소문자 알파벳을 alpahabets 배열에 채움
            alpahabets[i] = ch;
        }
        for(int i=0; i<alpahabets.length; i++){ //소문자를 대문자로 변환
            //char형태 int와 연산시 자동으로 int형번환되서 계산됨
            alpahabets[i] = (char)( alpahabets[i] - 32); //a의 경우 a(97) - 32 -> 65 -> char로 변환하면 A
        }
        for (int i = 0; i< alpahabets.length;i++){
            System.out.println(alpahabets[i]+", "+(int)alpahabets[i]);
        }
    }
}
