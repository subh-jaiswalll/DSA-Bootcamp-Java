import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Sring {

//    public static void main(String[] args) {
//        Reverse a String

        String str = "Hello";
//
//        String rev = " ";
//
//        for(int i = str.length() - 1; i >= 0; i--){
//            rev += str.charAt(i) + " ";
//        }
//        System.out.println(rev);

//        char[] rev = str.toCharArray();
//
//        int start = 0;
//        int end = str.length() - 1;
//
//        while (start < end){
//            char temp = rev[start];
//            rev[start] = rev[end];
//            rev[end] = temp;
//
//            start++;
//            end--;


//        }
//        System.out.println(rev);
//    }

//    public static void main(String[] args) {
//        //palindrome
//
//        String str = "madam";
//        String rev = "";
//
//        for(int i = str.length() - 1; i >= 0; i--){
//            rev  = rev +  str.charAt(i);
//        }
//        System.out.println(rev);
//        System.out.println(str.equals(rev));
//
//        int start = 0;
//        int end = str.length() - 1;
//
//        char[] arr = str.toCharArray();
//
//        while (start < end){
//            char temp =  arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//
//            start++;
//            end--;
//        }
//
//        System.out.println(str.equals(rev));
//    }

//    public static void main(String[] args) {
//        count vowels and consonents

//        String str = "aeiqea31ou";

//        int vowels = 0;
//        int consonents  = 0;
//
//        str = str.toLowerCase();
//
//        for(int i = 0; i < str.length(); i++){
//            char ch = str.charAt(i);
//
//            if(ch >= 'a' && ch <= 'z'){
//                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//                    vowels++;
//                }
//                else {
//                    consonents++;
//                }
//            }
//        }
//        System.out.println(vowels);
//        System.out.println(consonents);

//        HashSet<Character> vowelset = new HashSet<>();
//
//        vowelset.add('a');
//        vowelset.add('e');
//        vowelset.add('i');
//        vowelset.add('o');
//        vowelset.add('u');
//
//        str = str.toLowerCase();
//        int vowel = 0;
//        int consents = 0;
//
//        for(char ch : str.toCharArray()){
//
//            if(ch >= 'a' && ch <= 'z'){
//                if(vowelset.contains(ch)){
//                    vowel++;
//                }
//                else {
//                    consents++;
//                }
//            }
//        }
//        System.out.println(vowel);
//        System.out.println(consents);
//
//    }

//    public static void main(String[] args) {
////        firstnonreapting charter
//
//        String str = "swiss";

//        int n = str.length();
//
//        for(int i = 0; i < n; i++){
//            boolean unique = true;
//
//            for(int j = 0; j < n; j++){
//                if(i != j && str.charAt(i) == str.charAt(j)){
//                    unique = false;
//                    break;
//                }
//            }
//            if(unique){
//                System.out.println(str.charAt(i));
//                break;
//            }
//        }
//
//        HashMap<Character, Integer> feq = new HashMap<>();
//
//        for(char ch : str.toCharArray()){
//            feq.put(ch, feq.getOrDefault(ch, 0) +1);
//
//        }
//
//        for (char ch : str.toCharArray()){
//            if(feq.get(ch) == 1){
//                System.out.println((ch));
//                break;
//            }
//        }
//    }
public static void main(String[] args) {
//    valid anagaram

    String str = "listen";
    String st = "silent";

    if(str.length()  != st.length()){
        System.out.println(false);
    }

    char[] arr = str.toCharArray();
    char[] ar = st.toCharArray();

    Arrays.sort(arr);
    Arrays.sort(ar);

    System.out.println(Arrays.equals(ar, arr));
}
}
