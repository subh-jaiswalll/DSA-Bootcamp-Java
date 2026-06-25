import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicateBrute(int[] arr){

        int n = arr.length;

        for(int i = 0; i < n; i++){

            for(int j = i  + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicateHashSet(int[] arr ){

        int n = arr.length;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){

            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3,  4, 5};
        boolean result = containsDuplicateBrute(arr);
        System.out.println(result);

        boolean resultHashSet = containsDuplicateHashSet(arr);
        System.out.println(resultHashSet);
    }
}
