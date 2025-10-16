package SlidingWIndow;

public class SubstringsofSizeThreewithDistinctCharacters {
    public static void main(String[]args){
        String s = "aababcabc";
        int answer = countGoodSubstrings(s);
        System.out.println(answer);
    }
    public static int countGoodSubstrings(String s) {
        if(s.length() <3) return 0;
        int distinctCount = 0;
        for(int i =0; i <= s.length()-3; i++){
            int firstCharacter = s.charAt(i);
            int secondCharacter = s.charAt(i+1);
            int thirdCharacter = s.charAt(i+2);

            if(firstCharacter  != secondCharacter && secondCharacter != thirdCharacter && firstCharacter != thirdCharacter){
                distinctCount++;
            }
        }
        return distinctCount;
    }
}
