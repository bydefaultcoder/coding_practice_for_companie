package prefixsum;

import java.util.Scanner;

public class Sumofallprev {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int arr[] = {2,3,43,7,1,4,7};
            System.out.print("l : ");
            int l = sc.nextInt();
            System.out.println("Answer is :" + rangeSumQuery(arr,l));
        }
    }
    static int rangeSumQuery(int[] arr, int l){
        int sum=0;
        int prefix[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            prefix[i] = sum; 
        }
        if(l==0) return 0; 

        return prefix[l-1];
    }
}
