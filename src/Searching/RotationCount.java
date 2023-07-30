package Searching;

import java.util.Scanner;

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

    public static class Searching {

    //    static int linearSearch1(int[] arr, int target) {
    //        if (arr.length == 0) {
    //            return -1;
    //        }
    ////        THis is linear seacrh using Searching.RotationCount.Searching with enhanced for loop
    //
    //        for (int element : arr) {
    //            if (element == target) {
    //
    //                return element;
    //
    //            }
    //
    //        }
    //
    //        return Integer.MAX_VALUE;
    //    }//--> In this we are returning not -1 because the element we searching may be -1 so for that case
    //
    //    }
            static int linearSearch ( int[] arr, int target){
                if (arr.length == 0) {
                    return -1;
                }
                for (int index = 0; index < arr.length; index++) {
                    int element = arr[index];
                    if (element == target) {
                        return index;

                    }
                }
                //this will execute if none of the return statements will be returned
                return -1;

            }
            public static void main (String[]args){
                int[] arr = {12, 23, 45, 56, 7, 8, 876, 5, 43, 56};
    //        What binary search say
    //        Start searching from first element  and find the element
    //         The best case complexity in linear search is O(1) and worst is O(N)


                Scanner in = new Scanner(System.in);

                System.out.print("Enter the number you want to search using Linear search :");
                int Number = in.nextInt();
          if(linearSearch(arr, Number)==-1)
          {
              System.out.println("Element not found..");
          }
          else {
              System.out.println("Element found at index:"+linearSearch(arr, Number));}


    //            if (linearSearch1(arr, Number) == (Integer.MAX_VALUE)) {
    //                System.out.println("Element not found..");
    //            } else {
    //                System.out.println("Element found " + linearSearch1(arr, Number));
    //            }


            }
        }
}
