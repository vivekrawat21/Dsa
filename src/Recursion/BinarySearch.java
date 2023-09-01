package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,5,8,10,18};
        System.out.println(Search(arr,18,arr.length-1,0));


    }

    static int Search(int[] arr, int target, int end ,int start){

        if (start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
         if (arr[mid]>target){
            return Search(arr, target, mid-1,start);

        }
       else if (arr[mid]<target){
            return Search(arr,target,end,mid+1);

        }

        return mid;
    }
}
