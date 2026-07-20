package PatternPrinting;

public class Pattern1 {

    public static void Pattern1(int n ){

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n; j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 5;
        Pattern1(n);

//        Time Complexity is O(N²) Quadric
//        Space Complexity is O(1) Constant

    }
}
