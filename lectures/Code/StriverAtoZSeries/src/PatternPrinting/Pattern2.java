package PatternPrinting;

public class Pattern2 {

    public static void pattern2(int n){

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 5;
        pattern2(n);

//        Time Complexity O(N²) Quadric
//        Space Complexity O(1) Constant
    }
}
