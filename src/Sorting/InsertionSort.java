package Sorting;

import java.util.Arrays;

public class InsertionSort {

    //After every pass array is getting sorted....
    public static void main(String[] args) {

        int[] arr = {2,1,3,5,8,3,23,23,33,22,21};
        sortInsertion(arr);
        System.out.println(Arrays.toString(arr));



    }
    static void sortInsertion(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j =i+1; j > 0; j--) {
                if (arr[j-1]>arr[j]){
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                }
                else if(arr[j-1]<arr[j]) {
                    break;
                }
            }

        }

    }
}
