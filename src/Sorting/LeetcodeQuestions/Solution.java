package Sorting.LeetcodeQuestions;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int []arr = {0,1,2,5,6,3};

        System.out.println(Sort(arr));

    }

    static int Sort(int []arr){
        int index=0;

        while(index <arr.length){
            int elem = arr[index];
            if(arr[index] < arr.length && arr[index] != index){

                swap(index ,elem, arr);
            }
            else{
                index++;
            }
        }

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != i) {
                return i;
            }
        }

        return arr.length;
    }

    static void swap(int first , int second, int []arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]=temp;

    }
}
