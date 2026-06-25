public class CheckPalindrome {

    public static boolean checkPalindrome(String s){

        int n = s.length();
        int start = 0;
        int end = n - 1;

        while (start < end){

            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        boolean result = checkPalindrome(str);
        System.out.println(result);
    }
}
