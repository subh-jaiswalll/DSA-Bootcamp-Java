import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {


        HashMap<String, List<String>> ans = new HashMap<>();

        for(String s : strs){

            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            if(!ans.containsKey(key)){
                ans.put(key, new ArrayList<>());
            }

            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());
    }


    public static void main(String[] args) {

        String[] str = {"eat","tea","tan","ate","nat","bat"};

        List<List<String >> result = groupAnagrams(str);
        System.out.println(result);
    }
}
