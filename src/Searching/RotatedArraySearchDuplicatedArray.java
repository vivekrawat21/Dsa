package Searching;

public class RotatedArraySearchDuplicatedArray {
    public static void main(String[] args) {
        int[] arr={3,3,4,4,5,1,2,3};
//        System.out.println(findPivot(arr));
        System.out.println(search(arr,2));
    }
    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        if (pivot == -1) {
            return binarySearch(nums,target,0,nums.length-1);
        }
        //if pivot is found
        if(nums[pivot]==target){
            return pivot;
        }
        //If pivot is find then there is 3 cases to search pivot
        else if (target>= nums[0]) {
            return binarySearch(nums, target,0,pivot-1);

        }
        else {
            return binarySearch(nums,target,pivot,nums.length-1);
        }

    }


    static int findPivotWithDuplicates(int[] arr) {
        int start=0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            }
            if ( mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }

            // if elements at middle, start, aed are equal just skip the duplicates
            if (arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skip the duplicates

                //NOTE: what if these elements at staart and end were the pivot??
                //Check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }

                start++;

                //check whether end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted, so pivot should be
            else if(arr[start]<arr[mid] || arr[start]== arr[mid] && arr[mid]>arr[end]){
                start =mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }


    static int binarySearch(int[] sortedArr ,int target,int min, int max){

        while(min<=max) {
//           int  middle = (min+max)/2;  //might be possible that min + max may exceed the range of integer for that
            int middle = min+(max-min)/2;

            if (sortedArr[middle] == target) {
                //ans found
                return middle;
            } else if (target < sortedArr[middle]) {
                max = middle-1;


            } else if (target>sortedArr[middle]) {
                min = middle+1;

            }
        }

        return -1;
    }
}