public class SubarrayProductLessThanK {


    static int subArrayProductBruteForce(int[] arr, int k){

        int n = arr.length;
        int count = 0;


        for(int i = 0; i < n; i++){
            int product = 1;

            for(int j = i; j < n; j++){

                product = product * arr[j];

                if(product < k){
                    count++;
                }
                else {
                    break;
                }
            }
        }
        return count;
    }

    static int subArrayProductTwoPointer(int[] arr, int k){
        if(k <= 1){
            return  0;
        }
        int n = arr.length;
        int count = 0;
        int product = 1;
        int start = 0;
        int end = 0;

        while(end < n){
            product = product * arr[end];

            while (product >= k){
                product /= arr[start];
                start++;
            }

            count = count + (end - start + 1);
            end++;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 6};
        int k = 100;

        int resultBrute = subArrayProductBruteForce(arr, k);
        System.out.println(resultBrute);

        int resultTwoPointer = subArrayProductTwoPointer(arr, k);
        System.out.println(resultTwoPointer);
    }
}
