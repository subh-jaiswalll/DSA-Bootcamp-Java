public class PowerOfTwo {

    public static boolean powerOfTwo(int n){
        if(n <= 0){
            return false;
        }
        while (n % 2 == 0){
            n = n/2;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        int n = 16;
        boolean result = powerOfTwo(n);
        System.out.println(result);
    }
}
