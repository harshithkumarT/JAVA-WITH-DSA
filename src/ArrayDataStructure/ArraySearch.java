package ArrayDataStructure;

public class ArraySearch {


    //        sequential search
    public static int search(int arr[], int x) {
        // code here

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return  i;
            }
        }
        return -1;
    }




    public static void main(String[]args){
        int[]arr = {10 ,8 ,30, 4 ,5};
        int ans = search(arr,4);
        System.out.println(ans);
    }
}
