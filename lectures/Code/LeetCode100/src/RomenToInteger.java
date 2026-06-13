import java.util.HashMap;

public class RomenToInteger {

    public static int romenToInteger(String s){
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;

        for(int i = 0; i < n; i++){

            int curr = map.get(s.charAt(i));

            if(i < n - 1 && curr < map.get(s.charAt(i + 1))){
                result -= curr;
            }
            else{
                result += curr;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String str = "LVIII";

        int result = romenToInteger(str);
        System.out.println(result);
    }
}
