package Beginners;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
//    public static boolean isPalindrome(int n) {
//        /*
//         * A palindrome number reads the same backward as forward.
//         * Example: 121 → reverse is 121 → same ⇒ palindrome.
//         * Non-palindrome example: 123 → reverse is 321 → not same ⇒ not palindrome.
//         *
//         * This algorithm avoids converting the number to a string
//         * or using extra data structures like arrays or lists.
//         * It instead reverses only **half** of the number mathematically.
//         *
//         * Advantage:
//         *   ✅ O(log₁₀(n)) time (we process each digit once)
//         *   ✅ O(1) extra space (no arrays or lists)
//         */
//
//        // ❌ Case 1: Negative numbers are never palindromes.
//        // Example: -121 → reverse would be 121-, not valid.
//        // ❌ Case 2: Numbers ending in 0 are not palindromes (except 0 itself).
//        // Example: 10 → reverse is 01 (i.e., 1), not same.
//        if (n < 0 || (n % 10 == 0 && n != 0)) return false;
//
//        // reversedHalf stores the reversed digits of the second half of n.
//        // Example (for 1221):
//        //   Iteration 1: lastDigit = 1, reversedHalf = 1, n = 122
//        //   Iteration 2: lastDigit = 2, reversedHalf = 12, n = 12
//        //   At this point, n == reversedHalf ⇒ stop and return true.
//        int reversedHalf = 0;
//
//        /*
//         * Loop until the original number 'n' becomes less than or equal to 'reversedHalf'.
//         * Why?
//         * Because we only need to reverse half the digits to compare.
//         * - For even length numbers: n == reversedHalf when both halves are equal.
//         * - For odd length numbers: reversedHalf will have one extra middle digit.
//         */
//        while (n > reversedHalf) {
//            // Get the last digit of n using modulus (%)
//            int lastDigit = n % 10;  // Example: 123 % 10 = 3
//
//            // Append this digit to reversedHalf
//            // Example: reversedHalf = 12 → reversedHalf * 10 + 3 = 123
//            reversedHalf = reversedHalf * 10 + lastDigit;
//
//            // Remove the last digit from n by integer division (/)
//            // Example: 123 / 10 = 12
//            n /= 10;
//        }
//
//        /*
//         * Now, there are two possible cases:
//         * 1️⃣ Even length palindrome:
//         *      n == reversedHalf
//         *      Example: 1221 → at end, n = 12, reversedHalf = 12
//         *
//         * 2️⃣ Odd length palindrome:
//         *      reversedHalf will have one extra digit in the middle.
//         *      Example: 12321 → at end, n = 12, reversedHalf = 123
//         *      We remove that middle digit by reversedHalf / 10 = 12 → matches n.
//         */
//        return n == reversedHalf || n == reversedHalf / 10;
//    }

    public static void main(String[]args){
        System.out.println(isPalindrome(555));
    }
    public static boolean isPalindrome(int n){
        if(n < 0 ||(n %10 == 0 && n!=0)) return false;
        int reversedHalf =0;
        while(n > reversedHalf){
            int lastDigit = n %10;
            reversedHalf = reversedHalf *10 + lastDigit;
            n /=10;
        }
        return  n == reversedHalf || n == reversedHalf/10;
    }

}
