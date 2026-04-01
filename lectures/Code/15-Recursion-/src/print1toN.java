public class print1toN {

//    static  int n = 5;

    public static void Print1TON(int n){
        if(n == 0){
           return;
        }
        Print1TON(n - 1);
        System.out.print(n + " ");
    }

    public static void printNto1(int n){
        if(n==0) return;
        System.out.print(n+" ");
        printNto1(n-1);
    }

    public static void printINCtoDEC(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printINCtoDEC(n - 1);

        if(n == 1){
            return;
        }
        System.out.print(n + " ");
    }

    public static void print1(int x, int n){
        if(x > n){
            return;
        }
        System.out.print(x + " ");

        print1(x + 1, n);
        System.out.print(x + " ");
    }

    public static int Fact(int x){

        if(x == 1 || x == 0){
            return 1;
        }

       return x * Fact(x - 1);

    }

    public static int fibbo(int x){

        if(x <= 1){
            return  x;
        }
       return  fibbo(x - 1) + fibbo(x - 2);
    }

    public static int gcd(int x, int y){

        if(x == 0){
            return y;
        }

        return gcd(y % x, x);
    }

    public static void main(String[] args) {
//        Print1TON(5);
//        System.out.println();
//        printNto1(5);
//        System.out.println();
//        printINCtoDEC(5);
//
//        System.out.println();
//        print1(1, 10);

//        System.out.println(Fact(5));
//        System.out.println(fibbo(10));
//        System.out.println(gcd(12, 12));


    }
}
