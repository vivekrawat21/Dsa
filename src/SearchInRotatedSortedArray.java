public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
//approach1. Find the pivot of the array
        //Pivid = where the array is starting to change or the largest no. in the array|| form where the numbers are ascending
        // then search in the first half of the arrray and after that search in the second half of the array because first and second half is then sorted.
        // ex- arr=[11,12,13,1,2,3,4,5,6,7,8]--> In this case the pivit is 13 so before pivit the array is sorted and after pivit it is sorted also.


        //Ouestion is Find pivot

        int[] arr={3,1};
//        System.out.println(findPivot(arr));
        System.out.println(search(arr,1));
    }
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
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
    static int findPivot(int[] arr) {
        int start=0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            } else if ( mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            } else if (arr[start] >= arr[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
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

