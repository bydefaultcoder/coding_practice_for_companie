package prefixsum;
import  java.util.*;
public class ProOfArrExcptSelf {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
          
            int arr[] = {2, 3, 5, 2, 3};
            int len = arr.length;

            int[] ans = new int[len];
            ans[0]=1;
            for (int i = 1; i < len; i++) {
                ans[i] = arr[i-1]*ans[i-1];
            }
            int suff =1;
            for (int i = len-1; i >=0; i--) {
                ans[i] = ans[i]*suff;
                suff = suff*arr[i];
            }
            for(int x:ans){
                System.out.print("\t"+x);
            }
        } 

    
    }
}
