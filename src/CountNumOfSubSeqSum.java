public class CountNumOfSubSeqSum {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int sum = 3; //ans = 2 i.e count
        System.out.println(count(arr, arr.length, 0 , sum, 0));
    }

    //function to count number of sub seq is equal to given sum
    static int  count(int[] arr , int size , int idx , int sum , int s){
        //base condition
        if(size == idx){
            if(s == sum){
                return 1;
            }else{
                return 0;
            }
        }

        //take
        s += arr[idx];
        int l = count(arr, size, idx+1, sum, s );

        //not take case
        s -= arr[idx];
        int r = count(arr, size, idx+1, sum , s);
        return  l+r;
    }
}
