package Beginners;

public class FindEvenOrOdd {
    public static boolean isEven(int n) {
        // code here
        // using div
        return n%2 == 0 ? true:false;
        //using xor operation

    }
    public static void main(String[]args){
        System.out.println(isEven(14));
    }
}
