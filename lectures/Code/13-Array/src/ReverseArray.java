public class ReverseArray {


    public static int[] Reverser(int[] arr, int length){

        int[] reversed = new int[length];

        for(int i = 0; i < length; i++){
            reversed[i] = arr[length - i -1];
        }
        return reversed;
    }
    public static void main(String[] args) {

        int[] arr = {1,2, 3, 4, 5};
        int length = 5;

        int[] result = Reverser(arr, length);

        for(int ans : result){
            System.out.print(ans);
        }

    }
}
