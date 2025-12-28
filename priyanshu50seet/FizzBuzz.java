
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fizzBuzz(sc.nextInt());
        sc.close();
    }
    static void fizzBuzz(int num){
        System.out.print("[");
        for(int i=1;i<=num;i++){
            if(i%3==0){
                if(i%5==0){
                    System.out.print("\"FizzBuzz\"");
                }else{
                    System.out.print("\"Fizz\"");
                }
            }else{
                if(i%5==0){
                    System.out.print("\"Buzz\"");
                }else{
                    System.out.print("\""+i+"\"");
                } 
            }
            if(i!=num){
                System.out.print(",");
            }
        }
        System.out.println("]");

    }

}
