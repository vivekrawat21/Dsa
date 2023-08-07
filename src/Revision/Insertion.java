package Revision;

import java.util.Arrays;

public class Insertion {

    public static void main(String[] args) {
        int[] arr ={2,3,3,4,5,6,7,8,9,9,654,322322,2,3,-33,-10,0,-2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for (int i=0; i<=arr.length-2;i++){
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else if(arr[j]>arr[j-1]){
                    break;

                }
            }
        }

    }
}
