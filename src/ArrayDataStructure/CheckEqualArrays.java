package ArrayDataStructure;

import java.util.Arrays;

public class CheckEqualArrays {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        int firstPointer = 0;
        int secondPointer = 0;
        while(firstPointer < a.length && secondPointer < b.length){
            if(a[firstPointer] != b[secondPointer]){
                return  false;
            }
            firstPointer++;
            secondPointer++;
        }
        return true;
    }
    public static void main(String[]args){
        int a[] ={1, 2, 5};
        int[]b ={2, 4, 15};
        System.out.println(checkEqual(a,b));
    }
}
