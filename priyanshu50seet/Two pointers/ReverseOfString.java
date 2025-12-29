public class ReverseOfString {
    public static void main(String[] args){
        String a = "samarjeetSinghGautam";
        System.out.println(reverseString(a));
    }
    static String reverseString(String s){
        char[] charArr = new char[s.length()];
        int left=0,right=s.length()-1;
        while(left<right){
            charArr[left] = s.charAt(right);
            charArr[right] = s.charAt(left);
            left++;
            right--;
        }
        
        return new String(charArr);
    }
}
