public class RotateArray {

    public static void rotateArray(int[] arr){

        int n = arr.length;

        int last = arr[n- 1];

        for(int i = n - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

    }
    public static void rotateArrayOptimized(int[] arr, int k){
        int n = arr.length;
        k = k % n;



    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateArray(arr);

        for (int num : arr){
            System.out.println(num);
        }
    }
}
