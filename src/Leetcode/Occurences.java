package Leetcode;

import java.util.Arrays;

public class Occurences {
    public static void main(String[] args) {
        int[] arr= {1,2,2,3,3,4,4,4,5};
        int target = 4;

        System.out.println(Arrays.toString(FirstAndLastIndex(arr,target)));
    }
    static  int[] FirstAndLastIndex (int[] nums, int target){
       int[] ans= {-1,-1};
//     int[] ans;

        int startIndex= search(nums,target,true);
        int lastIndex = search(nums,target,false);
        ans[0]=startIndex;
        ans[1]= lastIndex;


        return ans;

    }
    static int search(int[] nums, int target, boolean isFirstIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid; // Update ans whenever target is found

                if (isFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }


        return ans;
    }
}
