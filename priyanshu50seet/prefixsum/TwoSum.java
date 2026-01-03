package prefixsum;
import java.util.*;
public class TwoSum {
    public static void main(String[] args){
        int[] arr = {3,2,4};
        int target = 6;
        int ans[] = twoSum(arr,target);
        System.out.println("Answer for arr is ["+ans[0]+","+ans[1] +"]");
    }

    static int[] twoSum(int[] arr,int target){
        int ans[]= new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(arr[0], 0);
        for(int i=1;i<arr.length;i++){
            if(map.containsKey(target - arr[i])){
                ans[0] = map.get(target - arr[i]); 
                ans[1] = i;
                return ans;
            }
            map.put(arr[i],i);
        }
        return ans;
    }
}
