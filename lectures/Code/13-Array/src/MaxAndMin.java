import java.util.Arrays;

public class MaxAndMin {


    public static int[] maxAndMinLinear(int[] arr){

        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){

            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }

        return new int[]{max, min};

    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3,4, 5};
        System.out.println(Arrays.toString(maxAndMinLinear(arr)));
    }
}
