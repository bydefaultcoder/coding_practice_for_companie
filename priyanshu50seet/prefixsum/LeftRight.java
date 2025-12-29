package prefixsum;

public class LeftRight {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,2};
        System.out.println(""+leftEqRight(arr));
    }
    static int leftEqRight(int[] arr){
        int sum=0;
        int prefix[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            prefix[i] = sum; 
        }
        // for(int)
        for(int i=0;i<prefix.length;i++){
            if(prefix[i]==(prefix[prefix.length-1] - prefix[i])){
                return i;
            }
        }
        return -1;
    }
}
