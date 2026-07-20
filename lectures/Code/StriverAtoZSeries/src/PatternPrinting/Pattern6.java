package PatternPrinting;

public class Pattern6 {

    public static void pattern6(int n){

        for(int i = 1; i <= n; i++){

            for(int j = n; j >= i; j--){

                System.out.print(n - j + 1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int n = 5;
        pattern6(n);
//        Time Complexity O(N²) Quadric
//        Space Complexity O(1) Constant

    }
}
