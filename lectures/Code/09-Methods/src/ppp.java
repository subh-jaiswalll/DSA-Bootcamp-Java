/*

public class ppp {






    public static void main(String[] args) {





        add a two  number

        Scanner sc = new Scanner(System.in);

        int num1, num2, sum;

        System.out.print("Enter your first number: ");
         num1 = sc.nextInt();

        System.out.print("Enter your second number: ");
         num2 = sc.nextInt();

         sum = num1 + num2;

        System.out.println("Sum two number: " + sum);

    }
}
import java.util.Scanner;

public class ppp {

   static void Sum(){

        Scanner sc = new Scanner(System.in);

        int num1, num2, sum;

        System.out.print("Enter your first number: ");
         num1 = sc.nextInt();
        System.out.print("Enter your second number: ");
         num2 = sc.nextInt();
         sum = num1 + num2;
        System.out.println("Sum two number: " + sum);
    }

    public static void main(String[] args) {
        Sum();
        Sum();


    }
}
public class ppp {

    static String greet(){
        System.out.println("Hello Java");
        return "Hii C++";
    }

    public static void main(String[] args) {
        String greet = greet();
        System.out.println(greet);
    }
}
public class ppp {

    static int add(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your first Number: " );
        int num1 = sc.nextInt();

        System.out.print("Enter your Second Number: " );
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        return sum;
    }
    public static void main(String[] args) {
        int ans = add();
        System.out.println(ans);

    }
}
public class ppp {

    static int sum(int a, int b){
        return a + b;
    }

    static String greet(String name){
        return "Hello "+ name;
    }


    public static void main(String[] args) {

        String greets = greet("Atul");
        System.out.println(greets);

        int ans = sum(5, 10);
        System.out.println(ans);
    }
}
public class ppp {

    static void Swap(int a, int b){
        int temp = a;
        a =b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {

        Swap(20, 40);
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
*/

// Scope fo methodn variable inthe main functioni of  real value in th major code

//
//public class ppp {
////    int x = 20;
//
//    static void value(){
////        int x = 10;
////        System.out.println(x);
//
//        if(true){
//            int x = 20;
//
//        }
//
////        System.out.println(x);
//    }
//
//
//
//    public static void main(String[] args) {
//

import java.util.Scanner;

////        value();
/*

        for(int i = 0; i<=5; i++){
            int x= 10;
            x = 20;
            System.out.println(i);
        }

    }
}
 Variable Arugement
public class ppp {

    static void Sum(String ...x){
        System.out.println(Arrays.toString(x));
    }

    public static void main(String[] args) {

        Sum("Atul", "Jaiswal");
    }
}
public class ppp {


    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

    static double add(double a, double b){
        return a + b;
    }
    public static void main(String[] args) {
        int sum = add(1,4);

        double sum1 = add(20.25, 23.25);

        System.out.println(sum +  " " + sum1);
    }
}
*/
/*

public class ppp {

    static void isPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a your number: ");

        int num = sc.nextInt();

        boolean isPrime = true;
        if (num <= 1){
            isPrime = false;
        }
        else {
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Prime Number: " + num);
        }
        else {
            System.out.println("Not a prime Number: " + num);
        }


    }

    public static void main(String[] args) {
        isPrime();
    }
}
ArmStrong number
public class ppp {



    static void ArmStrong(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        for (int i = num; i > 0; i = i / 10) {

            int digit = i % 10;
            sum = sum + (digit * digit * digit);
        }

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }


    public static void main(String[] args) {

        System.out.println("This is the logic where something done all above to get the logic behind on the surface of all over the error doing major things that all concept method overloading ");
        ArmStrong();
    }
}
*/


public class ppp {


    public static void main(String[] args) {

    }
}

