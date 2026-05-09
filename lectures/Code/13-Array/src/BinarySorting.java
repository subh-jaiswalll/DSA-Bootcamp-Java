public class BinarySorting {

    public static void BinarySorting(int[] arr){

        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start < end){
            if(arr[start] == 0){
                start++;
            }
            else{
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                end--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 1, 0, 1, 0};

        BinarySorting(arr);

        for (int num : arr){
            System.out.println(num);
        }
    }
}
