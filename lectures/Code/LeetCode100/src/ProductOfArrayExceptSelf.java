import java.util.Arrays;

public class ProductOfArrayExceptSelf {


    public static int[] productOfArrayBrute(int[] arr){
        int n = arr.length;
        int[] result = new int[n];


        for(int i = 0; i < n; i++){
            int product = 1;

            for(int j = 0; j < n; j++){

                if(i != j){
                    product *= arr[j];
                }
            }
            result[i] = product;
        }
        return result;
    }

    public static int[] productArrayPrefix(int[] arr){

        int n = arr.length;
        int[] result = new int[n];

        result[0] = 1;

        for(int i =1 ; i <n ;i++){
            result[i] = result[i - 1] * arr[i -1 ];
        }
        int suffix = 1;

        for(int i = n - 1; i >= 0; i--){
            result[i] = result[i] * suffix;
            suffix = suffix * arr[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int[] result = productOfArrayBrute(arr);
        System.out.println(Arrays.toString(result));

        int[] resultPrefix = productArrayPrefix(arr);
        System.out.println(Arrays.toString(resultPrefix));
    }
}
