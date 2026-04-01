public class SubArrays {

    public static void SubSumArray(int[] arr){

        int sum = 0;
        int i =0;
        int n = arr.length;
        while (i < n){
            int j = i;
            while (j < n){
                int k = i;
                int len = j - i  + 1;
                if(len % 2 == 1){

                while (k <= j){


//                    System.out.print(arr[k]);
                    sum = sum + arr[k];

                    k = k + 1;
                }
                }
//                System.out.println();
                j = j + 1;
            }
            i = i + 1;

        }
        System.out.println(sum);
//        System.out.println(oddsum);


    }






    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3, 7, 8, 9};

        SubSumArray(arr);
    }
}
