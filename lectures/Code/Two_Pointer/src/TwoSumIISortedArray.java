import java.util.Arrays;


//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class TwoSumIISortedArray {


    static int[] twoSum(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while(start < end){


            if(arr[start] + arr[end] > target){
                end = end - 1;
            }
            else if(arr[start] + arr[end] < target){
                start = start + 1;
            }
            else {
                return new int[]{start+ 1, end + 1};
            }

        }
        return new int[] {-1, -1};
    }

    static int[] sumBruteForce(int[] arr, int target){

        int n = arr.length;

        for(int i = 0; i < n; i++){

            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    return new int[] {i+1, j+1};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println(Arrays.toString(sumBruteForce(arr, target)));
    }
}
