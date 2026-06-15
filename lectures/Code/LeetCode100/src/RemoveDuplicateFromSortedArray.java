import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {


    public static int[] removeDuplicate(int[] arr){

        int n = arr.length;

        int[] temp = new int[n];
        int k = 0;

        temp[k++] = arr[0];

        for(int i = 1; i < n; i++){

            if(arr[i] != arr[i - 1]){
                temp[k++] = arr[i];
            }
        }

        for(int i = 0; i < k; i++){

            arr[i] = temp[i];
        }
        return temp;
    }


    public static int removeDuplicateTwoPointer(int[] arr){

        if(arr.length == 0){
            return 0;
        }

        int i = 0;

        for(int j = 1; j < arr.length; j++){

            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 3, 5};
//        int[] result = removeDuplicate(arr);
//        System.out.println(Arrays.toString(result));

        System.out.println(removeDuplicateTwoPointer(arr));
    }
}
