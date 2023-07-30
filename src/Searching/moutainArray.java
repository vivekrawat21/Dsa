package Searching;

import java.util.Scanner;

public class moutainArray { //also known as bitonic/ mountain array

    //First it's increasing then decreasing.
    //we have to find the peak of  or highest number in this array
    //for finding that first we have to apply binary search on both sides
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
        System.out.println(mountainPeak(arr)==-1?("The element is not found"):("The peak index of the array is: "+ mountainPeak(arr)));
    }

    static int mountainPeak(int[] arr) {
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
               end =mid;
            }
            else {
                start= mid+1;
            }

        }
        return start;

    }


}
