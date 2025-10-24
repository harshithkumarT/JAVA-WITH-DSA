package ArrayDataStructure;

import java.util.Arrays;

public class Sort012 {
//    brute force
//    public  static void sort012(int[] arr) {
//        // code here
//        Arrays.sort(arr);
//    }

//    optimal approach dutch national flag algorithm
    public  static void sort012(int[] arr) {
        // code here
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] ==2){
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void swap(int[]arr, int left , int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void main(String[]args){
        int[]arr ={0, 1, 2, 0, 1, 2};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
