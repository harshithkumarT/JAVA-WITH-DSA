package Beginners;

public class SquareRoot {
    static int floorSqrt(int n) {
        // code here
        return (int)Math.sqrt(n);
    }
    public static void main(String[]args){
        int ans = floorSqrt(1);
        System.out.println(ans);
    }
}
