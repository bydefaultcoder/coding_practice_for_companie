package prefixsum;
import java.util.*;
public class SumOfK{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k =3;
        System.out.println("No of subArray of sum equls k are: " + subArrOfSumK(arr,k));
    }
    static int subArrOfSumK(int[] arr,int k){
        int sum=0;
        int count =0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int x:arr){
            sum+=x;
            count+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}