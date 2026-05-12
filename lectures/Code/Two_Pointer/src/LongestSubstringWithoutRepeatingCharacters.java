import java.util.HashSet;


//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
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


    static int longestSubstringTwoPointer(String s){

        int n = s.length();

        int maxLen = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for(int right = 0; right < n; right++){

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int resultBruteForce = longestSubStringBruteForce(s);
        System.out.println(resultBruteForce);

        int resultTwoPointer = longestSubstringTwoPointer(s);
        System.out.println(resultTwoPointer);

    }
}
