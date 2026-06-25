public class MaxSumSubarraySizeK {


    public static int maxSumSubarrayBrute(int[] arr, int k){

        int n = arr.length;


        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i <= n - k; i++){

            int currentSum = 0;

            for(int j = i; j < i + k; j++){

                currentSum += arr[j];
            }

            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static int maxSumSubarraySlidingWindow(int[] arr, int k){

        int n = arr.length;
        int windowSum = 0;

        for(int i = 0;i  < k; i++){
            windowSum+= arr[i];
        }

        int maxSum   = windowSum;

        for(int i = k ; i < n; i++){
            windowSum += arr[i] - arr[i - k];

            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {

        int[] arr = {100, 200, 300, 400};
        int k  = 2;

        int result = maxSumSubarrayBrute(arr, k);

        System.out.println(result);

        int resultSliding = maxSumSubarraySlidingWindow(arr, k);
        System.out.println(resultSliding);
    }
}
