public class LongestSubstringWithoutRepeatingCharacters {


    static int longestSubStringBruteForce(String s){

        int n = s.length();
        int maxLen = 0;

        for(int i = 0 ; i < n; i++){

            for(int j = i; j < n; j++){

                if(isUnique(s, i , j)){
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }


    static boolean isUnique(String s, int start, int end){

        for(int i = start; i <= end; i++){

            for(int j = i + 1; j <= end; j++){

                if(s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int resultBruteForce = longestSubStringBruteForce(s);
        System.out.println(resultBruteForce);
    }
}
