package prefixsum;

import java.util.*;

public class LongSubArrSumEqK {
    public static void main(String[] args){
        int[] nums = {21, -1, 5, -2, 3};
        int k = 3;
        System.out.println(""+longSubArrSumK(nums, k));
    }
    static int longSubArrSumK(int[] arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = -1;
        int sum = 0,l,r;
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum - k)){
                max = Math.max(max,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)) map.put(sum,i);
        }
        return max;
    }
}
