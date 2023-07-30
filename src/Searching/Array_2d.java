package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] Array1d= new int[3];
//        for (int element: Array1d){
//            Array1d[element]= in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(Array1d));     ==> 1-Dimensionla array with advance for loop which is known as foreach loop


        int[][] arr = new int[2][2];

        System.out.println("Enter your array");
        for (int row =0;row<arr.length;row++){
            for (int col=0 ; col< arr[row].length ; col++){
                arr[row][col] = in.nextInt();
            }
        }
        for (int row =0;row<arr.length;row++){
            for (int col=0 ; col< arr[row].length ; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        for (int[] num:arr) {
                System.out.println(Arrays.toString(num));

        }

    }
}
