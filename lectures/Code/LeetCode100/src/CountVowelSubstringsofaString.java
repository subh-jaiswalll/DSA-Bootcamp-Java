import java.util.HashMap;
import java.util.HashSet;

public class CountVowelSubstringsofaString {


    public static int countVowelSubString(String str){

        int n = str.length();
        int count = 0;

        for(int i = 0; i < n; i++){

            HashSet<Character> set = new HashSet<>();

            for(int j = i; j < n; j++){

                char ch = str.charAt(j);

                if(!isVowel(ch)){
                    break;
                }

                set.add(ch);


                if(set.size() == 5){
                     count++;
                }
            }
        }
        return  count;
    }

    public static boolean isVowel(char ch){

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {

        String str = "aeiouu";
        int result = countVowelSubString(str);
        System.out.println(result);
    }
}
