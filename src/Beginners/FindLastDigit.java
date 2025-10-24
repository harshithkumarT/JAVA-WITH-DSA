package Beginners;

public class FindLastDigit {
    // Method to find the last digit of a^b
    public static int lastDigit(String a, String b) {
        // If exponent is 0, return 1
        if (b.equals("0")) return 1;

        // Take last digit of a
        int last = a.charAt(a.length() - 1) - '0';

        // Precomputed cycles for each possible last digit
        int[][] cycles = {
                {0},        // 0
                {1},        // 1
                {2,4,8,6},  // 2
                {3,9,7,1},  // 3
                {4,6},      // 4
                {5},        // 5
                {6},        // 6
                {7,9,3,1},  // 7
                {8,4,2,6},  // 8
                {9,1}       // 9
        };

        // Select cycle based on last digit
        int[] cycle = cycles[last];
        int len = cycle.length;
        if (len == 1) return cycle[0];

        // Compute b mod len (because cycles repeat)
        int rem = 0;
        for (int i = 0; i < b.length(); i++) {
            rem = (rem * 10 + (b.charAt(i) - '0')) % len;
        }

        // If remainder is 0, use last element in cycle
        if (rem == 0) rem = len;

        // Return the correct last digit
        return cycle[rem - 1];
    }

    // Main method to test the function
    public static void main(String[] args) {
        System.out.println(lastDigit("3", "10")); // Output: 9
        System.out.println(lastDigit("6", "2"));  // Output: 6
    }
}
