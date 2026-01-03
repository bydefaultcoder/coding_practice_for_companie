public class MergeTwoSortedArr {
    public static void main(String[] arg){
        int[] arr1 = {3,4,8,12,17,22,45};
        int[] arr2 = {5,9,10,24,25};
        int[] resArr = mergeSortedArr(arr1,arr2);
        for(int el:resArr){
            System.err.print("\t" + el);
        }
    }
    static int[] mergeSortedArr(int[] arr1,int[] arr2){
        int[] sortedArr = new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                sortedArr[k++] = arr1[i++];
            }else{
                sortedArr[k++] = arr2[j++];
            }
        }
        while(i<arr1.length){
            sortedArr[k++] = arr1[i++];
        }
        while (j<arr2.length) {
            sortedArr[k++] = arr2[j++];
        }
        return sortedArr;
    }
}