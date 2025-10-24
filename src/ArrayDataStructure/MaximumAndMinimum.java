package ArrayDataStructure;

import java.util.ArrayList;
import java.util.List;

public class MaximumAndMinimum {
    public static ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int maximum = arr[0];
        int minimum = arr[0];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i< arr.length; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
            if(arr[i]> maximum){
                maximum = arr[i];
            }
        }
        list.add(minimum);
        list.add(maximum);
        return list;
    }
    public static void main(String[]args){
        int[]arr = {12, 3, 15, 7, 9};
        ArrayList<Integer> ans = getMinMax(arr);
        System.out.println(ans);
    }
}
