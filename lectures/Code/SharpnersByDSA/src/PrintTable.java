public class PrintTable {

    public static void main(String[] args) {

        int start = 2;
        int end = 4;

        for(int i = start; i <= end; i++){

            for (int  j = 1; j <= 10; j++){

                if(j == 10){
                    System.out.print(j * i);
                }
                else {
                    System.out.print(j * i + " ");
                }
            }
            System.out.println();
        }
    }
}
