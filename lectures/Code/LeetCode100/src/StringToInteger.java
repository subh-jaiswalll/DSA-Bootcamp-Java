public class StringToInteger {

    public static int stringToInteger(String s){

        int n = s.length();

        if(n == 0 || s == null){
            return 0;
        }

        final int MAX_VALUE = Integer.MAX_VALUE;
        final int MIN_VALUE = Integer.MIN_VALUE;
        int i = 0;

        while (i < n && s.charAt(i) == ' '){
            i++;
        }

        if(i == n){
            return 0;
        }

        int sign = 1;

        if(s.charAt(i) == '+'){
            i++;
        }
        else if(s.charAt(i) == '-'){
            sign  = -1;
            i++;
        }

        long res  = 0;

        while (i < n && Character.isDigit(s.charAt(i))){

            int digit = s.charAt(i) - '0';

            res = res * 10 + digit;

            if(sign * res <= MIN_VALUE){
                return MIN_VALUE;
            }

            if(sign * res >= MAX_VALUE){
                return MAX_VALUE;
            }
            i++;
        }

        return (int)(res * sign);
    }

    public static void main(String[] args) {






        String s = "-02ad4";
        System.out.println(stringToInteger(s));
    }
}
