package Recursion.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {23,12,123,112,11334};
        Sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void Sort(int[] arr, int low, int hii) {
        if (low>=hii){
            return;
        }
        //quick sort
        int start= low;
         int end= hii;
         int m= start+(end-start)/2;
         int pivot = arr[m];
         while(start<=end){
             while(arr[start]<pivot){
                 start++;
             }
             while(arr[end]>pivot){
                 end--;
             }
             if (start<=end){
                 int temp = arr[start];
                 arr[start]= arr[end];
                 arr[end]= pivot;
                 start++;
                 end--;
             }
         }
         //start sorting in the other two haves of the array

        Sort(arr, low, end);
         Sort(arr,start,hii);
    }
}
