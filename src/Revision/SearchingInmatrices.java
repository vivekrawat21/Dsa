package Revision;

import java.util.Arrays;

public class SearchingInmatrices {
    public static void main(String[] args) {
//Searching if the 2d array is column and row wise sorted..
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println(Arrays.toString(BinarySearch(arr,12)));
    }
    static int[] BinarySearch(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 2;
        while (r < arr.length && c >= 0) {
            if (arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]< target){
                //today revision
                r++;
            }
            else {
                c--;
            }

    }
        return new int[]{-1,-1};
    }
}
