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

    public static void main(String[] args) {

        int[] arr = {1,8,6,2,5,4,8,3,7};

        int result = containerWithMostWaterBruteForce(arr);
        System.out.println(result);
    }
}
