package collection;

public class Member {

    private int memberId; //회원아이디
    private String memberName; //회원이름

    public Member(int memberId,String memberName){//아이디와 이름 받아올 생성자
        this.memberId = memberId;
        this.memberName = memberName;
    }
    public int getMemberId(){
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() { //toString메서드 재정의
        return memberName+"회원님의 아이디는 "+ memberId+"입니다.";
    }
}
