public class SortColors {

    public static void sortColors(int[] arr){

        int n = arr.length;
        int start = 0;
        int end = n - 1;

        int mid = 0;

        while (start <= end){

            if(arr[mid] == 0){
                swap(arr, start, mid);
                start++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else {
                swap(arr, mid, end);
                end--;
            }
        }

    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 3, 0, 3, 0};
        sortColors(arr);

        for(int num : arr){
            System.out.println(num);
        }
    }
}
