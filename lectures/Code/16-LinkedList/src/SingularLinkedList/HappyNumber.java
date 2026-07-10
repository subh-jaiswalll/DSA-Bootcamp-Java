public class HappyNumber {


    public boolean happyNumber(int n){

        int slow = n;
        int fast = n;

        do{
            slow = getSqure(slow);
            fast = getSqure(getSqure(fast));
        }
        while (slow != fast);

        return slow == 1;
    }

    public int getSqure(int n){

        int sum = 0;

        while ( n > 0){
            int digit = n % 10;
            sum += digit * digit;

            n = n / 10;
        }
        return  sum;
    }

    public static void main(String[] args) {
        int n = 19;

        HappyNumber obj = new HappyNumber();

        boolean result = obj.happyNumber(n);

        System.out.println(result);
    }
}
