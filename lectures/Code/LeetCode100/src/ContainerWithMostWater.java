public class ContainerWithMostWater {

    public static int containerWaterBrute(int[] arr){

        int n = arr.length;

        int maxWater = 0;

        for(int i = 0; i < n; i++){

            for(int j = i + 1; j < n; j++){

                int minHeight = Math.min(arr[i], arr[j]);

                int width = j - i;

                int water = minHeight * width;

                maxWater = Math.max(maxWater, water);
            }
        }
        return maxWater;
    }

    public static int containerWaterTwoPointer(int[] arr){

        int n = arr.length;
        int start = 0;
        int end = n - 1;

        int maxWater = 0;

        while (start < end){

            int minHeight = Math.min(arr[start], arr[end]);
            int width = end - start;

            int water = minHeight * width;

            maxWater = Math.max(maxWater, water);

            if(arr[start] < arr[end]){
                start++;
            }
            else {
                end--;
            }
        }
        return maxWater;
    }


    public static void main(String[] args) {


        int[] arr = {1,8,6,2,5,4,8,3,7};
        int resultBrute = containerWaterBrute(arr);
        System.out.println(resultBrute);

        int resultTwoPointer = containerWaterTwoPointer(arr);
        System.out.println(resultTwoPointer);

    }
}
