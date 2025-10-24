package ArrayDataStructure;

import java.util.HashMap;
import java.util.Map;

public class ArraySubset {
    public static boolean isSubset(int a[], int b[]) {
        // Your code here
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int item : a){
            freqMap.put(item, freqMap.getOrDefault(item,0)+1);
        }
        for(int i= 0; i < b.length; i++){
            if(freqMap.containsKey(b[i]) && freqMap.get(b[i]) > 0){
                freqMap.put(b[i], freqMap.get(b[i])-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        int a[] ={11, 7, 1, 13, 21, 3, 7, 3};
        int[]b = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a,b));
    }
}
