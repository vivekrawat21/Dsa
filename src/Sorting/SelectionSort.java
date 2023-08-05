package Sorting;

import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        //In this selection sort as the name suggest firstly we select the largest/smallest element and then swapped it with the correct index.
        //Select and sort the element.
        //complexity  is how many comparison
        //Total no. of comparison is (n-1) so the worst time complexity is O(n^2) the best case in selection sort is also O(n^2)
//It perform well on small lists/array
int[] arr= {4,12,23,1};
      Sort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void Sort(int[] arr){
        for (int i=0;i<arr.length;i++){
            //find the maximum item in the remaining array and swap it with correct index
            int first =0;
            int last= arr.length-i-1;
            int maxIndex = getMaxIndex(arr,first,last);
           swap(arr,maxIndex,last);


        }



    }
    static void swap(int[] arr, int maxIndex ,int lastIndex){
        int temp= arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex]=temp;
    }
     static int getMaxIndex(int []arr, int firstIndex,int lastIndex){

        int max = firstIndex;
        for (int i = 0; i <=lastIndex ; i++) {
           if (arr[max]<arr[i]){
            max= i;
           }
        }

        return max;
    }

}
