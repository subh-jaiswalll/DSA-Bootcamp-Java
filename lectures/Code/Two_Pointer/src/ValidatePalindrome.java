public class ValidatePalindrome {


    static boolean validatePalindromeBruteForce(String s){

        int n = s.length();
        String str = "";

         for(int i = 0; i < n; i++){

             char ch = Character.toLowerCase(s.charAt(i));

             if(Character.isLetterOrDigit(ch)){
                 str+=ch;
             }
         }

         String reversed = "";
         for(int i = str.length() - 1; i >= 0; i--){
             reversed += str.charAt(i);
         }

         return str.equals(reversed);

    }

    static boolean validatePalindromeTwoPointer(String str){

        str = str.toLowerCase();
        str = str.replaceAll("[^a-z0-9]", "");

        int n = str.length();

        for(int i = 0; i < n/2; i++){

            if(str.charAt(i) != str.charAt(n - 1 - i)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";
        boolean resultBruteForce = validatePalindromeBruteForce(str);
        System.out.println(resultBruteForce);

        boolean resultOptimzed = validatePalindromeTwoPointer(str);
        System.out.println(resultOptimzed);
    }
}
