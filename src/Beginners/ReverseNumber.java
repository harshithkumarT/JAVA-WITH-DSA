package Beginners;

import static java.lang.Integer.parseInt;

public class ReverseNumber {
    public static int reverseDigits(int n) {
        // Code here
        StringBuilder reversedNumber = new StringBuilder();
        while(n >0 ){
            int lastDigit = n %10;
            if(lastDigit!=0){
                reversedNumber.append(lastDigit);
            }
            n /=10;
        }
        return  Integer.parseInt(reversedNumber.toString());
    }
    public  static void main(String[]args){
        int n = 200;
        int ans = reverseDigits(n);
        System.out.println(ans);
    }
}
