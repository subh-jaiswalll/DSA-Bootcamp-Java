public class RemoveElement {


    static int removeElement(int[] arr, int val){
        int n = arr.length;

        int i = 0;

        for(int j = 0; j < n; j++){

            if(arr[j] != val){
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {

        int[] arr = {3,2,2,3};
        int val = 3;

        int resultTwoPointer = removeElement(arr, val);
        System.out.println(resultTwoPointer);
    }
}
