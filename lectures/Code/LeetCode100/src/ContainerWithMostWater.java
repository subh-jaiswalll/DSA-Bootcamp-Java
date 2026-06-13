public class ContainerWithMostWater {

    public static int containerWaterBrute(int[] height){

        int n = height.length;
        int maxWater = 0;

        for(int i = 0; i < n; i++){

            for(int j = i  + 1; j < n; j++){

                int minHeight = Math.min(height[i], height[j]);

                int width = j - i;

                int water = minHeight * width;

                maxWater = Math.max(maxWater, water);
            }
        }

        return maxWater;
    }

    public static int containerWaterTwoPointer(int[] height){

        int n = height.length;
        int left = 0;
        int right = n -1;
        int maxWater = 0;

        while (left < right){
            int minHeight = Math.min(height[left], height[right]);

            int width = right - left;

            int water = minHeight * width;

            maxWater = Math.max(maxWater, water);

            if(height[left] < height[right]){
                left++;
            }
            else {
                right--;
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
