package p_exception;

public class IDFormatTest {
    private String userID;
    public String getUserID(){
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException{
        if(userID == null){
            throw new IDFormatException("아이디는 null일 수 없습니다."); //강제로 사용자예외발생시킴
        }else if(userID.length() <8 || userID.length()>20){
            throw new IDFormatException("아이디는 8자이상 20자 이하로 쓰세요."); //강제 예외발생
        }
        this.userID = userID;
    }

    public static void main(String[] args) {
        IDFormatTest test = new IDFormatTest();

        String userID = null;
        try{ //아이디가 null일때
            test.setUserID(userID);
        }catch (IDFormatException e){
            System.out.println(e.getMessage());
        }
        userID = "1234";
        try {
            test.setUserID(userID);
        }catch (IDFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
