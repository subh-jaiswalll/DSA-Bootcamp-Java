import java.util.Arrays;

public class TwoSumII {


    public static int[] twoSumBrute(int[] arr,int target){

        int n = arr.length;

        for(int i = 0; i < n; i++){

            for(int j = i + 1; j < n; j++){

                int sum = arr[i] + arr[j];

                if(sum == target){
                    return new int[]{i + 1, j + 1};
                }

            }
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSumTwoPointer(int[] arr, int target){

        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start < end){
            int sum = arr[start] + arr[end];

            if(sum == target){
                return new int[]{start + 1, end + 1};
            }
            else if(sum > target){
                end = end - 1;
            }
            else {
                start = start + 1;
            }
        }
        return new int[]{-1, -1};
    }


    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumBrute(arr, target);
        System.out.println(Arrays.toString(result));

        int[] resultTwoPointer = twoSumTwoPointer(arr, target);
        System.out.println(Arrays.toString(resultTwoPointer));
    }
}
