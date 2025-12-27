public class LongestSubarraySumAtMostK {
    public static void main(String arg[]){
        int[] arr = {2, 1, 5, 1, 3, 2};
        System.out.println("lenth is :"+longestsubArrSumMostK(arr,7));
    }    
    static int longestsubArrSumMostK(int[] arr,int k){
        int maxLen =0;
        int left=0;
        int sum=0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>k){
                sum-=arr[left++];
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
