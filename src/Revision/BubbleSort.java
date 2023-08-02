package Revision;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {
        int []arr={1,2,3,4,8,7,7,8,9};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
//    making it more efficient
    static void Sort(int[] arr){
     for (int i=0;i<arr.length;i++){
         boolean swapped= false;
         for(int j=0; j<arr.length-i-1;j++){
             if(arr[j]>arr[j+1]){
                 int temp = arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                 swapped =true;
             }

             }
         if(swapped==false){
             break;
         }

     }

    }
}
//Today revision