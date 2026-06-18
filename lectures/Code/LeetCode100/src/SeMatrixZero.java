public class SeMatrixZero {

    public static void setMatrixZeroBrute(int[][] arr){

        int rows = arr.length;
        int cols = arr[0].length;

        boolean[] row = new boolean[rows];
        boolean[] col = new boolean[cols];

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < cols; j++){

                if(arr[i][j] == 0){
                    row[i] = true;
                    col[j]  = true;
                }
            }


        }

        for (int i = 0; i < rows; i++){

            for(int j = 0; j < cols; j++){

                if(row[i] || col[j]){
                    arr[i][j] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        setMatrixZeroBrute(matrix);

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
