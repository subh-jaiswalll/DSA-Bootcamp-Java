public class print {

//    public static void Pattern1(){
//
//        for(int i = 1; i <= 5; i++){
//
//            for(int space = 5; space > i; space--){
//                System.out.print(" ");
//            }
//
//            for(int j = 1; j <= 2 * i - 1; j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//
//    }

    public static void Pattern2(){
        for(int i = 1; i <= 9; i++){

            int stars = (i <= 5) ? i : 10 - i;

            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern3(){

        for(int i = 5; i >= 1; i--){

            for(int space = 5; space >= i - 1; space--){
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i -1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void Pattern5(){

        for(char i = 'A'; i <= 'E'; i++){

            for( char j = 'A'; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        Pattern1();
//        Pattern2();
//        Pattern3();
        Pattern5();
    }
}
