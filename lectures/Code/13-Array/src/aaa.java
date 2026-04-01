import java.util.HashMap;

public class aaa {

//    public static void main(String[] args) {
//
//        for(int i = 1; i <= 5; i++){
//
//            for(int j = 1; j <= i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }


//    public static void main(String[] args) {
//        int[] arr = {4, 2, 1, 6, 5};
//
//        for(int i = arr.length - 1; i >= 0; i--){
//            System.out.print(arr[i] + " ");
//        }
//    }

//    public static void main(String[] args) {
//
//        String str = "madam";
//
//        String rev = " ";
//
//
//        for(int i = str.length() ; i >= 0; i--){
//            rev = rev + i;
//        }
//
//        if(str == rev){
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("Not a palindrome");
//        }
//
//    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.getOrDefault(num, 0);

        }









    }
}
