package p_exception;

public class PasswordTest {

    private String pw;

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) throws PasswordException{
        if(pw == null){
            throw new PasswordException("비밀번호는 null일 수 없습니다.");
        }else if(pw.length()<5){
            throw new PasswordException("비밀번호는 5자 이상입니다.");
        }else if(pw.matches("[a-zA-Z]+")){
            throw new PasswordException("비밀번호는 문자열로만 이루어질 수 없습니다.");
        }
        this.pw = pw;
    }
    public static void main(String[] args) {
        PasswordTest test = new PasswordTest();
        String pw = null;
        try {
            test.setPw(pw);
        }catch (PasswordException e){
            System.out.println(e.getMessage());
        }
        pw = "abcdefg";
        try{
            test.setPw(pw);
        }catch (PasswordException e){
            System.out.println(e.getMessage());
        }
        pw = "1b2";
        try {
            test.setPw(pw);
        }catch (PasswordException e){
            System.out.println(e.getMessage());
        }

    }
}
