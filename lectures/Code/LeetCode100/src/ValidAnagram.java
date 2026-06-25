import java.beans.PropertyEditorManager;
import java.util.HashMap;

public class ValidAnagram {

    public static boolean validAnagramFreq(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++){

            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int count : freq){
            if(count != 0){
                return false;
            }
        }
        return true;
    }

    public static boolean validAngram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) +1);
        }

        for(char ch : t.toCharArray()){

            if(!map.containsKey(ch)){
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        boolean result = validAnagramFreq(s, t);
        System.out.println(result);

        boolean resultHashMap = validAngram(s, t);
        System.out.println(resultHashMap);
    }
}
