public class SortColors {


    static void sortColorsTwoPointer(int[] arr){

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid <= high){

            if(arr[mid] == 0){
                swap(arr, mid, low);
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr, mid, high);
                high--;
            }
        }

        for(int num : arr){
            System.out.print(num  + " ");
        }

    }
    static void swap(int[] arr, int low, int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColorsTwoPointer(arr);
    }
}
