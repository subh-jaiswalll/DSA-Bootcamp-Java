public class ValidPalindrome {

    public static boolean isValidPalindrome(String s){

        int n = s.length();

        int start = 0;
        int end = n - 1;

        while (start < end){

            while (start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }

            while (start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }

            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        boolean result = isValidPalindrome(s);
        System.out.println(result);
    }
}
