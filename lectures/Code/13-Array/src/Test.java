import java.util.HashMap;
import java.util.Map;

public class Test {

//    public static void main(String[] args) {
//
//
//        for(int i = 5; i >= 1; i--){
//
//            for(int j = 1; j <= i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }

//    public static void main(String[] args) {
//        int[] arr = {10, 20, 8, 15};
//
//        int max = arr[0];
//
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }

//    public static void main(String[] args) {
//        int[] arr= {1, 2, 2, 3, 3, 3};
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for(int num : arr){
//            map.put(num, map.getOrDefault(num, 0) + 1);
//
//        }
//
//        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
//
//    }


//    public static void main(String[] args) {
//        String str = "madam";
//
//        String rev = "";
//
//        for(int i = str.length() - 1; i >= 0; i--){
//            rev = rev + str.charAt(i);
//        }
//
//        if(str.equals(rev)){
//            System.out.println("Palindrome ");
//        }
//        else {
//            System.out.println("Not a palindrome");
//        }
//    }


    public static void main(String[] args) {


        String input1 = "swiss";
        String input2 = "wsiss";

        if(input1.length() != input2.length()){
            System.out.println("Not a Angram");
        }



    }
}
