package Beginners;

public class PowerOfNumbers {
    public static int reverseExponentiation(int n) {
        // code here
        int original = n;
        StringBuilder reversedNumber = new StringBuilder();
        while(n >0 ){
            int lastDigit = n %10;
            if(lastDigit!=0){
                reversedNumber.append(lastDigit);
            }
            n /=10;
        }
        int reversed =   Integer.parseInt(reversedNumber.toString());
        return (int)Math.pow((double)original,(double)reversed);
    }
    public static void main(String[]args){
        int ans = reverseExponentiation(10);
        System.out.print(ans);
    }
}
