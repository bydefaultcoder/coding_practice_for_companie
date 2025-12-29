import java.util.*;
public class CardsInPiramid {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

            int n = input.nextInt();
            //  card = n(n+1) + n(n-1)/2
            if(n<=0){
                System.out.println("invalid");
            }else{
                if(n==1){
                    System.out.println(2);
                }else{
                System.out.println(n*(n+1)+ n*(n-1)/2);
            }
            }
        }
        
    }
}
