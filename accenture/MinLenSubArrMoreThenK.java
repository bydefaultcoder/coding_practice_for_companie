public class MinLenSubArrMoreThenK{
//     8️⃣ Smallest Subarray with Sum ≥ K

// Problem
// Find the minimum length of a contiguous subarray whose sum is ≥ k.
    public static void main(String[] args){
        int arr[] = {2,3,5,1,8,9,4,7};
        int k = 25;
        System.out.println("Min Length is :"+ minLenSubArr(arr,k));
    }
    static int minLenSubArr(int arr[],int k){
        int minLen=arr.length,left=0,sum=0;
        boolean kTooLarge = true;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>=k){
                kTooLarge= false;
                minLen = Math.min(minLen,right-left+1);
                sum-=arr[left++];
            }
        }
        if(kTooLarge) return -1;
        return minLen;
    }
}