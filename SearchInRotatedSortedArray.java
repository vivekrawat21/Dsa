public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
//approach1. Find the pivot of the array
        //Pivid = where the array is starting to change or the largest no. in the array|| form where the numbers are ascending
        // then search in the first half of the arrray and after that search in the second half of the array because first and second half is then sorted.
        // ex- arr=[11,12,13,1,2,3,4,5,6,7,8]--> In this case the pivit is 13 so before pivit the array is sorted and after pivit it is sorted also.


        //Ouestion is Find pivot

        int[] arr={12,13,14,15,16,3,4,5,6,7,8,9,10,11};
        System.out.println(findPivot(arr));
    }
    static int findPivot(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            //4 cases here
            mid= start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){ //In this mid should be less than end otherwise out of bound error
                return mid;

            } else if ( mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;

            } else if (arr[mid]<=arr[start]) {
              end= mid-1;
            } else {
                start= mid+1;
            }

        }
        return -1;
    }
//
//    static int SearchInPivot(int arr[], int target) {
//
//    }

}
