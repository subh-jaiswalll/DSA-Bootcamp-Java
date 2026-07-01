public class SingleNumber {

    public static int singleNumber(int[] arr){

        int xOr = 0;
        for (int num : arr){
            xOr ^= num;
        }
        return xOr;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int result = singleNumber(arr);
        System.out.println(result);
    }

}
