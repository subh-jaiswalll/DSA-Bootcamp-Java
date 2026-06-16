public class RotateImage {

    public static void main(String[] args) {

       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i = 0; i < matrix.length; i++){

            for (int j = 0; j < matrix[0].length; j++){

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

       for(int i = 0; i < matrix.length; i++){

           for(int j = 0; j < i; j++){

               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
           }
       }

       for(int i = 0; i < matrix.length; i++){

           int stCol= 0;
           int endCol = matrix[0].length - 1;

           while (stCol <= endCol){

               int temp = matrix[i][stCol];
               matrix[i][stCol] = matrix[i][endCol];
               matrix[i][endCol] = temp;
               stCol++;
               endCol--;

           }

       }

       for(int i = 0; i < matrix.length; i++){

           for (int j = 0; j < matrix[0].length; j++){

               System.out.print(matrix[i][j] + " ");
           }
           System.out.println();
       }
    }
}
