package Searching;

public class binarySearchQuestions {

    public static void main(String[] args) {
//        Q. cealing of a number
        // sealing : Smallest element in array >= target element
        //arr= {2,3,4,5,14,16,18}
        //ex : target=14 the cealing =14 target= 15 ceiling= 16
// For Binary search first we should know that the array will always be sorted-  you see sorted array apply binary search
         int[] arr= {-3,-1,0,2,7,10,19,44,45,55};
         int num=-10;
        System.out.println(cealingSearch(arr,num)==-1?("The cealing is not found because the target is greater than the greatest element of the array"):("cealing of the array is: "+ cealingSearch(arr,num)));

        System.out.println(floorSearch(arr,num)==-1?("The floor is not found because the target is smaller than the smallest element of the array"):("floor of the array is: "+ floorSearch(arr,num)));



    }

    //This is only different from binary search only when the array only do not contain the target
    static int cealingSearch(int[] arr, int target) {

        //Cealing is basically a number which is the biggest no. which is smaller than or equal to the target number.

        if (target>arr[arr.length-1]){
            return -1;   // This condition is for when the target is greater than the greatest element of the array so ceiling will not be found in that case
        }
        int  end= arr.length-1;
        int start = 0;


        while(start<=end){  //If the target is not find then in the last condition the start will be greater than the end so in that case the start will be end+1 and there is where we find our answer if the target element is not found then the element greater than the target will be the answer..
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

        return arr[start];// In this we returned start because in the end the start is the number which is just greater than the target
    }

    static int floorSearch(int []arr, int target){
//  Basically floor is a number which is biggest/greatest number which is smaller than or equal to the target element
        if (target<arr[0]){
            return -1;   // This condition is for when the target is smaller than the smallest element of the array so floor will not be found in that case
        }

        int  end= arr.length-1;
        int start = 0;


        while(start<=end){  //If the target is not find then in the last condition the start will be greater than the end so in that case the end will be start-1 and there is where we find our answer if the target element is not found then the element just smaller than that in the target will be the answer..
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

        return arr[end];// In this case we put end because floor means the number which is equal to or just smaller than of the target element

    }


}

