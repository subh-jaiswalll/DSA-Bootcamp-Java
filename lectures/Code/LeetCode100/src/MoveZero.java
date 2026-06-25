public class MoveZero {

    public static void moveZeroBrute(int[] arr){
        int n = arr.length;

        int[] temp = new int[n];
        int k = 0;

        for(int i = 0 ; i < n; i++){

            if(arr[i] != 0) {
                temp[k++] = arr[i];
            }
        }

        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }

    }

    public static void moveZero(int[] arr){

        int i = 0;

        for(int j = 0; j < arr.length; j++){

            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 0 ,2, 0, 1, 2, 6, 3, 0, 4};

//        moveZeroBrute(arr);
        moveZero(arr);
        for(int num: arr){
            System.out.println(num);
        }
    }
}
