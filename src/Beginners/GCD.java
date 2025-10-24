package Beginners;

public class GCD {
    public static int gcd(int a, int b) {
        // Handle zero or negative numbers
        if (a == 0) return b;
        if (b == 0) return a;

        // Euclidean Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            System.out.println(b);
            a = temp;
        }
        return a;
    }

    public static void main(String[]args){
        int a =30,b=36;
        int ans =gcd(a,b);
//        System.out.println(ans);
    }
}
