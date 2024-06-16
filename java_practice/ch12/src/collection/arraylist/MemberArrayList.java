package collection.arraylist;

import collection.Member;
import collection.exception.MemberException;

import java.util.ArrayList;

/**
 * ArrayList 활용하여 회원 관리 프로그램 구현하기
 */
public class MemberArrayList {

    private ArrayList<Member> arrayList;//arrayLis는 Member형임

    public MemberArrayList(){
        arrayList = new ArrayList<>();
    }
    //회원 추가 메서드
    public void addMember(Member member) throws MemberException {
        for(int i=0;i<arrayList.size();i++){
            Member member1 = arrayList.get(i);
            if(member.getMemberId() == member1.getMemberId()){
                throw new MemberException("이미 등록된 아이디 입니다.");
            }
        }
        arrayList.add(member); //매개변수로 전달된 회원은 ArrayList의 맨뒤에 추가된다.
    }

    //회원 삭제 메서드
    public boolean removeMember(int memberId) { //매개변수로 전달받은 아이디 회원을 ArrayList에서 찾아서 제거한다.
        /**
         * get메서드로 회원을 순차적으로 가져옴, 회원 아이디가 매개변수와 일치하면 해당 회원 삭제
         */
        for(int i = 0; i< arrayList.size(); i++){
            Member member = arrayList.get(i); //get 메서드는 순차 관리하는 배열에서 사용하는 메서드, 매개변수 i에 해당하는 객체를 ArrayList에 반환해준다.
            if(memberId == member.getMemberId()){
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId+"아이디가 존재하지 않습니다.");
        return false;
    }

    //전체 회원 출력 메서드
    public void showAllMember(){
        for(Member member:arrayList){
            System.out.println(member);
        }
        System.out.println();
    }

    //특정위치에 회원추가
    public void insertMember(Member member,int index) throws MemberException{
        for(int i=0;i<arrayList.size();i++){
            Member member1 = arrayList.get(i);
            if(member.getMemberId() == member1.getMemberId()){
                throw new MemberException("이미 등록된 아이디 입니다.");
            }
        }
        arrayList.add(index,member);
    }
}
