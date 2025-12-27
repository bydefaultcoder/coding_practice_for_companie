import java.util.*;
public class SumSubArrOfN {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array: ");
            int n = sc.nextInt();
            System.out.println("Enter The Size Of Sub Array: ");
            int k = sc.nextInt();
            int[] arr = new int[n];
            int[] subArr = new int[n-k+1];
            System.out.println("Enter element : ");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(i<k)
                    subArr[0]+=arr[i];
            }
            System.out.print(subArr[0]);
            int max = subArr[0];
            for(int i=k;i<n;i++){
                subArr[i-k]+= (arr[i]- arr[i-k]);
                max = Math.max(max, subArr[i-k]);
                System.out.print( " " + subArr[i-k]);
            }
            System.out.println("\n  max is : "+max);
        }

    }
}
