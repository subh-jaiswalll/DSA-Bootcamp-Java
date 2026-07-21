public class BestTimeToBuyAndSell {

    public static int bestTimeBruteForce(int[] arr){
        int n = arr.length;

        int maxProfit = 0;

        for(int i = 0; i < n; i++){

            for(int j = i + 1; j  < n; j++) {
                int profit = arr[j] - arr[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static int bestTimeToBuy(int[] arr){

        int maxProfit = 0;

        int profit = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(profit > arr[i]){
                profit = arr[i];
            }
            maxProfit = Math.max(maxProfit, arr[i] - profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int resultBruteForce = bestTimeBruteForce(arr);
        System.out.println(resultBruteForce);

        int result = bestTimeToBuy(arr);
        System.out.println(result);

    }
}
