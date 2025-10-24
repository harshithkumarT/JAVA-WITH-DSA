package TwoSum;

import java.util.Arrays;

public class findPairWithGivenSum {
     public static boolean twoSum(int arr[], int target) {
        // code here
         Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int sum = arr[left]+ arr[right];
            if(sum == target){
                return true;
            }
            else if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
    public static void main(String[]args){
         int[]arr = {0,-1,2,-3,1};
         System.out.println(twoSum(arr,-2));
    }
}
