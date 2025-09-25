import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public static void main(String [] args){
        int [] arr = {1,5,2,5,7,-1};
        sortRecursion(arr, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortRecursion(int []arr ,int length , int j){
        // base case array of size 1 is already sorted
        if (length == 1) return;

        // if we reached end of one pass
        if (j == length - 1) {
            // start new pass with length - 1, reset j = 0
            sortRecursion(arr, length - 1, 0);
            return;
        }

        // swap if needed
        if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }

        // move to next index in current pass
        sortRecursion(arr, length, j+1);
    }
}
