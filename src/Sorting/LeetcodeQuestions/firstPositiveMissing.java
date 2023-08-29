package Sorting.LeetcodeQuestions;

public class firstPositiveMissing {
    public static void main(String[] args) {
        int []arr = {-1,-2,1,2,4,6};
        System.out.println(firstMissingPositive(arr));

    }
    static int firstMissingPositive(int[] nums) {
        int index =0;
        while(index<nums.length){
            int correctIndex= nums[index]-1;

            if(nums[index] > 0 && nums[index] < nums.length  && nums[index]!=nums[correctIndex]){
                Swap(index,correctIndex,nums);
            }
            else{
                index++;
            }

        }
        int ans=0 ;

        for(int i=0; i<nums.length;i++){
            if(nums[i]!= i+1){

                ans = i+1;
                break;

            }
        }
        return ans;

    }

    static void Swap(int First, int Second, int [] arr){

        int temp = arr[First];
        arr[First]= arr[Second];
        arr[Second]= temp;
    }

}
