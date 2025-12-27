import java.util.*;
public class LongSubString{
    public static void main(String[] args){
        System.out.println("Max substring is: "+longestSubStr("samarjeetSinghGautam"));
    }
    static int longestSubStr(String s){
        int maxLen =0,left=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            map.put(c,map.getOrDefault(c, 0)+1);
            while(map.get(c)>1){
                char leftChar = s.charAt(left++);
                map.put(leftChar,map.get(leftChar)-1);
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}