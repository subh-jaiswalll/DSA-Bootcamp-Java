public class MaxSubarrayProduct {

    public static int maxSubarrayBrute(int[] arr){

        int n = arr.length;

        int maxProduct = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){

            int product = 1;

            for(int j = i; j < n; j++){

                product *= arr[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;
    }



    public static void main(String[] args) {

        int[] arr = {2,3,-2,4};
        int result = maxSubarrayBrute(arr);
        System.out.println(result);
    }
}
