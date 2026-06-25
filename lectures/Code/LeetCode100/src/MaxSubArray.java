public class MaxSubArray {


   public static int maxSubarrayBrute(int[] arr){

       int n = arr.length;

       int maxSum = 0;

       for(int i = 0; i < n ;i++){

           int sum = 0;

           for(int j = i; j < n; j++) {
               sum += arr[j];

               maxSum = Math.max(maxSum, sum);
           }
       }
       return maxSum;
   }

   public static int maxSubarraySum(int[] arr){

       int n = arr.length;

       int maxSum = arr[0];
       int sum = arr[0];

       for(int i = 1; i <n; i++){

           sum = Math.max(arr[i], sum+ arr[i]);
           maxSum = Math.max(maxSum, sum);
       }
       return maxSum;
   }
    public static void main(String[] args) {

        int[] arr = {-7, -2, 3, 4, -5, 6, 7, -2};
        int result = maxSubarrayBrute(arr);
        System.out.println(result);

        System.out.println(maxSubarraySum(arr));

        }
}
