package Beginners;
import java.util.ArrayList;
import java.util.List;
public class PrintAllDivisiorsOfANumber {
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        int original = n;
        for(int i = 1; i <=n; i++) {
            if(n % i ==0){
                list.add(i);
            }
        }
        return list;
    }
    public  static void main(String[]args){
        List<Integer> ans = printDivisors(6);
        System.out.println(ans);
    }
}
