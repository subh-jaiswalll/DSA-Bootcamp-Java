
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/


public class RemoveDuplicateFromSortedArray {


    static int removeDuplicateBruteForce(int[] arr){

        int n = arr.length;

        int[] temp = new int[n];

        int j = 0;
        temp[j++] = arr[0];

        for(int i = 1; i < n; i++){

            if(arr[i] != arr[i -1]){
                temp[j++] = arr[i];
            }
        }

        for(int i = 0; i < j; i++){
            arr[i] = temp[i];
        }
        return j;
    }



    static  int removeDuplicateTwoPointer(int[] arr){
        int n = arr.length;

        int i = 0;

        for(int j = 1; j < n; j++){

            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }

        }
        return i + 1;
    }
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 3};

        int result = removeDuplicateBruteForce(arr);

        for(int i = 0; i < result; i++){
            System.out.println(arr[i] + " ");
        }
        int resultTwoPointer = removeDuplicateTwoPointer(arr);


        for(int i = 0; i < resultTwoPointer; i++){
            System.out.println(arr[i]);
        }
    }
}
