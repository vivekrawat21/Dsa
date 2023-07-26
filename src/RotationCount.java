public class RotationCount {

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        //This will return 0 cause this is not rotated. cause(-1+1 = 0)
        System.out.println(countRotations(arr));
    }
    private static int countRotations(int[] arr){
int pivot = findPivotWithDuplicates(arr);
return pivot+1;
    }

    //for  array contains duplicates
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

}
