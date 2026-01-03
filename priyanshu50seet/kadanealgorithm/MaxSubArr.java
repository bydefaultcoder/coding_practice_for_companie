package kadanealgorithm;
public class MaxSubArr {
    public static void main(String arg[]){
        int arr[] = {1,2,4,-7,5,-1,2,8};
        System.out.println("Answer is :"+ maxSubArrUsingKadane(arr));
    }
    public static int maxSubArrUsingKadane(int[] arr){
        int max = arr[0];
        int sum = arr[0];
        for(int i=1;i<arr.length;i++){
            sum = Math.max(sum+arr[i],arr[i]);
            max = Math.max(max,sum);
        }
        return max;
    }
}