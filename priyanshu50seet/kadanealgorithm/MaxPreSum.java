package kadanealgorithm;

public class MaxPreSum {
    public static void main(String[] arg){
        int[] arr = {1,2,4,-7,8,-1,-2,-8};
        System.out.print("Answer is :"+maxPreSumKadan(arr));
    }
    static int maxPreSumKadan(int[] arr){
        int max = arr[0];
        int preSum = arr[0];
        for(int i=1;i<arr.length;i++){
            preSum+=arr[i];
            max = Math.max(max, preSum);
        }
        return max;
    }

}
