package freqcount;
import java.util.*;
public class FruiteIntoBasket {
        //9️⃣ Fruits Into Baskets

        // Problem
        // You are given an array of fruits. You can pick only two types of fruits.
        // Return the maximum number of fruits you can collect in a contiguous segment.
        // explation arr is lable of fruits arr => {1,1,1,2,1,3,3,2,1}
        public static void main(String[] args){
            int[] fruits = {1,1,1,2,1,3,3,2,1};
            int maxType =2;
            System.out.println("Fruits max fruits of type 2 are : "+fruitIntoBasket(fruits,maxType));
        }
        static int fruitIntoBasket(int[] fruitsArr,int maxType){
            int maxFruits = 0,left=0;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int right=0;right<fruitsArr.length;right++){
                int fruit = fruitsArr[right];
                map.put(fruit,map.getOrDefault(fruit,0)+1);
                while(map.size()>maxType){
                    fruit = fruitsArr[left++];
                    map.put(fruit,map.get(fruit)-1);
                    if(map.get(fruit)==0){
                        map.remove(fruit);
                    }
                }
                maxFruits = Math.max(maxFruits,right-left+1);
            }
            return maxFruits;
        }
}
