package collection.arraylist;

import collection.Member;
import collection.exception.MemberException;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();
        try {
            memberArrayList.addMember(new Member(1001, "이지원"));
            memberArrayList.addMember(new Member(1002, "손흥민"));
            memberArrayList.addMember(new Member(1003, "박하사탕"));
            memberArrayList.addMember(new Member(1004, "홍길동"));
            //동일 아이디 추가시 에러처리
//            memberArrayList.addMember(new Member(1001, "나지원"));
            memberArrayList.insertMember(new Member(999,"은하철"),0);
        } catch (MemberException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        //전체회원출력
        memberArrayList.showAllMember();
        memberArrayList.removeMember(1002);

    }
}
