package Revision;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
   int [] arr ={1,2,3,4};
   sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int first= 0;
           int NewmaxIndex = getMaxIndex(arr, first,last);
           int temp = arr[NewmaxIndex];
           arr[NewmaxIndex]= arr[last];
           arr[last]= temp;

        }

    }
    static int getMaxIndex(int[] arr, int FirstIndex, int LastIndex){
        int max=FirstIndex;
        for (int i= 0; i<=LastIndex;i++){

            if(arr[max]<arr[i]){
                 max = i;
            }
        }
        return max;
    }
}
