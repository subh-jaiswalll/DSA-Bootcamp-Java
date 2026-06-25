import java.rmi.server.RemoteRef;
import java.util.HashSet;

public class LongestSubString {

   public static int longestSubStringBrute(String s){

       int n = s.length();

       int maxLen = 0;

       for(int i = 0; i < n; i++){

           for(int j = i; j < n; j++){

               if(isUnique(s, i, j)){
                   maxLen = Math.max(maxLen, j - i + 1);
               }
           }

       }
       return maxLen;
   }

   public static boolean isUnique(String s, int start, int end){

       for(int i = start; i <= end; i++){

           for(int j = i+ 1; j <= end; j++){

               if(s.charAt(i) == s.charAt(j)){
                   return false;
               }
           }
       }
       return true;
   }

   public static int longestSubStringTwoPointer(String s){

       int n = s.length();
       int start = 0;
       int maxLen = 0;
       HashSet<Character> set = new HashSet<>();
       for(int end = 0 ; end < n; end++){


           while (set.contains(s.charAt(end))){
               set.remove(s.charAt(start));
               start++;
           }
           set.add(s.charAt(end));
           maxLen = Math.max(maxLen, end - start + 1);

       }
return maxLen;

   }
    public static void main(String[] args) {

        String str = "abcdacb";
        int resultBrute = longestSubStringBrute(str);
        System.out.println(resultBrute);

        int resultTwoPointer = longestSubStringTwoPointer(str);
        System.out.println(resultTwoPointer);


    }
}
