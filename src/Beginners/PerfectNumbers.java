package Beginners;

public class PerfectNumbers {
    static boolean isPerfect(int n) {
        // 1 is not a perfect number
        if (n <= 1) return false;

        int sum = 1; // 1 is always a divisor

        // Only check up to √n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                // Add the paired divisor only if it’s not the same (like in case of perfect squares)
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }

    public static void main (String[]args){
        System.out.println(isPerfect(15));
    }
}
