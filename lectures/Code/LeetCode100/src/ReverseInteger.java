public class ReverseInteger {


    public static int reverse(int num){

        int rev = 0;
        while (num != 0){

            int digit = num %  10;
            rev = rev * 10 + digit;
            num/=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int num = 123;

        int result = reverse(num);
        System.out.println(result);
    }
}

