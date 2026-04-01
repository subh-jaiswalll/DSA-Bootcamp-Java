public class PatternPrint {


    public static void Pattern1(){

//        1.  *****
//                *****
//                *****
//                *****
//                *****


        for(int i = 1; i <= 5; i++){


            for(int j = 1; j <= 5; j++){
                System.out.print("* ");

            }
            System.out.println();

        }

    }

    static void Pattern2(){

//        2.      *
//                **
//                ***
//                ****
//                *****

        for(int i = 1; i <= 5; i++){

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern3(){
//        3.  *****
//                ****
//                ***
//                **
//                *

        for (int i = 5; i >= 1; i--){

            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern4(){
//        4.  1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

        for(int i = 1; i <= 5; i++){

            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Pattern5(){
//        5.  *
//                **
//                ***
//                ****
//                *****
//                ****
//                ***
//                **
//                *

        for(int i = 1; i <= 9; i++){

            int stars = (i <= 5) ? i : 10 - i;
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        for(int i = 4; i >= 1; i--){
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }


    public static void Pattern6(){

//        6.          *
//                   **
//                  ***
//                 ****
//                *****


        for(int i = 1; i <= 5; i++){

            for(int space = 5; space >= i - 1; space--){
                System.out.print(" ");
            }

            for(int j = i; j >= 1; j-- ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern7(){
//     *****
//      ****
//       ***
//        **
//         *

        for(int i = 1; i <= 5; i++){
            for(int space = 1; space <= i -1; space++){
                System.out.print(" ");
            }

            for(int j = 1; j <= 5 - i +  1; j++){
                System.out.print("*");
            }


            System.out.println();

        }
    }

    public static void Pattern8(){
//        *
//       ***
//      *****
//     *******
//    *********

        for(int i = 1; i <= 5; i++){

            for(int space = 5; space >= i - 1; space--){
                System.out.print(" ");
            }

            for(int star = 1; star <= 2 * i - 1; star++){
                System.out.print("*");
            }

//            for(int j = )

            System.out.println();
        }


    }



    public static void main(String[] args) {


//        Pattern1();
//        Pattern2();
//        Pattern3();
//        Pattern4();
//        Pattern5();
//        Pattern6();
//        Pattern7();
        Pattern8();
    }
}
