package ArrayDataStructure;

import java.util.ArrayList;
//'arr '= [1,2,3,4,5]
//        'k' = 1  rotated array = [2,3,4,5,1]
//        'k' = 2  rotated array = [3,4,5,1,2]
//        'k' = 3  rotated array = [4,5,1,2,3] and so on.

public class RotateArray {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        if(arr == null || arr.size() == 0 || k ==0){
            return arr;
        }
        ArrayList<Integer> kArr = new ArrayList<>();
        for(int i = 0; i < k; i++){
            kArr.add(arr.get(i));
        }
        ArrayList<Integer> rotatedArr = new ArrayList<>();
        for(int i = k; i < arr.size(); i++){
            rotatedArr.add(arr.get(i));
        }
        rotatedArr.addAll(kArr);
        return rotatedArr;
    }
    public static void main(String[]args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        ArrayList<Integer> ans = rotateArray(arr,3);
        System.out.println(ans);
    }
}
