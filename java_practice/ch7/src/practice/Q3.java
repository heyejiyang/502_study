package practice;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] numArr = new int[5];
        int j = 0;
        int sum = 0;

        for(int i = 1; i<=10; i++){
            if(i%2==0){
                numArr[j] = i;
                j++;
            }
        }

        for(int total : numArr){
            sum += total;
        }

        System.out.println(sum);


    }
}
