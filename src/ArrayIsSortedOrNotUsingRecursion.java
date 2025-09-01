import java.util.Arrays;
import java.util.Scanner;

public class ArrayIsSortedOrNotUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element sof your array");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr,0,size-1));
    }

    //function to check weather array is sorted or not
    static boolean isSorted(int[] arr, int start , int end){
        if(start==end) return true;
        if(arr[start] <= arr[start+1]){
            return isSorted(arr,start+1,end);
        }else{
            return false;
        }
    }
}
