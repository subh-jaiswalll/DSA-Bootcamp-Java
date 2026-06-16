public class PowNToX {

    public static double powXtoN(double x, int n){

        if(n < 0){
            n = -n;
            x = 1/ x;
        }

        double pow = 1;

        while(n != 0){

            if((n & 1) != 0){
                pow *= x;
            }

            x *= x;

            n >>>= 1;
        }

        return pow;
    }

    public static void main(String[] args) {

        double x = 2.0000;
        int n = 10;

        double result = powXtoN(x, n);
        System.out.println(result);

    }
}
