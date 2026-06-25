public class FindTheMinimumInRotateSortedAarray {

    public static int minimumInSortedArray(int[] arr){

        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start < end){

            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[end]){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return arr[start];
    }
    public static void main(String[] args) {

        int[] arr = {3,4,5,1,2};
        int result = minimumInSortedArray(arr);
        System.out.println(result);
    }
}
