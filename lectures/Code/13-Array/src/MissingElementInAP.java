import java.util.HashSet;

public class MissingElementInAP {

    public static int missingBrute(int[] arr){
        int n = arr.length;
        int d = (arr[n - 1] - arr[0])/ n;

        for(int i = 0; i < n -1; i++){

            if(arr[i + 1] - arr[i] != d){
                return arr[i] + d;
            }


        }
        return -1;
    }

    public static int missingBinary(int[] arr){
        int n = arr.length;
        int d = (arr[n -1] - arr[0]) / n;
        int start = 0;
        int end = n - 1;

        while (start < end){
            int mid = start + (end -start) / 2;

            int expected = arr[0] + mid * d;

            if(arr[mid] == expected){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }

        return arr[0] + start * d;
    }

    public static int missingHashSet(int[] arr){
        int n = arr.length;
        int d = (arr[n - 1] - arr[0]) / n;

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        for(int i = 0; i <= n; i++){
            int expected = arr[0] + i * d;

            if(!set.contains(expected)){
                return expected;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 12, 14};
        System.out.println(missingHashSet(arr));
    }
}
