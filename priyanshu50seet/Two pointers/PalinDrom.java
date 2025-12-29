import java.util.*;
public class PalinDrom {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String s = sc.next();
            int left = 0,right = s.length()-1;
            while (left<right && s.charAt(left)==s.charAt(right)) {
                left++;
                right--;
            }
            if(left<right){
                System.out.println("Not Palindrom");
            }else{
                System.out.println("palindrom");
            }
        }
    }
}
