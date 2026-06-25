public class MergeSortedArray {


    public static void mergeSortedBrute(int[] arr1, int m,  int[] arr2, int n){

        int[] temp = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n){
            if(arr1[i] <= arr2[j]){
                temp[k++] = arr1[i++];
            }
            else {
                temp[k++] = arr2[j++];
            }
        }

        while (i < m){
            temp[k++] = arr1[i++];
        }
        while (j < n){
            temp[k++] = arr2[j++];
        }

        for(int p = 0; p < m + n; p++){
            arr1[p] = temp[p];
        }

    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2, 5, 6};

        int m = 3;
        int n = 3;
        mergeSortedBrute(arr1, m, arr2, n);

        for(int i =0 ;i < m + n; i++){
            System.out.println(arr1[i]);
        }
    }
}
