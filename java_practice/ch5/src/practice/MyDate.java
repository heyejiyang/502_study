package practice;

/*
* 책에 boolean자료형으로 내놓고서 String으로 했길래 다시 생각하고 품.
* boolean으로 도저히 할 수가 없었다. 문제를 제대로 써놨어야지...
* 윤년 계산법도 찾아봄
* 평년 -> 100으로 나누어 떨어지고, 400으로 나누어떨어지지 않는 해
* 윤년 -> 4로 나누어 떨어지는 해
* */
public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean isValid = true;


    public MyDate(int day, int month, int year){
        setYear(year);
        setMonth(month);
        setDay(day);
    }
    public String isValid(){
        //날짜가 유효한지 확인
        if(isValid){
            return "유효한 날짜 입니다.";
        }else{
            return  "유효하지 않은 날짜입니다.";
        }
    }
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if(day > 31){
            isValid = false;
        }
        if(month == 2){
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                //윤년 2월은 29일까지
                if(day > 29){
                    isValid = false;
                }
            }else {//평년 2월 28일까지
                if (day >28){
                    isValid = false;
                }
            }
        }else if( month == 4 || month ==6 || month ==9 || month ==11){
            if (day>30){
                isValid = false;
            }
        }
    }

    public void setMonth(int month) {
        this.month = month;

        if(month > 12 || month <1){
            isValid = false;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }
}
