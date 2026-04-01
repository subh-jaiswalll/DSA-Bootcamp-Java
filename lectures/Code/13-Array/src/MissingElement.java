public class MissingElement {

    public static int missingElement(int[] nums, int n){


        int total = n * (n + 1)/2;
        int sum = 0;

        for(int num: nums){
            sum = sum + num;
        }


        return  total - sum;






    }

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 5, 6, 7};
        int n = 7;
        System.out.println(missingElement(nums, n));

    }
}
