package Sorting.LeetcodeQuestions;

import java.util.Arrays;

public class DuplicatIndexandElement {
    public static void main(String[] args) {
        int [] nums = {1,2,1,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
        public static int[] findErrorNums(int[] nums) {

            int index = 0;

            for(index = 0; index < nums.length ; index++ ){

                int correctIndex = nums[index]-1;

                if(nums[index]!= nums[correctIndex]){
                    Swap (index,correctIndex, nums);
                }
                else{

                    index++;
                }
            }
            int []arr = new int[2];
            for(int i = 0; i<arr.length; i++){
                if(nums[i]!= i+1){
                    arr[0] = nums[i];
                    arr[1] = nums[i]+1;
                    break;
                }

            }
            return arr;

        }
       static void Swap(int first, int second , int [] nums){
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }

    }