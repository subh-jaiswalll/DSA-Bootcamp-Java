import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckArrayEquals {

    public static boolean CheckArrayBrute(int[] a, int[] b){

        if(a.length != b.length){
            return  false;
        }

        int n = a.length;

        boolean[] seen = new boolean[n];

        for(int i = 0; i < n; i++){
            boolean found = false;

            for(int j = 0; j < n; j++){

                if(a[i] == b[j] && !seen[j]){
                    found = true;
                    seen[j] = true;
                    break;
                }
            }

            if(!found){
                return false;
            }
        }

        return true;
    }

    public static boolean CheckArrayHashMap(int[] a, int[] b){
        if(a.length != b.length){
            System.out.println(false);;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : a){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : b){

            if(!map.containsKey(num)){
                return false;
            }

            map.put(num, map.get(num) - 1);

            if(map.get(num) == 0){
                map.remove(num);
            }
        }

        // Step 3: Final check
        return map.isEmpty();


    }
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 5, 5};
        int[] b = {1, 2, 3, 4, 5};

        System.out.println(CheckArrayHashMap(a, b)); // ✅ FIXED


    }
}
