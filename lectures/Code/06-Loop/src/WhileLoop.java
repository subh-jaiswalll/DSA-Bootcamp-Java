import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        //while loop

//        while (condition){
//            //code repeat hoga
//        }


//        1. Number print

//        int i = 1;
//
//        while (i <= 10){
//
//            System.out.println(i);
//            i++;
//        }


//        2. Even Number

//        int i = 2;
//
//        while (i <= 10){
//            System.out.println(i);
//            i = i + 2;
//        }

//        3. Table print

//        int i = 1;
//
//        int num = 19;
//
//        while (i <= 10){
//
//            System.out.println(num + " x " + i + " = " + (num * i));
//            i++;
//        }
//

//        for (int i = 1; i < 20; i++) {
//
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//
//        int i = 1;
//        while (i <= 20){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//            i++;
//        }
//        int n = 49;
//        int odd = 0;
//
//        for(int i = 1; i <= n; i++){
//
//            if(i % 2 != 0){
////                odd = odd + i;
//            System.out.println(i);
//            }
//
//
////            System.out.println(i);
//        }

//        int i = 1;
//int n = 100;
//        while(i <= n){
//            int squre = i * i;
//
//            System.out.println(squre);
//
//            i++;
//        }
//
//        int n = 12345;
//        for(int i = 0; i <= n; i = i / 10){
//
//            int digit = n / 10;
//
//
//            System.out.println(digit);
//        }
//        int a = 5;
//        int b = a;
//        a = 10;
//        System.out.println(a);




            Scanner sc=new Scanner(System.in);
            int n =sc.nextInt();

            int[] output = prime_numbers(n);
            for(int i=0;i<n;i++)
                System.out.println(output[i]);
        }



    public static int[] prime_numbers(int n)
    {
        /* Function to store first n prime_numbers in an array
            Return the array containing the prime numbers*/

        int[] arr = new int[n];
        int i = 0;
        int p = 2;

        while(i < n){
            boolean flag = true;

            for(int j = 2; j < p; j++){
                if(p % j == 0){
                    flag = false;
                    break;
                }
            }

            if(flag){
                arr[i] = p;
                i = i + 1;
            }
            p = p + 1;
        }
        return arr;






        /* Dont change anything below. If changed click on reset. */


    }
}
