package stackbased;
import java.util.*;
public class ValidParanthesis {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            String str = sc.next();
            System.out.println("Check paranthesis for "+str+" :"+ validParenthesis(str));
        }
    }
    static boolean validParenthesis(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {

                // push opening brackets
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } 
                // handle closing brackets
                else {
                    if (stack.isEmpty()) return false;

                    char top = stack.peek();
                    if ((c == ')' && top == '(') ||
                        (c == '}' && top == '{') ||
                        (c == ']' && top == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }
    
    static boolean isValid(String s) {
            ArrayDeque<Character> stack = new ArrayDeque<>();

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) return false;

                    char top = stack.pop();
                    if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }

}
