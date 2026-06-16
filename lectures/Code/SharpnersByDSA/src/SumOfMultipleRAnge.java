public class SumOfMultipleRAnge {

    public static int sumOfMulti(int n, int x){

        int sum = 0;
        for(int i = 0; i <= n; i++){

            if (i % x == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        int x = 3;

        int result = sumOfMulti(n, x);
        System.out.println(result);
    }
}
