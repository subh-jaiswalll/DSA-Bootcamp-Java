package PatternPrinting;

public class Pattern5 {


    public static void pattern5(int n){

        for(int i = 1; i <= n; i++){

            for(int j = i; j <= n; j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int n = 5;
        pattern5(n);
    }
}
