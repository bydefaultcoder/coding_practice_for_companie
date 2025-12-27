public class NoOfOnesInBin {
    public static void main(String[] args) {
      int n = 40;
      int count = 0;
      while(n>0){
       count+= n&1;
       n = n>>1;
      }
      System.out.println("Number of 1s in binary representation: " + count);
    // String word = "examination";
    // System.out.println(word.charAt(0)+""+ (word.length()-2)+word.charAt(word.length()-1));
    }
}
