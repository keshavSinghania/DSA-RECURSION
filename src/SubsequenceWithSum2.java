import java.util.ArrayList;
import java.util.List;

public class SubsequenceWithSum2 {
    public static void main(String[] args) {
        int [] arr = {1,2,1}; //ans = {1,1} and {2}
        int size = arr.length;
        List<Integer> l = new ArrayList<>();
        subSeq(arr, l, 0 , 2, 0);

    }
    //function to print subsequence with sum == 2
    static void subSeq(int []arr,List<Integer> l, int idx, int s ,int sum){
        //base condition
        if(idx == arr.length){
            if(s == sum){
                System.out.println(l);
            }
            return;
        };

        //take
        l.add(arr[idx]);
        sum += arr[idx];
        subSeq(arr , l , idx+1, s , sum);

        l.removeLast();
        sum -= arr[idx];
        subSeq(arr , l , idx+1, s , sum);
    }
}
