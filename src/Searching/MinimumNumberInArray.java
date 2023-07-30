package Searching;

import java.util.Scanner;

public class MinimumNumberInArray {
    public static void main(String[] args) {
        //Searching.RotationCount.Searching minimum element in array
        int[] arr= new int[12];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter element in your array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
        }
        System.out.println("MinNumber in your array is "+ SearchMin(arr));
    }
    static int SearchMin(int[] ar ){
        int minNum=ar[0];
        if (ar.length==0){
            return -1;
        }
        for (int i=0; i<ar.length;i++){

         if (ar[i]<minNum) {
             minNum=ar[i];
         }
        }
        return minNum;
    }
}
