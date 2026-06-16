public class SetKthBit {


    public static int setKthBit(int n, int k){
        return n | (k << 1);

    }
    public static void main(String[] args) {
        int n = 5;
        int k = 2;

        int result = setKthBit(n, k);
        System.out.println(result);

    }
}
