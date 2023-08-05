package Revision;

import java.util.Arrays;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5}, {7, 8, 9, 12, 14}, {15, 18, 25, 39, 41}, {45, 65, 73, 79, 82}, {85, 86, 87, 88, 94}};
        System.out.println(Arrays.toString(search(matrix, 1)));
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows == 1) {
            simpleBinarySearch(matrix, 0, 0, cols - 1, target);

        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        //run the loop till two loops are remaining..
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};

            }

            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        //now we have two rows is remaining
        //check whether the target is in the col of 2 tows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }
        //Search in first half
        if (target <= matrix[rStart][cMid - 1]) {
            return simpleBinarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        //search in second half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return simpleBinarySearch(matrix, rStart, cMid + 1, cols - 1, target);

        }
        //search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return simpleBinarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        //search in 4th half
        else {
            return simpleBinarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }

    }

    //Search in the row provided between the col provided
    static int[] simpleBinarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] > target) {
                cEnd = mid - 1;

            } else {
                cStart = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
}