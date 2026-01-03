package freqcount;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String t = "dog";
        String s = "gode";
        System.out.println(""+validAnagram(t,s));
    }
    static boolean validAnagram(String t,String s){
        boolean ans=true;
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> mapk = new HashMap<>();
        for(char c : t.toCharArray() ){
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        
        for(char c : s.toCharArray() ){
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c, map.get(c)-1);
            if(0==map.getOrDefault(c, 0)){
             map.remove(c);
            }
        }
        if(!map.isEmpty()){
            return false;
        }
        return ans;
    }
}
