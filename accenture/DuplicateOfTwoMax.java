import java.util.*;

public class DuplicateOfTwoMax {
    public static void main(String [] arg){
        Integer arr[] = {90,80,90,80,70};
        ArrayList<Integer> marks = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(marks,Collections.reverseOrder());
        int topper=0;
        int remove =0;
        System.out.println(marks);
        for(int i=1;i<marks.size();i++){
            System.out.println(topper + " " + i + " " + marks.get(i).equals(marks.get(topper)));
            if(marks.get(i).equals(marks.get(topper))){
                remove++;
            }else{
                if(topper!=0){
                    break;
                }
                topper=i;
            }
        }
        System.out.println("Number of duplicates of the maximum element: "+remove);
    }
}
