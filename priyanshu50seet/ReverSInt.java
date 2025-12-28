import java.util.*;
public class ReverSInt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverseInteger(num));
    }
    static int reverseInteger(int num){
        int result = 0;
        while(num>0){
            result = result*10 + num%10;
            num = num/10;
        }
        return result;
    }
}
