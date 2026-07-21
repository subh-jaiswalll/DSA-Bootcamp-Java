import java.util.HashSet;

public class CountNumberAfterReverseOperatioin {

    public static int countDistinctIntegers(int[] nums){

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){

            int rev = reverse(num);
            set.add(rev);
            set.add(num);
        }
        return set.size();
    }

    public static int reverse(int num){
        int rev = 0;
        while (num > 0){
            rev = rev * 10 + num % 10;
            num/=10;
        }
        return rev;
    }
    public static void main(String[] args) {

        int[] arr = {1,13,10,12,31};
        int result = countDistinctIntegers(arr);
        System.out.println(result);
    }
}
