public class TappingRainWater {

    public static int tappingRainWater(int[] arr){

        int n = arr.length;
        int leftMax = 0;
        int rightMax = 0;

        int start =0;
        int end = n - 1;
        int totalWater = 0;

        while (start <= end) {

            leftMax = Math.max(leftMax, arr[start]);
            rightMax = Math.max(rightMax, arr[end]);

            if (leftMax < rightMax) {
                totalWater = totalWater + leftMax - arr[start];
                start++;
            } else {
                totalWater = totalWater + rightMax - arr[end];
                end--;
            }
        }
        return totalWater;
    }


    public static void main(String[] args) {

        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = tappingRainWater(arr);
        System.out.println(result);
    }
}
