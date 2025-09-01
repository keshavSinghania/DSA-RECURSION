public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,454,4,2,56};
        int key  = 40;

        System.out.println(isPresent(arr,key,0));
    }

    //function to find key using linear search using recursion
    static boolean isPresent(int[] arr, int search, int idx){
        //base condition
        if(arr.length == idx) return false;
        if(arr[idx] == search){
            return true;
        }else{
            return isPresent(arr,search,idx+1);
        }
    }
}
