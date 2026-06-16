public class FindLargest {

    public static int findLargest(int[] arr){

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){

            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2,33, 5,0};
        int result = findLargest(arr);
        System.out.println(result);
    }
}
