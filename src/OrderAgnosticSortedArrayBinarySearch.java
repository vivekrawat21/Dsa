import java.util.Scanner;

public class OrderAgnosticSortedArrayBinarySearch { //OrderAgnosticSortedArray means if array is sorted in ascending and descending we don't know
    public static void main(String[] args) {
        int[] arr = {74,33,22,11,2,1,0,-1,-20,-40};



        Scanner in = new Scanner(System.in);
        System.out.print("Enter the element you want to search: ");
        int num = in.nextInt();


        System.out.println(Search(arr,num)==-1?("Element is not found"):(num+" is found at index "+ Search(arr,num)));




    }
    static int Search(int[] sortedArr ,int target){

        int min= 0;
        int max= sortedArr.length-1;
        if (sortedArr[min]<sortedArr[max]) {
            while (min <= max) {
//           int  middle = (min+max)/2;  //might be possible that min + max may exceed the range of integer for that
                int middle = min + (max - min) / 2;

                if (sortedArr[middle] == target) {
                    //ans found
                    return middle;
                } else if (target < sortedArr[middle]) {
                    max = middle - 1;


                } else if (target > sortedArr[middle]) {
                    min = middle + 1;

                }
            }
        }
        else {
            while (min <= max) {
//           int  middle = (min+max)/2;  //might be possible that min + max may exceed the range of integer for that
                int middle = min + (max - min) / 2;

                if (sortedArr[middle] == target) {
                    //ans found
                    return middle;
                } else if (target > sortedArr[middle]) {
                    max = middle - 1;


                } else if (target < sortedArr[middle]) {
                    min = middle + 1;

                }
            }


        }

        return -1;
    }

    }
