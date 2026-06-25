public class MinimumSizeSubArraySum {

    public static int minSubarrayBrute(int[] arr, int target){

        int n = arr.length;

        int minLen = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){

            int sum = 0;

            for(int j = i; j < n; j++){

                sum += arr[j];

                if(sum >= target){
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static int minSubArraySliding(int[] arr, int target){

        int n = arr.length;
        int sum = 0;

        int start = 0;
        int minLen = Integer.MAX_VALUE;

        for(int end = 0; end < n; end++){

            sum += arr[end];

            while (sum >= target){
                minLen = Math.min(minLen, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {

        int[] arr = {2,3,1,2,4,3};
        int target = 7;

        int result = minSubarrayBrute(arr, target);
        System.out.println(result);

        int resultSliding = minSubArraySliding(arr, target);
        System.out.println(resultSliding);
    }
}
