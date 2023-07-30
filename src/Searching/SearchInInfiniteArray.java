package Searching;

import java.util.Scanner;

public class SearchInInfiniteArray {
    public static void main(String[] args) {


            int[] arr = {11,12,22,33,45,55,63,74,77,99,123,124,126,1225,122224,12222224,22222222,222222223,222222224};
//            if the array is infinite then we will start from the array of length 2 , [0,1]
        int target= 122224;
        System.out.println(ans(arr,target));




        }
        static int ans(int []arr,int target){
//        find the range
//            first start with box of two
            int start =0;
            int end=1;
            //Condition for finding the target
         while(target> arr[end]){
             int newStart= end+1; // This is the new start
             //double the box value
             //end = previousend + size of box*2
             end = end+(end-start +1)*2;  //here i want to use the old start so we state new variable start
             start = newStart;
         }
        return Search(arr,target,start,end);
        }
        static int Search(int[] sortedArr ,int target,int start , int end){


            while(start<=end) {
//           int  middle = (min+max)/2;  //might be possible that min + max may exceed the range of integer for that
                int middle = start+(end-start)/2;

                if (sortedArr[middle] == target) {
                    //ans found
                    return middle;
                } else if (target < sortedArr[middle]) {
                    end = middle-1;


                } else if (target>sortedArr[middle]) {
                    start= middle+1;

                }
            }

            return -1;
        }


}
