

//https://leetcode.com/problems/move-zeroes/description/
public class moveZeroes {

    static void moveZeroesBruteForce(int[] arr){
        int n = arr.length;

        int[] temp = new int[n];
        int j = 0;

        for(int i = 0; i < n; i++){

            if(arr[i] != 0){
                temp[j++] = arr[i];
            }
        }

        while (j < n){
            temp[j++] = 0;
        }

        for (int i = 0; i < n; i++){
            arr[i] = temp[i];
        }


        for (int num : arr){
            System.out.print(num + " ");
        }

    }


    static void moveZeroesTwoPointer(int[] arr){
        int n = arr.length;
        int i = 0;
        for(int j = 0; j < n; j++){

            if(arr[j] !=  0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};
        moveZeroesTwoPointer(arr);

        moveZeroesBruteForce(arr);
    }
}
