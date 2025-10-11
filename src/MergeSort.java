//class Solution {
//    //have to sort array using merge sort ( divide and merge method)
//    public int[] sortArray(int[] nums) {
//        mergeSort(nums, 0, nums.length - 1);
//        return nums;
//    }
//    //function to sort array using mergeSort
//    void mergeSort(int[] arr , int start , int end){
//        //base condition
//        if(start >= end){
//            return;
//        }
//        int mid = (start + end)/2 ;
//
//        //dividing left
//        mergeSort(arr, start, mid);
//
//        //dividing right
//        mergeSort(arr, mid+1, end);
//
//
//        //merge current both sorted array that is [start -> mid] and [mid+1 -> end]
//        merge(arr, start, mid, mid+1, end);
//    }
//
//    //function to merge two sorted array
//    void merge(int[] arr, int start1, int end1 , int start2, int end2){
//        int [] temp = new int[end2- start1 + 1];
//        int currIdx = 0;
//        int idxLeft = start1;
//        int idxRight = start2;
//        while(idxLeft <= end1 && idxRight <= end2){
//            if(arr[idxLeft] < arr[idxRight]){
//                temp[currIdx++] = arr[idxLeft++];
//            }else{
//                temp[currIdx++] = arr[idxRight++];
//            }
//        };
//        //rest element left
//        while(idxLeft <= end1){
//            temp[currIdx++] = arr[idxLeft];
//            idxLeft++;
//        }
//        //rest element right
//        while(idxRight <= end2){
//            temp[currIdx++] = arr[idxRight];
//            idxRight++;
//        }
//        // return new merged sorted array
//        for(int i=0; i<temp.length; i++){
//            arr[start1+i] = temp[i];
//        }
//    }
//}