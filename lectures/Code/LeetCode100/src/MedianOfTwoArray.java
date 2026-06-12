public class MedianOfTwoArray {


    public static double medianTwoArray(int[] arr1, int[] arr2){

        int m = arr1.length;
        int n = arr2.length;
        int[] merge = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n){

            if(arr1[i] <= arr2[j]){
                merge[k++] = arr1[i++];
            }
            else {
                merge[k++] = arr2[j++];
            }
        }

        while (i < m){
            merge[k++] = arr1[i++];
        }

        while (j < n){
            merge[k++] = arr2[j++];
        }

        int len = m + n;

        if (len % 2 == 1) {
            return merge[len / 2];
        }

        return  (merge[len / 2] + merge[len/ 2 - 1]) / 2.0;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3};
        int[] arr2 = {2 };

        double result = medianTwoArray(arr1, arr2);
        System.out.println(result);

    }
}
