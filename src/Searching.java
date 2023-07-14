import java.util.Scanner;

public class Searching {

    static int linearSearch1(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
//        THis is linear seacrh using Searching with enhanced for loop

        for (int element : arr) {
            if (element == target) {

                return element;

            }

        }

        return Integer.MAX_VALUE;
    }//--> In this we are returning not -1 because the element we searching may be -1 so for that case
//
//    }
//        static int linearSearch ( int[] arr, int target){
//            if (arr.length == 0) {
//                return -1;
//            }
//            for (int index = 0; index < arr.length; index++) {
//                int element = arr[index];
//                if (element == target) {
//                    return index;
//
//                }
//            }
//            //this will execute if none of the return statements will be returned
//            return -1;
//
//        }
        public static void main (String[]args){
            int[] arr = {12, 23, 45, 56, 7, 8, 876, 5, 43, 56};
//        What binary search say
//        Start searching from first element  and find the element
//         The best case complexity in linear search is O(1) and worst is O(N)


            Scanner in = new Scanner(System.in);

            System.out.print("Enter the number you want to search using Linear search :");
            int Number = in.nextInt();
//      if(linearSearch(arr, Number)==-1)
//      {
//          System.out.println("Element not found..");
//      }
//      else {
//          System.out.println("Element found at index:"+linearSearch(arr, Number));}


            if (linearSearch1(arr, Number) == (Integer.MAX_VALUE)) {
                System.out.println("Element not found..");
            } else {
                System.out.println("Element found " + linearSearch1(arr, Number));
            }


        }
    }

