import java.util.HashMap;
import java.util.Map;

public class HashMpa {

    public static void main(String[] args) {


        HashMap<String, Integer> map = new HashMap<>();

        map.put("John", 23);
        map.put("Jane" , 30);
        map.put("Jim", 22);
        map.put("Jin", 22);



        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
