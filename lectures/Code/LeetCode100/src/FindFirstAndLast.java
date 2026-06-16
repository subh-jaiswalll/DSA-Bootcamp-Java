import java.util.Arrays;

public class FindFirstAndLast {

    public  static int[] findFirstAndLast(int[] arr, int target){
        return new int[]{findFirst(arr, target), findLast(arr, target)};
    }

    public static int findFirst(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                ans = mid;
                end = mid - 1;
            }
            else if(arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int findLast(int[] arr, int target){
        int n =arr.length;
        int start = 0;
        int end = n -1;

        int ans = -1;

        while (start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                ans = mid;
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 4, 5, 6};
        int target = 4;
        int[] result = findFirstAndLast(arr, target);
        System.out.println(Arrays.toString(result));

        int findResult = findFirst(arr, target);
        System.out.println(findResult);

    }
}
