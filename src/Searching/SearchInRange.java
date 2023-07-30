package Searching;

public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 23, 34, 4, 5, 3, 3};
        int target = 5;
        int start =1;
        int end =5;

        System.out.println(linearSearch(arr,target,start,end)==-1?("Element Not found"):("Element found at index: "+linearSearch(arr,target,start,end)));



    }

    static int linearSearch(int[] arr, int target,int Start_index, int End_index) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = Start_index; index <= End_index; index++) {
            int element = arr[index];
            if (element == target) {
                return index;

            }
        }
        //this will execute if none of the return statements will be returned
        return -1;

    }

}
