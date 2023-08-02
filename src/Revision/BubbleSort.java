package Revision;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {
        int []arr={1,3,4,5,6,123,2,14,6,7,43,5};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] arr){
     for (int i=0;i<arr.length;i++){
         for(int j=0; j<arr.length-i-1;j++){
             if(arr[j]>arr[j+1]){
                 int temp = arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
         }
     }

    }
}
//Today revision