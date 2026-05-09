public class RotateArray {

    public static void rotateArray(int[] arr){

        int n = arr.length;

        int last = arr[n- 1];

        for(int i = n - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

    }
    public static void rotateKtimes(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        for(int i = 0; i < k; i++){
            rotateArray(arr);
        }


    }
    public static void rotateKtimesOptimzed(int[] arr, int k){
        int n =arr.length;
        k = k % n;

        reverse(arr, 0, n-1);
        reverse(arr, 0 , k -1);
        reverse(arr, k, n -1);
    }
    public static void reverse(int[] arr, int n, int k){
        while(n < k){
            int temp = arr[n];
            arr[n] = arr[k];
            arr[k] = temp;
            n++;
            k--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rotateKtimesOptimzed(arr, k);

        for (int num : arr){
            System.out.println(num);
        }
    }
}
