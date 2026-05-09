import java.util.HashMap;
import java.util.Map;

public class HashMpa {

    public static void main(String[] args) {


        HashMap<String, Integer> map = new HashMap<>();

//        m/ut("Jin", 22);



        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
