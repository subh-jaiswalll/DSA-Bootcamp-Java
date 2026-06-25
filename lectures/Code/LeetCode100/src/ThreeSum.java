import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class ThreeSum {


    public static List<List<Integer>> threeSumBrute(int[] arr){

        int n = arr.length;

        HashSet<List<Integer>> list = new HashSet<>();
        for(int i = 0; i < n; i++){

            for(int j = i + 1; j < n; j++){

                for(int k = j + 1; k < n; k++){

                    int sum = arr[i] + arr[j] + arr[k];

                    if(sum == 0){
                        List<Integer> triple = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(triple);
                        list.add(triple);
                    }
                }
            }
        }
        return new ArrayList<>(list);
    }

    public static List<List<Integer>> threeSumHashSet(int[] arr){

        int n = arr.length;
        Arrays.sort(arr);

        HashSet<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < n - 2; i++){

            if(i > 0 && arr[i] == arr[i - 1]){
                continue;
            }

            int start = i + 1;
            int end = n - 1;

            while (start < end){

                int sum = arr[i] + arr[start] + arr[end];

                if(sum == 0){
                    set.add(Arrays.asList(arr[i], arr[start], arr[end]));

                    start++;
                    end--;
                }
                else if(sum > 0){
                    end--;
                }
                else {
                    start++;
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};

        List<List<Integer>> result = threeSumBrute(arr);
        System.out.println(result);

        List<List<Integer>> resultHash = threeSumHashSet(arr);
        System.out.println(resultHash);
    }
}
