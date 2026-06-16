public class FirstMissingPositive {


    public static int missingPositiveCyclicSort(int[] arr){

        int n = arr.length;
        int i = 0;

        while (i < n){

            int correct = arr[i] - 1;

            if(arr[i] > 0 && arr[i] <= n && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }

        for(int j =0; j < n; j++){

            if(arr[j] != j + 1){
                return  j+ 1;
            }
        }
        return n + 1;
    }

    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,0};
        int result = missingPositiveCyclicSort(arr);
        System.out.println(result);
    }
}
