
import java.util.Scanner;

public class MinInArr{
    public static void main(String []arg){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Enter length of array: ");
            int len = input.nextInt();
            int min =  Integer.MAX_VALUE;
            for(int i=0;i<len;i++){
                int value = input.nextInt();
                if(min>value){
                    min = value;
                }
            }
            System.out.println("min no is :" + min);
        }

    }
}