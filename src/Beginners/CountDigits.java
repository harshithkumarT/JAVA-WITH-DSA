package Beginners;

public class CountDigits {
    static int evenlyDivides(int n) {
        // code here
        int original = n;
        int count = 0;
        while(n > 0){
           int digit = n% 10;  // extract the last digit
             if( digit !=0 && original % digit ==0){
                 count++;
             }
             n/=10;
        }
        return  count;
    }
    public static void main(String[]args){
        int ans = evenlyDivides(2446);
        System.out.println(ans);
    }

}
