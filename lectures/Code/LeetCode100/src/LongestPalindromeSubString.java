public class LongestPalindromeSubString {

    public static String longestPalindromeBruteForce(String str){

        int n = str.length();

        String ans = "";

        for(int i = 0; i < n; i++){

            for(int j = i; j < n; j++){

                String sub = str.substring(i , j + 1);
                if(isPalindrome(sub) && sub.length() > ans.length()){
                    ans = sub;
                }
            }
        }
        return ans;
    }

    public static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length() - 1;

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

        String str = "babad";

        String resultBrute = longestPalindromeBruteForce(str);
        System.out.println(resultBrute);
    }
}
