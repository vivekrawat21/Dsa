package Recursion.RecursionArray;

import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr= {-20-1,0,1,2,2,3,5,8,9,20};
        String print = isSorted(arr)?"Array is Sorted":"Array is not sorted";
        System.out.println(print);
    }

    private static boolean isSorted(int[] arr) {
        int index =0;
    if(helperr(arr,index)){
        return true;
    }
    return false;

    }

    private static boolean helperr(int[] arr, int index) {
        if (index == arr.length-1){
            return true;
        } else{
           return arr[index]<=arr[index+1] && helperr( arr, ++index);
        }


    }
}
