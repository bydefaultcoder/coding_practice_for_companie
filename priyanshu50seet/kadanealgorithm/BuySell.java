package kadanealgorithm;

public class BuySell {
    public static void main(String[] args) {
    int[] arr = {7,1,5,3,6,4,10};
    System.out.println("Answer is: "+maxProfit(arr));
    }
    static int maxProfit(int[] prices) {
        int currentSum = 0;
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            currentSum += prices[i]-prices[i-1];

            if(currentSum<0){
                currentSum=0;
            }
            maxProfit = Math.max(currentSum,maxProfit);
        }
        return maxProfit;
    }
}
