public class JumpGame {

    public static boolean jumpGameBrute(int[] arr) {
        return helper(arr, 0);
    }

    public static boolean helper(int[] num, int index) {

        if (index >= num.length - 1) {
            return true;
        }

        int jump = num[index];

        for (int i = 1; i <= jump; i++) {

            if (helper(num, index + i)) {
                return true;
            }
        }

        return false;
    }


    public static boolean jumpGameGreedy(int[] arr){

        int reachable = 0;

        for(int i =0;  i < arr.length; i++){

            if(i > reachable){
                return false;
            }

            reachable = Math.max(reachable, i + arr[i]);
        }

        return true;
    }
    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 1, 4};

        boolean resultBrute = jumpGameBrute(arr);

        System.out.println(resultBrute);

        System.out.println(jumpGameGreedy(arr));
    }
}