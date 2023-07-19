public class binarySearchQuestions {

    public static void main(String[] args) {
//        Q. cealing of a number
        // sealing : Smallest element in array >= target element
        //arr= {2,3,4,5,14,16,18}
        //ex : target=14 the cealing =14 target= 15 ceiling= 16
// For Binary search first we should know that the array will always be sorted- you see sorted array apply binary search
         int[] arr= {-3,-1,0,2,7,10,19,44,45,55};
        System.out.println(cealingSearch(arr,-2));


    }

    //This is only different from binary search only when the array only do not contain the target
    static int cealingSearch(int[] arr, int target) {
        int  end= arr.length-1;
        int start = 0;


        while(start<=end){  //If the target is not find then in the last condition the start will be greater then the end so in that case the start will be end+1 and there is where we find our answer if the target element is not found then the element greater than that in the array will be the answer..
            int mid = start+ (end-start)/2;
            if(arr[mid]==target){

                return arr[mid];
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }

        return arr[start];
    }


}

