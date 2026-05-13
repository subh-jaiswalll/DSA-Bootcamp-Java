public class ContainerWithMostWater {


    static int containerWithMostWaterBruteForce(int[] height){

        int n = height.length;

        int maxWater = 0;

        for(int i = 0; i < n; i++){

            for(int j = i + 1; j < n; j++){

                int width = j - i;

                int minHeight = Math.min(height[i], height[j]);

                int water = width * minHeight;

                maxWater = Math.max(maxWater, water);
            }
        }

        return maxWater;
    }

    static int containerWithMostWaterTwoPointer(int[] height){
        int n = height.length;

        int left = 0;
        int right= n - 1;
        int maxWater = 0;

        while(left < right){

            int h = Math.min(height[left], height[right]);

            int w = right - left;

            int water = h * w;

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

        int result = containerWithMostWaterBruteForce(arr);
        System.out.println(result);

        int resultTwoPointer = containerWithMostWaterTwoPointer(arr);
        System.out.println(resultTwoPointer);
    }
}
