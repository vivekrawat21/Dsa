package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //Bubble sort also known as sinking sort and exchange sort
        //Sorting may be ascending or descending
        //Time complexity of bubble sort is best case = O(n^2) and worst case=O(n^2)
        // As the size of array is growing the no. of comparision also growing it is called time complexity
        //space complexity of bubble sort is O(1) constant no extra space require i.e copying the array etc. not required
        //This is also known as inplace sorting algorithm because its space complexity is constant.
        //When array is sorted then the time complexity will be equal to best case
        // When the original order is maintained if the two or more elements are equal then it is stable sorted array otherwise it is unstable sorted array
        int[] arr= {1,24,5,4,66,7,4,44,54};
        Sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sorting(int[] arr) {
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            //for each stem max item will come at the last respective
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

            }
        }
    }
}
