package ArrayDataStructure;

import java.util.Arrays;

public class missingNumber {
    static int missingNum(int[] arr) {
        int n = arr.length + 1; // Since one number is missing
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return total - sum;
    }

    public static void main(String[]args){
        int[] arr ={8, 2, 4, 5, 3, 7, 1};
        int ans = missingNum(arr);
        System.out.print(ans);
    }
}
