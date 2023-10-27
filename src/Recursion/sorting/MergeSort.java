package Recursion.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {24, 1, 21, 2, 3,};
        System.out.println(Arrays.toString(sort(arr)));
    }

    private static int[] sort(int[] arr) {
        if (arr.length==1){
            return arr;
        }
        int mid = arr.length/2;

        int []left= sort(Arrays.copyOfRange(arr,0,mid));
         int []right =sort(Arrays.copyOfRange(arr,mid,arr.length));
         return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0,j =0,k=0;
        while(i <left.length&&j<right.length){
            if (left[i]<right[j]){
                merged[k]=left[i];
                i++;
            }
          else{
                merged[k]=right[j];
                j++;

            }
            k++;
        }
        //If some of the numbers were left in any of the array.

        while(i<left.length){
            merged[k]=left[i];
            i++;
        }

        while(j<right.length){
            merged[k]=right[j];
            j++;
        }
        return merged;
    }
}
