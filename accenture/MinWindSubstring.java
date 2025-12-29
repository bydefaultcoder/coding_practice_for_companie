import java.util.*;
public class MinWindSubstring {
// 🔟 Minimum Window Substring (HARD)

// Problem
// Given strings s and t, find the smallest window in s that contains all characters of t.

// Key idea
// Frequency map + count matching + shrink.
    public static void main(String[] args){
        String str = "samarjeet";
        String t = "amar";
        System.out.println("Min window which incude more char"+minWinSubString(str,t));
    }
    static int minWinSubString(String source,String target){
        int minWin = 0;
        HashMap<Character,Integer> need = new HashMap<>();
        // preprocessing
        for(char c:target.toCharArray()){
            need.put(c,need.getOrDefault(c, 0)+1);
        }
        // --------
        for(int right=0;right<source.length();right++){
            
        }

        return minWin;
    }
}
