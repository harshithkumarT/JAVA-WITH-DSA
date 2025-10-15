package SlidingWIndow;

public class MaxVowelsWindow {
    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3)); // 3
        System.out.println(maxVowels("aeiouAEIOU", 5)); // 5
        System.out.println(maxVowels("leetcode", 3)); // 2
        System.out.println(maxVowels("bbb", 2)); // 0
    }

    public static int maxVowels(String s, int k) {
        if (s == null || k <= 0) return 0;
        int n = s.length();
        if (k > n) k = n; // optional: treat full string as window if k>n

        int count = 0;
        // initial window [0..k-1]
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) count++;
        }

        int maxCount = count;

        // slide window: window is [j-k+1 .. j] when j goes from k .. n-1
        for (int j = k; j < n; j++) {
            // outgoing char at index j-k
            if (isVowel(s.charAt(j - k))) count--;
            // incoming char at index j
            if (isVowel(s.charAt(j))) count++;

            // update max every iteration
            if (count > maxCount) maxCount = count;
        }

        return maxCount;
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        // Alternatively: return "aeiou".indexOf(ch) >= 0;
    }
}
