package Recursion.RecursionArray;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2, 3, 45, 3, 21, 21, 33, 234};
        System.out.print("Enter the target you want to search: ");

        int target = in.nextInt();

        String finded = Search(arr, target, 0) ? target + " is present at index from first is: " : "The target is not present in the array!";
        System.out.println(finded + FindIndex(arr, target, 0));

        String findedd = Search(arr, target, 0) ? target + " is present at index from Last is: " : "The target is not present in the array!";
        System.out.println(findedd + FindFromLastIndex(arr, target, arr.length - 1));

        ArrayList <Integer> ans = new ArrayList<>();
        ans = FindIndexList(arr, target, 0, new ArrayList<>());
        System.out.println(ans);
    }

    private static int FindIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        } else if (arr[index] == target) {

            return index;

        } else {
            return FindIndex(arr, target, ++index);
        }

    }

    private static boolean Search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        } else {
            return arr[index] == target || Search(arr, target, index + 1);
        }

    }

    private static int FindFromLastIndex(int[] arr, int target, int index) {
        if (index < 0) {
            return -1;
        } else if (arr[index] == target) {

            return index;

        } else {
            return FindFromLastIndex(arr, target, index - 1);
        }

    }

    private static ArrayList<Integer> FindIndexList(int[] arr, int target, int index, ArrayList<Integer> list) {

        if (index == arr.length) {
            return list;
        }  if (arr[index] == target) {

            list.add(index);

        }
        return FindIndexList(arr, target, ++index, list);


    }
}
