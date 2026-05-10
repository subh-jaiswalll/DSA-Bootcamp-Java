import java.util.Arrays;

public class SqureOfSortedArray {


    static int[] squareOfSortedArrayBruteForce(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            arr[i] = arr[i] * arr[i];
        }

        Arrays.sort(arr);
        return arr;
    }

    static int[] squareOfSortedArrayTwoPointer(int[] arr){
        int n = arr.length;

        int[] temp = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = arr[i] * arr[i];
        }

        int start = 0;
        int end = n -1;

        for(int i = n - 1; i >= 0; i--){
            if(arr[start] > arr[end]){
                temp[i] = arr[start];
                start++;
            }
            else {
                temp[i] = arr[end];
                end--;
            }

        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};

        int[] result = squareOfSortedArrayBruteForce(arr);
        System.out.println(Arrays.toString(result));

        int[] resultOptimized = squareOfSortedArrayTwoPointer(arr);
        System.out.println(Arrays.toString(resultOptimized));
    }
}
