public class ANumberOfDoubleReversal {


    public static boolean isSameAfterReversals(int num) {
        return reverse(reverse(num)) == num;
    }

    public static int reverse(int num){
        int temp = num;
        int rem = 0;
        while (temp > 0) {
            rem = rem * 10 + temp % 10;
            temp /= 10;
        }
        return rem;
    }
    public static void main(String[] args) {

        int rev = 526;
        boolean result = isSameAfterReversals(rev);
        System.out.println(result);
    }
}
