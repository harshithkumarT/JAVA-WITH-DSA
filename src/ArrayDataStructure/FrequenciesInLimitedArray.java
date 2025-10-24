package ArrayDataStructure;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
public class FrequenciesInLimitedArray {
    public static List<Integer> frequencyCount(int[] arr) {
        // code here
        System.out.println(arr.length);
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int item : arr){
            freqMap.put(item , freqMap.getOrDefault(item,0)+1);
        }
        List<Integer> freqList = new ArrayList<>();
        for(int i = 1; i <= arr.length; i++){
            if(freqMap.containsKey(i)){
                freqList.add(freqMap.get(i));
            }
            else{
                freqList.add(0);
            }
        }
        return freqList;
    }
    public static void main(String[]args){
        int[]arr = {3,3,3,3};
        List<Integer> ans = frequencyCount(arr);
        System.out.println(ans);

    }
}
