package kadanealgorithm;
public class MaxCirSubArr {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,-4,5,-9,10};
        System.out.println("Answer is : "+ maxCirSubArr(arr));
    }

    static int maxCirSubArr(int[] arr) {
        int totalSum = arr[0];
        int maxCurr=arr[0];
        int minCurr=arr[0];
        int minSum= arr[0];
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            int x = arr[i];
            totalSum+=x;
            maxCurr = Math.max(x,maxCurr+x);
            maxSum = Math.max(maxSum,maxCurr);
            minCurr = Math.min(x,minCurr+x);
            minSum = Math.min(minSum, minCurr);
        }
        return  Math.max(maxCurr,totalSum-minSum);
    }
    
}
