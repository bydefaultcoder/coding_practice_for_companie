package setbase;

import java.util.HashSet;

public class IntersecOfArr {
    public static void main(String[] args){
        int[] arr1 = {3,4,2,8,2,12};
        int[] arr2 = {4,2,8,3,89,11};
        int[] arr3= intersection(arr1, arr2);
    }

    static  int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int x : nums1) {
            set.add(x);
        }

        for (int x : nums2) {
            if (set.contains(x)) {
                result.add(x);
            }
        }

        int[] output = new int[result.size()];
        int i = 0;
        for (int x : result) {
            output[i++] = x;
        }

        return output;
    }

}
