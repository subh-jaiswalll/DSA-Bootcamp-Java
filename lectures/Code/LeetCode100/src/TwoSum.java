import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSumBruteForce(int[] arr, int target){


        int n = arr.length;

        for(int i = 0; i < n; i++){

            for(int j = i + 1; j < n; j++){

                int sum = arr[i] + arr[j];

                if(sum == target){
                    return new int[]{i, j};
                }
            }
        }
        return  new int[]{-1, -1};
    }

    public static int[] twoSumHashMap(int[] arr, int target){

        int n = arr.length;


        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){

            int diff = target - arr[i];



            if(map.containsKey(diff)){

                return new int[] {map.get(diff), i};
            }

            map.put(arr[i], i);


        }

        return new int[] {-1, -1};

    }



    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 9;

        int[] resultBruteForce = twoSumBruteForce(arr, target);
        System.out.println(Arrays.toString(resultBruteForce));

        int[] resultTwoPointer = twoSumHashMap(arr, target);
        System.out.println(Arrays.toString(resultTwoPointer));
    }
}
