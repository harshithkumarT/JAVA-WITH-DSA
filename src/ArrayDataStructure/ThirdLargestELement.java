package ArrayDataStructure;

import java.util.Arrays;

public class ThirdLargestELement {
    static int thirdLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num < first) {
                third = second;
                second = num;
            } else if (num > third && num < second) {
                third = num;
            }
        }

        return (third == Integer.MIN_VALUE) ? -1 : third;
    }



    public static void main(String[]args){
        int[] arr ={2, 4, 1, 3, 5};

        int ans = thirdLargest(arr);
        System.out.println(ans);
    }
}
