import java.util.*;

public class Three3Sum {


    static List<List<Integer>> threeSumBruteForce(int[] arr){

        int n = arr.length;

        HashSet<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < n; i++){

            for(int j = i + 1; j < n; j++){

                for(int k = j + 1; k < n; k++){

                    if(arr[i] + arr[j] + arr[k] == 0){

                      List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);

                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    static List<List<Integer>> threeSumTwoPointer(int[] arr){

        int n = arr.length;

        Arrays.sort(arr);
        if(arr == null || n < 3){
            return new ArrayList<>();
        }

        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < n - 2; i++){

            int left = i + 1;
            int right = n - 1;

            while(left < right){

                int sum = arr[i] + arr[left] + arr[right];

                if(sum == 0){
                    set.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    left++;
                    right--;
                }
                else if(sum < 0){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};
//        List<List<Integer>> resultBruteForce = threeSumBruteForce(arr);
//        System.out.println(resultBruteForce);

        List<List<Integer>> resultTwoPointer = threeSumTwoPointer(arr);
        System.out.println(resultTwoPointer);

    }
}
