package Beginners;

public class ArmStrongNumber {
    static boolean armstrongNumber(int n) {
        // code here
        int original = n;
        int sum  =0;
        while(n > 0){
            int lastValue = n%10;
            sum += (int) Math.pow(lastValue,3);
            n /=10;
        }
        if(sum!= original){
            return false;
        }
        return true;
    }
    public static void main(String[]args){
        System.out.println(armstrongNumber(372));
    }
}
