public class FibonacciNumber {

    public static void main(String[] args) {
        int n = 6;

        int a = 0;
        int b = 1;

        if(n == 1 || n == 2){
            System.out.println(0);
            return;
        }

        for (int i = 2; i < n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}
