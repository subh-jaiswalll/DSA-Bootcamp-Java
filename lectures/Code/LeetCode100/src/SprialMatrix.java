import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {

    public static List<Integer> spiralOrder(int[][] arr){

        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        ArrayList<Integer> list = new ArrayList<>();

        while (top <= bottom && left <= right){

            for(int i = left; i <= right; i++){
                list.add(arr[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++){
                list.add(arr[i][right]);
            }
            right--;

            if(top <= bottom){

                for(int i = right; i >= left; i--){
                    list.add(arr[bottom][i]);
                }
                bottom--;


                for(int i = bottom; i >= top; i--){
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
        return list;
    }

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }
}
