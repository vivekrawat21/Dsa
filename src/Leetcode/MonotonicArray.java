package Leetcode;

public class MonotonicArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};

        System.out.println(isMonotonic(arr));

    }
       static boolean isMonotonic(int[] nums) {
            boolean increasing = false;
            boolean decreasing = false;
            for(int i = 0; i<nums.length-1 ; i++){

                if(nums[i+1] < nums[i] ){

                    increasing  = true;


                }
                if(nums[i+1] > nums[i] ){
                    decreasing = true;

                }

                if(increasing == true && decreasing==true){
                    return false;
                }

            }

            return true;
        }
    }

